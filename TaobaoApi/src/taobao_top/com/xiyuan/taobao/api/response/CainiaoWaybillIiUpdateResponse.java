package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2279147538522516588L;

	/** 
	 * 模板内容
	 */
	@ApiField("print_data")
	private String printData;

	/** 
	 * 面单号
	 */
	@ApiField("waybill_code")
	private String waybillCode;


	public void setPrintData(String printData) {
		this.printData = printData;
	}
	public String getPrintData( ) {
		return this.printData;
	}

	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
	}
	public String getWaybillCode( ) {
		return this.waybillCode;
	}
	


}
