package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.clientid.bind response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WangwangClientidBindResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1772141167676319135L;

	/** 
	 * 0:表示成功
其它为错误
	 */
	@ApiField("result")
	private Long result;


	public void setResult(Long result) {
		this.result = result;
	}
	public Long getResult( ) {
		return this.result;
	}
	


}
