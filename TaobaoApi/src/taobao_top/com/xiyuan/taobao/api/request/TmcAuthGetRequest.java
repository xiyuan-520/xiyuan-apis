package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TmcAuthGetResponse;

/**
 * TOP API: taobao.tmc.auth.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class TmcAuthGetRequest extends BaseTaobaoRequest<TmcAuthGetResponse> {
	
	

	/** 
	* tmc组名
	 */
	private String group;

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return this.group;
	}

	public String getApiMethodName() {
		return "taobao.tmc.auth.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group", this.group);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcAuthGetResponse> getResponseClass() {
		return TmcAuthGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}