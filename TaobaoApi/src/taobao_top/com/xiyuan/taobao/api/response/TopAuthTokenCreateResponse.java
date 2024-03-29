package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.auth.token.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopAuthTokenCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1163438581316171492L;

	/** 
	 * 返回的是json信息，和之前调用https://oauth.taobao.com/tac/token https://oauth.alibaba.com/token 换token返回的字段信息一致
	 */
	@ApiField("token_result")
	private String tokenResult;


	public void setTokenResult(String tokenResult) {
		this.tokenResult = tokenResult;
	}
	public String getTokenResult( ) {
		return this.tokenResult;
	}
	


}
