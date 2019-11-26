package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.order.remark.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoOrderRemarkUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5172411166494799666L;

	/** 
	 * 操作是否成功
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
