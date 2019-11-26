package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.AddressReachableResult;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.reachable response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressReachableResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2117245395767875157L;

	/** 
	 * 地址可达返回结果，每个TP对应一个
	 */
	@ApiListField("reachable_result_list")
	@ApiField("address_reachable_result")
	private List<AddressReachableResult> reachableResultList;


	public void setReachableResultList(List<AddressReachableResult> reachableResultList) {
		this.reachableResultList = reachableResultList;
	}
	public List<AddressReachableResult> getReachableResultList( ) {
		return this.reachableResultList;
	}
	


}
