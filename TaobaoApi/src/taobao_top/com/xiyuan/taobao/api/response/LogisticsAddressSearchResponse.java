package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.AddressResult;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6362329521986462489L;

	/** 
	 * 一组地址库数据，
	 */
	@ApiListField("addresses")
	@ApiField("address_result")
	private List<AddressResult> addresses;


	public void setAddresses(List<AddressResult> addresses) {
		this.addresses = addresses;
	}
	public List<AddressResult> getAddresses( ) {
		return this.addresses;
	}
	


}
