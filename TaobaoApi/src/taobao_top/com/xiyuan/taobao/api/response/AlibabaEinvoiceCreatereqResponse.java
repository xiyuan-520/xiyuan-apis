package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.createreq response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceCreatereqResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1814152243674223299L;

	/** 
	 * 开票信息是否成功接受
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
