package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.httpdns.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HttpdnsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6371438351299457358L;

	/** 
	 * HTTP DNS配置信息
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
