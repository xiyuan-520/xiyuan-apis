package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderate.explain.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderateExplainAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2478496394919825178L;

	/** 
	 * 商城卖家给评价解释是否成功。
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
