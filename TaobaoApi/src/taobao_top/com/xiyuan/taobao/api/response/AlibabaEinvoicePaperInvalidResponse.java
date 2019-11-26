package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.paper.invalid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoicePaperInvalidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3336494558992577143L;

	/** 
	 * 接口调用是否成功，操作结果tmc异步返回alibaba_invoice_PaperOpsReturn
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
