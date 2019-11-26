package com.xiyuan.taobao.api.request;

import java.util.List;
import java.util.Date;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.UopTobOrderCreateResponse;

/**
 * TOP API: taobao.uop.tob.order.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class UopTobOrderCreateRequest extends BaseTaobaoRequest<UopTobOrderCreateResponse> {
	
	

	/** 
	* ERP出库对象
	 */
	private String deliveryOrder;

	public void setDeliveryOrder(String deliveryOrder) {
		this.deliveryOrder = deliveryOrder;
	}

	public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
		this.deliveryOrder = new JSONWriter(false,true).write(deliveryOrder);
	}

	public String getDeliveryOrder() {
		return this.deliveryOrder;
	}

	public String getApiMethodName() {
		return "taobao.uop.tob.order.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("delivery_order", this.deliveryOrder);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<UopTobOrderCreateResponse> getResponseClass() {
		return UopTobOrderCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderLine extends TaobaoObject {

	private static final long serialVersionUID = 4468673888961499167L;

	/**
		 * 批次编码
		 */
		@ApiField("batch_code")
		private String batchCode;
		/**
		 * 过期日期，生产日期(YYYY-MM-DD)
		 */
		@ApiField("expire_date")
		private Date expireDate;
		/**
		 * 库存类型，ZP=正品、CC=残次
		 */
		@ApiField("inventory_type")
		private String inventoryType;
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
		 * 商品名称
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 商品数量
		 */
		@ApiField("item_quantity")
		private Long itemQuantity;
		/**
		 * 订单行号
		 */
		@ApiField("order_line_no")
		private String orderLineNo;
		/**
		 * 生产批号
		 */
		@ApiField("produce_code")
		private String produceCode;
		/**
		 * 生产日期，生产日期(YYYY-MM-DD)
		 */
		@ApiField("product_date")
		private Date productDate;
		/**
		 * 原交易单，供销平台交易单号、分销平台单号
		 */
		@ApiField("source_order_code")
		private String sourceOrderCode;
		/**
		 * 子交易单号
		 */
		@ApiField("sub_source_order_code")
		private String subSourceOrderCode;
	

	public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public Date getExpireDate() {
			return this.expireDate;
		}
		public void setExpireDate(Date expireDate) {
			this.expireDate = expireDate;
		}
		public String getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
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
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public Long getItemQuantity() {
			return this.itemQuantity;
		}
		public void setItemQuantity(Long itemQuantity) {
			this.itemQuantity = itemQuantity;
		}
		public String getOrderLineNo() {
			return this.orderLineNo;
		}
		public void setOrderLineNo(String orderLineNo) {
			this.orderLineNo = orderLineNo;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public Date getProductDate() {
			return this.productDate;
		}
		public void setProductDate(Date productDate) {
			this.productDate = productDate;
		}
		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}
		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}
		public String getSubSourceOrderCode() {
			return this.subSourceOrderCode;
		}
		public void setSubSourceOrderCode(String subSourceOrderCode) {
			this.subSourceOrderCode = subSourceOrderCode;
		}

}

	/**
 * 收货人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ReceiverInfo extends TaobaoObject {

	private static final long serialVersionUID = 5486464166157648265L;

	/**
		 * 收货人区
		 */
		@ApiField("area")
		private String area;
		/**
		 * 收货人市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 收货人详细地址
		 */
		@ApiField("detail_address")
		private String detailAddress;
		/**
		 * 收货人移动电话
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 收货人姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 收货人省
		 */
		@ApiField("province")
		private String province;
		/**
		 * 收货人镇
		 */
		@ApiField("town")
		private String town;
	

	public String getArea() {
			return this.area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDetailAddress() {
			return this.detailAddress;
		}
		public void setDetailAddress(String detailAddress) {
			this.detailAddress = detailAddress;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getTown() {
			return this.town;
		}
		public void setTown(String town) {
			this.town = town;
		}

}

	/**
 * ERP出库对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DeliveryOrder extends TaobaoObject {

	private static final long serialVersionUID = 6329666248272822474L;

	/**
		 * 到货渠道类型，VIP＝1、门店＝2、经销商＝3
		 */
		@ApiField("arrive_channel_type")
		private String arriveChannelType;
		/**
		 * 发货单创建时间
		 */
		@ApiField("create_time")
		private Date createTime;
		/**
		 * ERP出库单号,ERP系统内本次出库的唯一标示
		 */
		@ApiField("delivery_order_code")
		private String deliveryOrderCode;
		/**
		 * 扩展信息
		 */
		@ApiField("extend_props")
		private String extendProps;
		/**
		 * 最晚到货时间
		 */
		@ApiField("last_arrive_date")
		private Date lastArriveDate;
		/**
		 * 物流公司编码
		 */
		@ApiField("logistics_code")
		private String logisticsCode;
		/**
		 * 物流公司名称
		 */
		@ApiField("logistics_name")
		private String logisticsName;
		/**
		 * 订单信息
		 */
		@ApiListField("order_line")
		@ApiField("order_line")
		private List<OrderLine> orderLine;
		/**
		 * 单据类型,出库单类型(JYCK=一般交易出库单;HHCK=换货出库单;BFCK=补发出库单;QTCK=其他出库单;TOBCK=TOB出库)
		 */
		@ApiField("order_type")
		private String orderType;
		/**
		 * 收货人信息
		 */
		@ApiField("receiver_info")
		private ReceiverInfo receiverInfo;
		/**
		 * 交接入库单号,例如唯品会入库单号或者门店收货单号、商家仓入库单号等
		 */
		@ApiField("rel_in_bound_order_code")
		private String relInBoundOrderCode;
		/**
		 * 发货仓库
		 */
		@ApiField("warehouse_code")
		private String warehouseCode;
	

	public String getArriveChannelType() {
			return this.arriveChannelType;
		}
		public void setArriveChannelType(String arriveChannelType) {
			this.arriveChannelType = arriveChannelType;
		}
		public Date getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public String getDeliveryOrderCode() {
			return this.deliveryOrderCode;
		}
		public void setDeliveryOrderCode(String deliveryOrderCode) {
			this.deliveryOrderCode = deliveryOrderCode;
		}
		public String getExtendProps() {
			return this.extendProps;
		}
		public void setExtendProps(String extendProps) {
			this.extendProps = extendProps;
		}
		public Date getLastArriveDate() {
			return this.lastArriveDate;
		}
		public void setLastArriveDate(Date lastArriveDate) {
			this.lastArriveDate = lastArriveDate;
		}
		public String getLogisticsCode() {
			return this.logisticsCode;
		}
		public void setLogisticsCode(String logisticsCode) {
			this.logisticsCode = logisticsCode;
		}
		public String getLogisticsName() {
			return this.logisticsName;
		}
		public void setLogisticsName(String logisticsName) {
			this.logisticsName = logisticsName;
		}
		public List<OrderLine> getOrderLine() {
			return this.orderLine;
		}
		public void setOrderLine(List<OrderLine> orderLine) {
			this.orderLine = orderLine;
		}
		public String getOrderType() {
			return this.orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public ReceiverInfo getReceiverInfo() {
			return this.receiverInfo;
		}
		public void setReceiverInfo(ReceiverInfo receiverInfo) {
			this.receiverInfo = receiverInfo;
		}
		public String getRelInBoundOrderCode() {
			return this.relInBoundOrderCode;
		}
		public void setRelInBoundOrderCode(String relInBoundOrderCode) {
			this.relInBoundOrderCode = relInBoundOrderCode;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}


}