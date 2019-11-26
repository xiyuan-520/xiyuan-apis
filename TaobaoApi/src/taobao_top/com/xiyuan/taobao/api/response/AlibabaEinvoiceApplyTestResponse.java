package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.apply.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceApplyTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6117557281847488826L;

	/** 
	 * 消息是否发送成功
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
