package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.WlbWmsInventoryLackUploadResp;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.lack.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryLackUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6228975173468928528L;

	/** 
	 * 缺货回告
	 */
	@ApiField("result")
	private WlbWmsInventoryLackUploadResp result;


	public void setResult(WlbWmsInventoryLackUploadResp result) {
		this.result = result;
	}
	public WlbWmsInventoryLackUploadResp getResult( ) {
		return this.result;
	}
	


}
