package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.SellercenterSubuserPermissionsRolesGetResponse;

/**
 * TOP API: taobao.sellercenter.subuser.permissions.roles.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SellercenterSubuserPermissionsRolesGetRequest extends BaseTaobaoRequest<SellercenterSubuserPermissionsRolesGetResponse> {
	
	

	/** 
	* 子账号昵称(子账号标识)
	 */
	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.subuser.permissions.roles.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercenterSubuserPermissionsRolesGetResponse> getResponseClass() {
		return SellercenterSubuserPermissionsRolesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
		RequestCheckUtils.checkMaxLength(nick, 100, "nick");
	}
	

}