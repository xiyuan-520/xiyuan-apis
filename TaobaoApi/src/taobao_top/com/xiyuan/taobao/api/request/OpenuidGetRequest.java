package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.OpenuidGetResponse;

/**
 * TOP API: taobao.openuid.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.10.17
 */
public class OpenuidGetRequest extends BaseTaobaoRequest<OpenuidGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.openuid.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OpenuidGetResponse> getResponseClass() {
		return OpenuidGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}