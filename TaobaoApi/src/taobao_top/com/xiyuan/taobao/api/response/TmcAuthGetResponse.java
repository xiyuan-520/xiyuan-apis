package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.auth.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcAuthGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5544367761432812283L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;


	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}
	


}
