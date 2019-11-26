package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TimeGetResponse;

/**
 * TOP API: taobao.time.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class TimeGetRequest extends BaseTaobaoRequest<TimeGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.time.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TimeGetResponse> getResponseClass() {
		return TimeGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}