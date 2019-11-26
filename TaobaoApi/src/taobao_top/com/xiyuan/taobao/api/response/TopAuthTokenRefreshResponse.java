package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.auth.token.refresh response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopAuthTokenRefreshResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6395977433459319397L;

	/** 
	 * 返回的是json信息
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
