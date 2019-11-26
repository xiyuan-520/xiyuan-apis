package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.uop.tob.order.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class UopTobOrderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7699269548378438272L;

	/** 
	 * 订单
	 */
	@ApiListField("delivery_orders")
	@ApiField("deliveryorder")
	private List<Deliveryorder> deliveryOrders;

	/** 
	 * flag
	 */
	@ApiField("flag")
	private String flag;

	/** 
	 * message
	 */
	@ApiField("message")
	private String message;


	public void setDeliveryOrders(List<Deliveryorder> deliveryOrders) {
		this.deliveryOrders = deliveryOrders;
	}
	public List<Deliveryorder> getDeliveryOrders( ) {
		return this.deliveryOrders;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}
	
	/**
 * 订单行
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Orderline extends TaobaoObject {

	private static final long serialVersionUID = 4878594669886358612L;

	/**
		 * 数量
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 商品编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 订单行号
		 */
		@ApiField("order_line_no")
		private String orderLineNo;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getOrderLineNo() {
			return this.orderLineNo;
		}
		public void setOrderLineNo(String orderLineNo) {
			this.orderLineNo = orderLineNo;
		}

}

	/**
 * 订单
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Deliveryorder extends TaobaoObject {

	private static final long serialVersionUID = 7548195387716535153L;

	/**
		 * 物流单号
		 */
		@ApiField("cn_order_code")
		private String cnOrderCode;
		/**
		 * 创建时间
		 */
		@ApiField("create_time")
		private String createTime;
		/**
		 * 订单行
		 */
		@ApiListField("order_lines")
		@ApiField("orderline")
		private List<Orderline> orderLines;
		/**
		 * 仓库编码
		 */
		@ApiField("warehouse_code")
		private String warehouseCode;
	

	public String getCnOrderCode() {
			return this.cnOrderCode;
		}
		public void setCnOrderCode(String cnOrderCode) {
			this.cnOrderCode = cnOrderCode;
		}
		public String getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public List<Orderline> getOrderLines() {
			return this.orderLines;
		}
		public void setOrderLines(List<Orderline> orderLines) {
			this.orderLines = orderLines;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}



}
