package com.xiyuan.taobao.api.internal.feature;

import com.xiyuan.taobao.api.*;
import com.xiyuan.taobao.api.internal.parser.json.ObjectJsonParser;
import com.xiyuan.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.xiyuan.taobao.api.internal.util.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ������������
 */
public abstract class BatchFeature {

    public static final String BATCH_API_HEADER_SPLIT = "top-api-separator"; // ����API�û��Զ���ָ���Header Key
    public static final String BATCH_API_PUBLIC_PARAMETER = "#PUBLIC#"; // ����API��������ͷ
    public static final String BATCH_API_DEFAULT_SPLIT = "\r\n-S-\r\n";// ����APIĬ�Ϸָ���

    private String batchServerUrl;
    private String batchApiSeparator; // �Զ�������API�ָ���

    private DefaultTaobaoClient client;

    public void init(String batchServerUrl, final DefaultTaobaoClient client) {
        this.batchServerUrl = batchServerUrl;
        this.client = client;
    }

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException {
        if (request instanceof TaobaoBatchRequest) {
            return _execute(request, session);
        } else {
            return clientExecute(request, session);
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private <T extends TaobaoResponse> T _execute(TaobaoRequest<T> tRequest, String session) throws ApiException {
        TaobaoBatchRequest batchRequest = (TaobaoBatchRequest) tRequest;
        long start = System.currentTimeMillis();

        List<TaobaoRequest<?>> requestList = batchRequest.getRequestList();
        if (requestList == null || requestList.isEmpty()) {
            throw new ApiException("40", "client-error:api request list is empty");
        }

        // ����У���������
        if (client.isNeedCheckRequest() && batchRequest.getPublicParams().isEmpty()) {
            for (int i = 0; i < requestList.size(); i++) {
                try {
                    requestList.get(i).check();
                } catch (ApiRuleException e) {
                    return (T) new TaobaoBatchResponse(e.getErrCode(), "API NO. " + (i + 1) + ": " + e.getErrMsg());
                }
            }
        }

        // ���Э�鼶�������
        RequestParametersHolder requestHolder = new RequestParametersHolder();
        TaobaoHashMap protocalMustParams = new TaobaoHashMap();
        protocalMustParams.put(Constants.VERSION, "2.0");
        protocalMustParams.put(Constants.APP_KEY, client.getAppKey());
        Long timestamp = batchRequest.getTimestamp();
        if (timestamp == null) {
            timestamp = System.currentTimeMillis();
        }
        protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
        requestHolder.setProtocalMustParams(protocalMustParams);

        TaobaoHashMap protocalOptParams = new TaobaoHashMap();
        protocalOptParams.put(Constants.FORMAT, client.getFormat());
        protocalOptParams.put(Constants.SIGN_METHOD, client.getSignMethod());
        protocalOptParams.put(Constants.SESSION, session);
        protocalOptParams.put(Constants.PARTNER_ID, client.getSdkVersion());
        protocalOptParams.put(Constants.TARGET_APP_KEY, batchRequest.getTargetAppKey());
        if (Constants.FORMAT_JSON.equals(client.getFormat()) && client.isUseSimplifyJson()) {
            protocalOptParams.put(Constants.SIMPLIFY, Boolean.TRUE.toString());
        }
        requestHolder.setProtocalOptParams(protocalOptParams);

        // ����Զ���ָ���
        String separator = BATCH_API_DEFAULT_SPLIT;
        if (batchApiSeparator != null) {
            batchRequest.putHeaderParam(BATCH_API_HEADER_SPLIT, separator = batchApiSeparator);
        }
        // �Ƿ���Ҫѹ����Ӧ
        if (client.isUseGzipEncoding()) {
            batchRequest.putHeaderParam(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
        }

        try {
            // ��ӹ�������ͷ
            if (batchRequest.getPublicMethod() != null) {
                batchRequest.addPublicParam(Constants.METHOD, batchRequest.getPublicMethod());
            } else {
                if (isSameRequest(requestList)) {
                    batchRequest.addPublicParam(Constants.METHOD, requestList.get(0).getApiMethodName());
                }
            }

            // ����������������
            StringBuilder requestBody = new StringBuilder();
            String publicParamStr = WebUtils.buildQuery(batchRequest.getPublicParams(), Constants.CHARSET_UTF8);
            if (!StringUtils.isEmpty(publicParamStr)) {
                requestBody.append(BATCH_API_PUBLIC_PARAMETER).append(publicParamStr).append(separator);
            }

            // ��װÿ��API���������
            for (int i = 0; i < requestList.size(); i++) {
                TaobaoRequest<?> request = requestList.get(i);
                request.setBatchApiOrder(i);
                Map<String, String> apiParams = request.getTextParams();
                // ����API�ķ���������API�Ĺ���������һ�£���ô��Ҫ���õ���API�ķ������
                if (request.getApiMethodName() != null && !request.getApiMethodName().equals(batchRequest.getPublicMethod())) {
                    apiParams.put(Constants.METHOD, request.getApiMethodName());
                }
                if (request.getBatchApiSession() != null) {
                    apiParams.put(Constants.SESSION, request.getBatchApiSession());
                }
                if (request.getTargetAppKey() != null) {
                    apiParams.put(Constants.TARGET_APP_KEY, request.getTargetAppKey());
                }
                String apiParamStr = WebUtils.buildQuery(apiParams, Constants.CHARSET_UTF8);
                if (StringUtils.isEmpty(apiParamStr)) {
                    apiParamStr = "N";
                }
                requestBody.append(apiParamStr);
                if (i != (requestList.size() - 1)) {
                    requestBody.append(separator);
                }
            }

            String apiBody = requestBody.toString();

            // ���ǩ�����
            protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequestWithBody(requestHolder, apiBody, client.getAppSecret(), client.getSignMethod()));

            // ������������
            String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
            String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
            String fullUrl = WebUtils.buildRequestUrl(this.batchServerUrl, sysMustQuery, sysOptQuery);
            HttpResponseData data = WebV2Utils.doPost(fullUrl, apiBody, Constants.CHARSET_UTF8, client.getConnectTimeout(), client.getReadTimeout(), batchRequest.getHeaderMap());
            requestHolder.setResponseBody(data.getBody());
        } catch (IOException e) {
            TaobaoLogger.logApiError(client.getAppKey(), "BatchApi", batchServerUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
            throw new ApiException(e);
        }

        // ������Ӧ������
        List<TaobaoParser<?>> parserList = new ArrayList<TaobaoParser<?>>();
        if (client.isNeedEnableParser()) {
            if (Constants.FORMAT_XML.equals(client.getFormat())) {
                for (int i = 0; i < requestList.size(); i++) {
                    parserList.add(new ObjectXmlParser(requestList.get(i).getResponseClass()));
                }
            } else {
                for (int i = 0; i < requestList.size(); i++) {
                    parserList.add(new ObjectJsonParser(requestList.get(i).getResponseClass(), client.isUseSimplifyJson()));
                }
            }
        }

        TaobaoBatchResponse batchResponse = new TaobaoBatchResponse();
        batchResponse.setBody(requestHolder.getResponseBody());

        String[] responseArray = batchResponse.getBody().split(separator);
        // ����API���ߵ�ͨ����֤ʱûͨ����ǰ����֤����ʱֻ��һ��������Ϣ
        if (responseArray.length > 0 && responseArray.length != requestList.size()) {
            if (client.isNeedEnableParser()) {
                TaobaoResponse tRsp = (TaobaoResponse) parserList.get(0).parse(responseArray[0], Constants.RESPONSE_TYPE_TOP);
                batchResponse.setErrorCode(tRsp.getErrorCode());
                batchResponse.setMsg(tRsp.getMsg());
                batchResponse.setSubCode(tRsp.getSubCode());
                batchResponse.setSubMsg(tRsp.getSubMsg());
            } else {
                batchResponse.setMsg("batch api call fail");
            }
            return (T) batchResponse;
        }

        for (int i = 0; i < responseArray.length; i++) {
            TaobaoResponse tRsp = null;
            if (client.isNeedEnableParser()) {
                tRsp = (TaobaoResponse) parserList.get(i).parse(responseArray[i], Constants.RESPONSE_TYPE_TOP);
                tRsp.setBody(responseArray[i]);
            } else {
                try {
                    tRsp = requestList.get(i).getResponseClass().newInstance();
                    tRsp.setBody(responseArray[i]);
                } catch (Exception e) {
                    throw new ApiException(e);
                }
            }
            tRsp.setParams(requestList.get(i).getTextParams());
            batchResponse.addResponse(tRsp);
        }

        if (!batchResponse.isSuccess()) {
            TaobaoLogger.logApiError(client.getAppKey(), "BatchApi", batchServerUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, batchResponse.getBody());
        }
        return (T) batchResponse;
    }

    /**
     * �ж�����API�����Ƿ�ȫ������ͬһ�����͵�API��
     */
    private boolean isSameRequest(List<TaobaoRequest<?>> requestList) {
        if (requestList != null && requestList.size() > 1) { // ֻ�����������ϵ�����ſ��Ǻϲ�
            String firstMethod = requestList.get(0).getApiMethodName();
            for (int i = 1; i < requestList.size(); i++) {
                String currentMethod = requestList.get(i).getApiMethodName();
                if (!firstMethod.equals(currentMethod)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * ��������API������Զ���ָ���
     */
    public void setBatchApiSeparator(String batchApiSeparator) {
        this.batchApiSeparator = batchApiSeparator;
    }

    public String getBatchServerUrl() {
        return batchServerUrl;
    }

    public void setBatchServerUrl(String batchServerUrl) {
        this.batchServerUrl = batchServerUrl;
    }

    public abstract <T extends TaobaoResponse> T clientExecute(TaobaoRequest<T> request, String session) throws ApiException;
}
