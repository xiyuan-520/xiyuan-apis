package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.taskmeta.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuTaskmetaUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4581887132354395319L;

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
