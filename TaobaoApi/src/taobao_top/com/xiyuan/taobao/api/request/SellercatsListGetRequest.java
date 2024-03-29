package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.SellercatsListGetResponse;

/**
 * TOP API: taobao.sellercats.list.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class SellercatsListGetRequest extends BaseTaobaoRequest<SellercatsListGetResponse> {
	
	

	/** 
	* fields参数
	 */
	private String fields;

	/** 
	* 卖家昵称
	 */
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.sellercats.list.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercatsListGetResponse> getResponseClass() {
		return SellercatsListGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}
	

}