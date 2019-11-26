package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.WaybillApplyNewInfo;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillIGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8732317938521638731L;

	/** 
	 * 面单申请接口返回信息
	 */
	@ApiListField("waybill_apply_new_cols")
	@ApiField("waybill_apply_new_info")
	private List<WaybillApplyNewInfo> waybillApplyNewCols;


	public void setWaybillApplyNewCols(List<WaybillApplyNewInfo> waybillApplyNewCols) {
		this.waybillApplyNewCols = waybillApplyNewCols;
	}
	public List<WaybillApplyNewInfo> getWaybillApplyNewCols( ) {
		return this.waybillApplyNewCols;
	}
	


}
