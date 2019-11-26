package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TopIpoutGetResponse;

/**
 * TOP API: taobao.top.ipout.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.07
 */
public class TopIpoutGetRequest extends BaseTaobaoRequest<TopIpoutGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.top.ipout.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopIpoutGetResponse> getResponseClass() {
		return TopIpoutGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}