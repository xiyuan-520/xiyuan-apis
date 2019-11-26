package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.clientid.unbind response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WangwangClientidUnbindResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6736483954492139645L;

	/** 
	 * 返回0表示成功， 其他值为错误
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
