package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.CainiaoCloudprintClientinfoPutResponse;

/**
 * TOP API: cainiao.cloudprint.clientinfo.put request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CainiaoCloudprintClientinfoPutRequest extends BaseTaobaoRequest<CainiaoCloudprintClientinfoPutResponse> {
	
	

	/** 
	* 客户端上传json数据
	 */
	private String jsonData;

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public String getJsonData() {
		return this.jsonData;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.clientinfo.put";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("json_data", this.jsonData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintClientinfoPutResponse> getResponseClass() {
		return CainiaoCloudprintClientinfoPutResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(jsonData, "jsonData");
	}
	

}