/*
 * 版权所有 (C) 2018 知启蒙(ZHIQIM) 保留所有权利。
 * 
 * 欢迎到知启蒙网站（https://www.zhiqim.com）购买正版软件，知启蒙还提供许多开源框架和软件。
 * 
 * 1、本软件产品所有源代码受《中华人民共和国著作权法》和其他有关法律、法规的保护，其所有知识产权归湖南知启蒙科技有限公司所有； 2、禁止复制和修改。不得复制修改、翻译或改编本软件所有源代码，或者基于本软件产品创作衍生作品； 3、禁止进行逆向工程。不得对本软件的源代码进行逆向工程、反编译或试图以其他方式发现软件的源代码；
 * 4、个别授权：如需进行商业性的销售、复制、分发，包括但不限于软件销售、预装、捆绑等，必须获得知启蒙的书面授权和许可； 5、保留权利：本注释未明示授权的其他一切权利仍归知启蒙所有，任何人使用其他权利时必须获得知启蒙的书面同意。
 */
package com.xiyuan.taobao.api;

import org.zhiqim.kernel.constants.HttpConstants;
import org.zhiqim.kernel.httpclient.HttpClient;
import org.zhiqim.kernel.httpclient.HttpPost;
import org.zhiqim.kernel.httpclient.HttpUpload;
import org.zhiqim.kernel.logging.Log;
import org.zhiqim.kernel.logging.LogFactory;

public class TaobaoClient implements HttpConstants
{
    private static final Log log = LogFactory.getLog(TaobaoClient.class);

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> req)
    {
        T resp = req.getResponse();

        req.buildSign(TaobaoServer.getServer().getAppKey(), TaobaoServer.getServer().getAppSecret());
        String queryString = req.buildQueryString();

        HttpClient client = null;
        if ((req instanceof TaobaoUploader))
        {
            TaobaoUploader upload = (TaobaoUploader) req;
            String fieldName = upload.getFieldName();
            String fileName = upload.getFileName();
            byte[] fileContent = upload.getContent();
            String suffix = upload.getSuffix();

            HttpUpload conn = new HttpUpload(TaobaoServer.getServer().getCurrentApiPath());
            conn.setMimeType("img/" + suffix);
            conn.setQueryString(queryString, true);
            conn.setContent(fieldName, fileName, fileContent, "UTF-8");
            client = conn;
        }
        else
        {
            HttpPost conn = new HttpPost(TaobaoServer.getServer().getCurrentApiPath());
            if (TaobaoServer.getServer().isForward())
            {
                conn.setQueryString(queryString, "text/plain", "UTF-8");
            }
            else
            {
                conn.setQueryString(queryString, "UTF-8");
            }
            client = conn;
        }
        client.setConnectTimeout(TaobaoServer.getServer().getAppConnectTimeout());
        client.setReadTimeout(TaobaoServer.getServer().getAppReadTimeout());
        client.execute();

        int responseStatus = client.getResponseStatus();
        String responseText = client.getResponseText();
        if (responseStatus != 200)
        {
            log.error("调用淘宝接口HTTP错误,错误码[" + responseStatus + "],请求:[" + req.toString() + "]");

            resp.buildResponseError(2, "淘宝HTTP响应错误", String.valueOf(responseStatus), responseText, req.getClass().toString());
            return resp;
        }
        resp.buildResponseText(responseText);
        if (!resp.isSuccess())
        {
            log.error("调用淘宝接口时淘宝响应错误信息,请求:[" + req.toString() + "],响应[" + resp.toString() + "]");
            //在此处记录调用失败
        }
        return resp;
    }
}
