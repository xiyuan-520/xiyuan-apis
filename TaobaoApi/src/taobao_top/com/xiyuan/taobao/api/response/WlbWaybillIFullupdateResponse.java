package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.WaybillApplyUpdateInfo;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.fullupdate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillIFullupdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5191298333984372957L;

	/** 
	 * 更新接口出参
	 */
	@ApiField("waybill_apply_update_info")
	private WaybillApplyUpdateInfo waybillApplyUpdateInfo;


	public void setWaybillApplyUpdateInfo(WaybillApplyUpdateInfo waybillApplyUpdateInfo) {
		this.waybillApplyUpdateInfo = waybillApplyUpdateInfo;
	}
	public WaybillApplyUpdateInfo getWaybillApplyUpdateInfo( ) {
		return this.waybillApplyUpdateInfo;
	}
	


}
