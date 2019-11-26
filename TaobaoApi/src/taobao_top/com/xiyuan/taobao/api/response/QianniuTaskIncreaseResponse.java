package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.task.increase response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuTaskIncreaseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3788479483446753615L;

	/** 
	 * 是否添加成功
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
