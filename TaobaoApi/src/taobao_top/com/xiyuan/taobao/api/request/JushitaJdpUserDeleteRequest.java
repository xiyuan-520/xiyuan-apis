package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.JushitaJdpUserDeleteResponse;

/**
 * TOP API: taobao.jushita.jdp.user.delete request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class JushitaJdpUserDeleteRequest extends BaseTaobaoRequest<JushitaJdpUserDeleteResponse> {
	
	

	/** 
	* 要删除用户的昵称
	 */
	private String nick;

	/** 
	* 需要删除的用户编号
	 */
	private Long userId;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jdp.user.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJdpUserDeleteResponse> getResponseClass() {
		return JushitaJdpUserDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMinValue(userId, 1L, "userId");
	}
	

}