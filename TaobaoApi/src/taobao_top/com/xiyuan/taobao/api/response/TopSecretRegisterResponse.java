package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.secret.register response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopSecretRegisterResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4269172457143442361L;

	/** 
	 * 返回操作是否成功
	 */
	@ApiField("result")
	private Boolean result;


	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}
	


}
