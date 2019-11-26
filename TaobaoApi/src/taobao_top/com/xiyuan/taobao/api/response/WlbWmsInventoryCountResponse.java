package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.WlbWmsInventoryCountResp;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7169815815186798449L;

	/** 
	 * result
	 */
	@ApiField("result")
	private WlbWmsInventoryCountResp result;


	public void setResult(WlbWmsInventoryCountResp result) {
		this.result = result;
	}
	public WlbWmsInventoryCountResp getResult( ) {
		return this.result;
	}
	


}
