package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.AddressResult;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8126617234797932554L;

	/** 
	 * 只返回修改日期modify_date
	 */
	@ApiField("address_result")
	private AddressResult addressResult;


	public void setAddressResult(AddressResult addressResult) {
		this.addressResult = addressResult;
	}
	public AddressResult getAddressResult( ) {
		return this.addressResult;
	}
	


}
