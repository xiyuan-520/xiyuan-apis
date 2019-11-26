package com.xiyuan.taobao.api.request;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.WlbWaybillICancelResponse;

/**
 * TOP API: taobao.wlb.waybill.i.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WlbWaybillICancelRequest extends BaseTaobaoRequest<WlbWaybillICancelResponse> {
	
	

	/** 
	* 取消接口入参
	 */
	private String waybillApplyCancelRequest;

	public void setWaybillApplyCancelRequest(String waybillApplyCancelRequest) {
		this.waybillApplyCancelRequest = waybillApplyCancelRequest;
	}

	public void setWaybillApplyCancelRequest(WaybillApplyCancelRequest waybillApplyCancelRequest) {
		this.waybillApplyCancelRequest = new JSONWriter(false,true).write(waybillApplyCancelRequest);
	}

	public String getWaybillApplyCancelRequest() {
		return this.waybillApplyCancelRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_apply_cancel_request", this.waybillApplyCancelRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillICancelResponse> getResponseClass() {
		return WlbWaybillICancelResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 取消接口入参
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillApplyCancelRequest extends TaobaoObject {

	private static final long serialVersionUID = 1228899167612744478L;

	/**
		 * CP快递公司编码
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * ERP订单号或包裹号
		 */
		@ApiField("package_id")
		private String packageId;
		/**
		 * 面单使用者编号
		 */
		@ApiField("real_user_id")
		private Long realUserId;
		/**
		 * 交易订单列表
		 */
		@ApiListField("trade_order_list")
		@ApiField("string")
		private List<String> tradeOrderList;
		/**
		 * 电子面单号码
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public String getPackageId() {
			return this.packageId;
		}
		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}
		public Long getRealUserId() {
			return this.realUserId;
		}
		public void setRealUserId(Long realUserId) {
			this.realUserId = realUserId;
		}
		public List<String> getTradeOrderList() {
			return this.tradeOrderList;
		}
		public void setTradeOrderList(List<String> tradeOrderList) {
			this.tradeOrderList = tradeOrderList;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}

}


}