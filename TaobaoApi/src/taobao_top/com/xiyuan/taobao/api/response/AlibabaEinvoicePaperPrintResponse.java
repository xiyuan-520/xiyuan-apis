package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.paper.print response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoicePaperPrintResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2773872762558653799L;

	/** 
	 * 调用结果，打印结果tmc消息alibaba_invoice_PaperOpsReturn异步通知
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
