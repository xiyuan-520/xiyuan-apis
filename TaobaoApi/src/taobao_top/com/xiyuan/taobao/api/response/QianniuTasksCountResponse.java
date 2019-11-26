package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.tasks.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuTasksCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1829452413683822464L;

	/** 
	 * 符合查询条件的总条数
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
