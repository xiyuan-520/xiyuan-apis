package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.task.remove response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuTaskRemoveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2365982671481121988L;

	/** 
	 * 是否成功
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
