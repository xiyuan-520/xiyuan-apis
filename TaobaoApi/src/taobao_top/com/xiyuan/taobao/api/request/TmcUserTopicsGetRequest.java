package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TmcUserTopicsGetResponse;

/**
 * TOP API: taobao.tmc.user.topics.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class TmcUserTopicsGetRequest extends BaseTaobaoRequest<TmcUserTopicsGetResponse> {
	
	

	/** 
	* 卖家nick
	 */
	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.tmc.user.topics.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcUserTopicsGetResponse> getResponseClass() {
		return TmcUserTopicsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}