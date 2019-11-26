package com.xiyuan.taobao.api.request;

import java.util.Date;
import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.LogisticsExpressModifyAppointResponse;

/**
 * TOP API: taobao.logistics.express.modify.appoint request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class LogisticsExpressModifyAppointRequest extends BaseTaobaoRequest<LogisticsExpressModifyAppointResponse> {
	
	

	/** 
	* 改约请求对象
	 */
	private String expressModifyAppointTopRequest;

	public void setExpressModifyAppointTopRequest(String expressModifyAppointTopRequest) {
		this.expressModifyAppointTopRequest = expressModifyAppointTopRequest;
	}

	public void setExpressModifyAppointTopRequest(ExpressModifyAppointTopRequestDto expressModifyAppointTopRequest) {
		this.expressModifyAppointTopRequest = new JSONWriter(false,true).write(expressModifyAppointTopRequest);
	}

	public String getExpressModifyAppointTopRequest() {
		return this.expressModifyAppointTopRequest;
	}

	public String getApiMethodName() {
		return "taobao.logistics.express.modify.appoint";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("express_modify_appoint_top_request", this.expressModifyAppointTopRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsExpressModifyAppointResponse> getResponseClass() {
		return LogisticsExpressModifyAppointResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 改约请求对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ExpressModifyAppointTopRequestDto extends TaobaoObject {

	private static final long serialVersionUID = 3735826366327191499L;

	/**
		 * 扩展字段
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 改约日期
		 */
		@ApiField("os_date")
		private Date osDate;
		/**
		 * 外部订单号
		 */
		@ApiField("out_order_code")
		private String outOrderCode;
		/**
		 * 收货人地址
		 */
		@ApiField("receiver_address")
		private String receiverAddress;
		/**
		 * 收货人电话
		 */
		@ApiField("receiver_mobile")
		private String receiverMobile;
		/**
		 * 收货人姓名
		 */
		@ApiField("receiver_name")
		private String receiverName;
		/**
		 * 应到达日期
		 */
		@ApiField("sc_date")
		private Date scDate;
		/**
		 * 卖家Id
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 子交易单号
		 */
		@ApiListField("sub_trade_ids")
		@ApiField("string")
		private List<String> subTradeIds;
		/**
		 * 交易号
		 */
		@ApiField("trade_id")
		private String tradeId;
	

	public String getFeature() {
			return this.feature;
		}
		public void setFeature(String feature) {
			this.feature = feature;
		}
		public Date getOsDate() {
			return this.osDate;
		}
		public void setOsDate(Date osDate) {
			this.osDate = osDate;
		}
		public String getOutOrderCode() {
			return this.outOrderCode;
		}
		public void setOutOrderCode(String outOrderCode) {
			this.outOrderCode = outOrderCode;
		}
		public String getReceiverAddress() {
			return this.receiverAddress;
		}
		public void setReceiverAddress(String receiverAddress) {
			this.receiverAddress = receiverAddress;
		}
		public String getReceiverMobile() {
			return this.receiverMobile;
		}
		public void setReceiverMobile(String receiverMobile) {
			this.receiverMobile = receiverMobile;
		}
		public String getReceiverName() {
			return this.receiverName;
		}
		public void setReceiverName(String receiverName) {
			this.receiverName = receiverName;
		}
		public Date getScDate() {
			return this.scDate;
		}
		public void setScDate(Date scDate) {
			this.scDate = scDate;
		}
		public Long getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}
		public List<String> getSubTradeIds() {
			return this.subTradeIds;
		}
		public void setSubTradeIds(List<String> subTradeIds) {
			this.subTradeIds = subTradeIds;
		}
		public String getTradeId() {
			return this.tradeId;
		}
		public void setTradeId(String tradeId) {
			this.tradeId = tradeId;
		}

}


}