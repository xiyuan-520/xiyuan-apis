package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TopSecretRegisterResponse;

/**
 * TOP API: taobao.top.secret.register request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class TopSecretRegisterRequest extends BaseTaobaoRequest<TopSecretRegisterResponse> {
	
	

	/** 
	* 用户id，保证唯一
	 */
	private Long userId;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "taobao.top.secret.register";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopSecretRegisterResponse> getResponseClass() {
		return TopSecretRegisterResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}