package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.domain.WaybillApplyPrintCheckInfo;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.print response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillIPrintResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5372843735352756385L;

	/** 
	 * 面单打印信息
	 */
	@ApiListField("waybill_apply_print_check_infos")
	@ApiField("waybill_apply_print_check_info")
	private List<WaybillApplyPrintCheckInfo> waybillApplyPrintCheckInfos;


	public void setWaybillApplyPrintCheckInfos(List<WaybillApplyPrintCheckInfo> waybillApplyPrintCheckInfos) {
		this.waybillApplyPrintCheckInfos = waybillApplyPrintCheckInfos;
	}
	public List<WaybillApplyPrintCheckInfo> getWaybillApplyPrintCheckInfos( ) {
		return this.waybillApplyPrintCheckInfos;
	}
	


}
