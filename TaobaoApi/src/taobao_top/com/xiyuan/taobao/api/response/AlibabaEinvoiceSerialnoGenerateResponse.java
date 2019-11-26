package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.serialno.generate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceSerialnoGenerateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6585598788331483183L;

	/** 
	 * result
	 */
	@ApiField("serial_no")
	private String serialNo;


	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo( ) {
		return this.serialNo;
	}
	


}
