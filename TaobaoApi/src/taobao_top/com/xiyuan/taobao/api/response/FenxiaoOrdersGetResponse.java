package com.xiyuan.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.orders.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoOrdersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4777429721371977398L;

	/** 
	 * 采购单及子采购单信息。返回 PurchaseOrder 包含的字段信息。
	 */
	@ApiListField("purchase_orders")
	@ApiField("purchase_order")
	private List<TopDpOrderDo> purchaseOrders;

	/** 
	 * 搜索到的采购单记录总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setPurchaseOrders(List<TopDpOrderDo> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}
	public List<TopDpOrderDo> getPurchaseOrders( ) {
		return this.purchaseOrders;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	
	/**
 * 买家详细信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopReceiverDo extends TaobaoObject {

	private static final long serialVersionUID = 5294446776352363777L;

	/**
		 * 收货人的详细地址信息
		 */
		@ApiField("address")
		private String address;
		/**
		 * 收货人的城市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 区/县
		 */
		@ApiField("district")
		private String district;
		/**
		 * 移动电话
		 */
		@ApiField("mobile_phone")
		private String mobilePhone;
		/**
		 * 收货人全名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 固定电话
		 */
		@ApiField("phone")
		private String phone;
		/**
		 * 收货人所在省份
		 */
		@ApiField("state")
		private String state;
		/**
		 * 邮政编码
		 */
		@ApiField("zip")
		private String zip;
	

	public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDistrict() {
			return this.district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getMobilePhone() {
			return this.mobilePhone;
		}
		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getState() {
			return this.state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return this.zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}

}

	/**
 * 采购单留言列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderMessages extends TaobaoObject {

	private static final long serialVersionUID = 2248792521786965343L;

	/**
		 * 留言内容
		 */
		@ApiField("message_content")
		private String messageContent;
		/**
		 * 留言时间
		 */
		@ApiField("message_time")
		private Date messageTime;
		/**
		 * 留言标题，例如：分销商留言，供应商留言，买家留言
		 */
		@ApiField("message_title")
		private String messageTitle;
		/**
		 * 留言时的图片地址
		 */
		@ApiField("pic_url")
		private String picUrl;
	

	public String getMessageContent() {
			return this.messageContent;
		}
		public void setMessageContent(String messageContent) {
			this.messageContent = messageContent;
		}
		public Date getMessageTime() {
			return this.messageTime;
		}
		public void setMessageTime(Date messageTime) {
			this.messageTime = messageTime;
		}
		public String getMessageTitle() {
			return this.messageTitle;
		}
		public void setMessageTitle(String messageTitle) {
			this.messageTitle = messageTitle;
		}
		public String getPicUrl() {
			return this.picUrl;
		}
		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}

}

	/**
 * Feature对象列表目前已有的属性：attr_key为 www，attr_value为1 表示是www子订单；attr_key为 wwwStoreCode，attr_value是www子订单发货的仓库编码；attr_key为 isWt，attr_value为1 表示是网厅子订单；attr_key为wtInfo,attr_value为网厅相关合约信息；attr_key为shipper,attr_value为cn表示菜鸟发货；attr_key为 storeCode，attr_value为仓库信息； attr_key为 erpHold，attr_value为1表示强管控中， attr_value为2表示分单完成；
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class FeatureDo extends TaobaoObject {

	private static final long serialVersionUID = 1151527297971762828L;

	/**
		 * 属性键
		 */
		@ApiField("attr_key")
		private String attrKey;
		/**
		 * 属性值
		 */
		@ApiField("attr_value")
		private String attrValue;
	

	public String getAttrKey() {
			return this.attrKey;
		}
		public void setAttrKey(String attrKey) {
			this.attrKey = attrKey;
		}
		public String getAttrValue() {
			return this.attrValue;
		}
		public void setAttrValue(String attrValue) {
			this.attrValue = attrValue;
		}

}

	/**
 * attachments
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopMemoAttachment extends TaobaoObject {

	private static final long serialVersionUID = 5433475724911722359L;

	/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * url
		 */
		@ApiField("url")
		private String url;
	

	public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}

}

	/**
 * topMemoDTO
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopMemoDto extends TaobaoObject {

	private static final long serialVersionUID = 7267487169982163289L;

	/**
		 * attachments
		 */
		@ApiListField("attachments")
		@ApiField("top_memo_attachment")
		private List<TopMemoAttachment> attachments;
		/**
		 * operateUserNick
		 */
		@ApiField("operate_user_nick")
		private String operateUserNick;
		/**
		 * remark
		 */
		@ApiField("remark")
		private String remark;
	

	public List<TopMemoAttachment> getAttachments() {
			return this.attachments;
		}
		public void setAttachments(List<TopMemoAttachment> attachments) {
			this.attachments = attachments;
		}
		public String getOperateUserNick() {
			return this.operateUserNick;
		}
		public void setOperateUserNick(String operateUserNick) {
			this.operateUserNick = operateUserNick;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}

	/**
 * 子订单的详细信息列表。
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SubOrderDetail extends TaobaoObject {

	private static final long serialVersionUID = 4193652389134379412L;

	/**
		 * 前台分销商品的宝贝ID，不存在时为0。2015年4月15日之前创建的采购单该字段都是0。
		 */
		@ApiField("auction_id")
		private Long auctionId;
		/**
		 * 分销商店铺中宝贝一口价
		 */
		@ApiField("auction_price")
		private String auctionPrice;
		/**
		 * 前台商品SKU ID，不存在时为0。2015年3月15日之前创建的采购单该字段都是0。
		 */
		@ApiField("auction_sku_id")
		private Long auctionSkuId;
		/**
		 * 发票应开金额。根据买家实际付款去除邮费后，按各个子单(商品)金额比例进行分摊后的金额，仅供开发票时做票面金额参考。
		 */
		@ApiField("bill_fee")
		private String billFee;
		/**
		 * 买家订单上对应的子单零售金额，除以num（数量）后等于最终宝贝的零售价格（精确到2位小数;单位:元。如:200.07，表示:200元7分）
		 */
		@ApiField("buyer_payment")
		private String buyerPayment;
		/**
		 * 创建时间。格式 yyyy-MM-dd HH:mm:ss 。
		 */
		@ApiField("created")
		private Date created;
		/**
		 * 优惠活动的折扣金额
		 */
		@ApiField("discount_fee")
		private String discountFee;
		/**
		 * 分销商实付金额=total_fee（分销商应付金额）+改价-优惠。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
		 */
		@ApiField("distributor_payment")
		private String distributorPayment;
		/**
		 * Feature对象列表目前已有的属性：attr_key为 www，attr_value为1 表示是www子订单；attr_key为 wwwStoreCode，attr_value是www子订单发货的仓库编码；attr_key为 isWt，attr_value为1 表示是网厅子订单；attr_key为wtInfo,attr_value为网厅相关合约信息；attr_key为shipper,attr_value为cn表示菜鸟发货；attr_key为 storeCode，attr_value为仓库信息； attr_key为 erpHold，attr_value为1表示强管控中， attr_value为2表示分单完成；
		 */
		@ApiListField("features")
		@ApiField("feature")
		private List<FeatureDo> features;
		/**
		 * 分销平台的子采购单主键
		 */
		@ApiField("fenxiao_id")
		private Long fenxiaoId;
		/**
		 * 子采购单id，淘宝交易主键，采购单未付款时为0.（只有支付宝 付款才有这个id，其余付款形式该字段为0）
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 分销平台上的产品id，同FenxiaoProduct 的pid
		 */
		@ApiField("item_id")
		private Long itemId;
		/**
		 * 分销平台上商品商家编码。
		 */
		@ApiField("item_outer_id")
		private String itemOuterId;
		/**
		 * 产品的采购数量。取值范围:大于零的整数
		 */
		@ApiField("num")
		private Long num;
		/**
		 * 老的SKU属性值。如: 颜色:红色:别名;尺码:L:别名
		 */
		@ApiField("old_sku_properties")
		private String oldSkuProperties;
		/**
		 * 代销采购单对应下游200订单状态。可选值：WAIT_SELLER_SEND_GOODS(已付款，待发货)WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)TRADE_CLOSED(已退款成功)TRADE_REFUNDING(退款中)TRADE_FINISHED(交易成功)TRADE_CLOSED_BY_TAOBAO(交易关闭)
		 */
		@ApiField("order_200_status")
		private String order200Status;
		/**
		 * 产品的采购价格。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
		 */
		@ApiField("price")
		private String price;
		/**
		 * 优惠活动类型0=无优惠1=限时折
		 */
		@ApiField("promotion_type")
		private String promotionType;
		/**
		 * 退款金额
		 */
		@ApiField("refund_fee")
		private String refundFee;
		/**
		 * 后端商品id
		 */
		@ApiField("sc_item_id")
		private Long scItemId;
		/**
		 * 分销产品的SKU id。当存在时才会有值，建议使用sku_outer_id，sku_properties这两个值
		 */
		@ApiField("sku_id")
		private Long skuId;
		/**
		 * SKU商家编码。
		 */
		@ApiField("sku_outer_id")
		private String skuOuterId;
		/**
		 * SKU属性值。如: 颜色:红色:别名;尺码:L:别名
		 */
		@ApiField("sku_properties")
		private String skuProperties;
		/**
		 * 快照地址。
		 */
		@ApiField("snapshot_url")
		private String snapshotUrl;
		/**
		 * 交易状态。可选值： <br>WAIT_BUYER_PAY(等待付款)<br> WAIT_SELLER_SEND_GOODS(已付款，待发货）<br> WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)<br> PAID_FORBID_CONSIGN(已付款，禁止发货 ps:只有大快消行业的才有)<br> TRADE_FINISHED(交易成功)<br> TRADE_CLOSED(交易关闭)<br> WAIT_BUYER_CONFIRM_GOODS_ACOUNTED(已付款（已分账），已发货。只对代销分账支持)<br> PAY_ACOUNTED_GOODS_CONFIRM （已分账发货成功）<br> PAY_WAIT_ACOUNT_GOODS_CONFIRM（已付款，确认收货）
		 */
		@ApiField("status")
		private String status;
		/**
		 * 商品的卖出金额调整，金额增加时为正数，金额减少时为负数，单位是分，不带小数
		 */
		@ApiField("tc_adjust_fee")
		private Long tcAdjustFee;
		/**
		 * 优惠金额，始终为正数，单位是分，不带小数
		 */
		@ApiField("tc_discount_fee")
		private Long tcDiscountFee;
		/**
		 * TC子订单ID（经销不显示）
		 */
		@ApiField("tc_order_id")
		private Long tcOrderId;
		/**
		 * 商品优惠类型：聚划算、秒杀或其他
		 */
		@ApiField("tc_preferential_type")
		private String tcPreferentialType;
		/**
		 * 采购的产品标题。
		 */
		@ApiField("title")
		private String title;
		/**
		 * topMemoDTO
		 */
		@ApiField("top_memo")
		private TopMemoDto topMemo;
		/**
		 * 分销商应付金额=num(采购数量)*price(采购价)。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
		 */
		@ApiField("total_fee")
		private String totalFee;
	

	public Long getAuctionId() {
			return this.auctionId;
		}
		public void setAuctionId(Long auctionId) {
			this.auctionId = auctionId;
		}
		public String getAuctionPrice() {
			return this.auctionPrice;
		}
		public void setAuctionPrice(String auctionPrice) {
			this.auctionPrice = auctionPrice;
		}
		public Long getAuctionSkuId() {
			return this.auctionSkuId;
		}
		public void setAuctionSkuId(Long auctionSkuId) {
			this.auctionSkuId = auctionSkuId;
		}
		public String getBillFee() {
			return this.billFee;
		}
		public void setBillFee(String billFee) {
			this.billFee = billFee;
		}
		public String getBuyerPayment() {
			return this.buyerPayment;
		}
		public void setBuyerPayment(String buyerPayment) {
			this.buyerPayment = buyerPayment;
		}
		public Date getCreated() {
			return this.created;
		}
		public void setCreated(Date created) {
			this.created = created;
		}
		public String getDiscountFee() {
			return this.discountFee;
		}
		public void setDiscountFee(String discountFee) {
			this.discountFee = discountFee;
		}
		public String getDistributorPayment() {
			return this.distributorPayment;
		}
		public void setDistributorPayment(String distributorPayment) {
			this.distributorPayment = distributorPayment;
		}
		public List<FeatureDo> getFeatures() {
			return this.features;
		}
		public void setFeatures(List<FeatureDo> features) {
			this.features = features;
		}
		public Long getFenxiaoId() {
			return this.fenxiaoId;
		}
		public void setFenxiaoId(Long fenxiaoId) {
			this.fenxiaoId = fenxiaoId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getItemId() {
			return this.itemId;
		}
		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}
		public String getItemOuterId() {
			return this.itemOuterId;
		}
		public void setItemOuterId(String itemOuterId) {
			this.itemOuterId = itemOuterId;
		}
		public Long getNum() {
			return this.num;
		}
		public void setNum(Long num) {
			this.num = num;
		}
		public String getOldSkuProperties() {
			return this.oldSkuProperties;
		}
		public void setOldSkuProperties(String oldSkuProperties) {
			this.oldSkuProperties = oldSkuProperties;
		}
		public String getOrder200Status() {
			return this.order200Status;
		}
		public void setOrder200Status(String order200Status) {
			this.order200Status = order200Status;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getPromotionType() {
			return this.promotionType;
		}
		public void setPromotionType(String promotionType) {
			this.promotionType = promotionType;
		}
		public String getRefundFee() {
			return this.refundFee;
		}
		public void setRefundFee(String refundFee) {
			this.refundFee = refundFee;
		}
		public Long getScItemId() {
			return this.scItemId;
		}
		public void setScItemId(Long scItemId) {
			this.scItemId = scItemId;
		}
		public Long getSkuId() {
			return this.skuId;
		}
		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}
		public String getSkuOuterId() {
			return this.skuOuterId;
		}
		public void setSkuOuterId(String skuOuterId) {
			this.skuOuterId = skuOuterId;
		}
		public String getSkuProperties() {
			return this.skuProperties;
		}
		public void setSkuProperties(String skuProperties) {
			this.skuProperties = skuProperties;
		}
		public String getSnapshotUrl() {
			return this.snapshotUrl;
		}
		public void setSnapshotUrl(String snapshotUrl) {
			this.snapshotUrl = snapshotUrl;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Long getTcAdjustFee() {
			return this.tcAdjustFee;
		}
		public void setTcAdjustFee(Long tcAdjustFee) {
			this.tcAdjustFee = tcAdjustFee;
		}
		public Long getTcDiscountFee() {
			return this.tcDiscountFee;
		}
		public void setTcDiscountFee(Long tcDiscountFee) {
			this.tcDiscountFee = tcDiscountFee;
		}
		public Long getTcOrderId() {
			return this.tcOrderId;
		}
		public void setTcOrderId(Long tcOrderId) {
			this.tcOrderId = tcOrderId;
		}
		public String getTcPreferentialType() {
			return this.tcPreferentialType;
		}
		public void setTcPreferentialType(String tcPreferentialType) {
			this.tcPreferentialType = tcPreferentialType;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public TopMemoDto getTopMemo() {
			return this.topMemo;
		}
		public void setTopMemo(TopMemoDto topMemo) {
			this.topMemo = topMemo;
		}
		public String getTotalFee() {
			return this.totalFee;
		}
		public void setTotalFee(String totalFee) {
			this.totalFee = totalFee;
		}

}

	/**
 * 子单物流发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ErpLogisticsInfo extends TaobaoObject {

	private static final long serialVersionUID = 3829893114859576418L;

	/**
		 * 组合商品Code
		 */
		@ApiField("combine_item_code")
		private String combineItemCode;
		/**
		 * 组合商品ID
		 */
		@ApiField("combine_item_id")
		private String combineItemId;
		/**
		 * 发货类型 CN=菜鸟发货,SC的商家仓发货
		 */
		@ApiField("consign_type")
		private String consignType;
		/**
		 * 货品仓储code
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 货品仓储id
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 组合货品比例
		 */
		@ApiField("item_ratio")
		private Long itemRatio;
		/**
		 * 应发数量
		 */
		@ApiField("need_consign_num")
		private Long needConsignNum;
		/**
		 * 商品数字编号
		 */
		@ApiField("num_iid")
		private Long numIid;
		/**
		 * 采购单号
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 商品的最小库存单位Sku的id
		 */
		@ApiField("sku_id")
		private String skuId;
		/**
		 * 如是菜鸟仓，则将菜鸟仓的区域仓code进行填充，如是商家仓发货则填充SC
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 采购单子单号
		 */
		@ApiField("sub_order_id")
		private Long subOrderId;
		/**
		 * 子订单类型:标示该子交易单来源交易，还是BMS增加的，枚举值(00=交易，10=BMS绑定)
		 */
		@ApiField("type")
		private String type;
	

	public String getCombineItemCode() {
			return this.combineItemCode;
		}
		public void setCombineItemCode(String combineItemCode) {
			this.combineItemCode = combineItemCode;
		}
		public String getCombineItemId() {
			return this.combineItemId;
		}
		public void setCombineItemId(String combineItemId) {
			this.combineItemId = combineItemId;
		}
		public String getConsignType() {
			return this.consignType;
		}
		public void setConsignType(String consignType) {
			this.consignType = consignType;
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
		public Long getItemRatio() {
			return this.itemRatio;
		}
		public void setItemRatio(Long itemRatio) {
			this.itemRatio = itemRatio;
		}
		public Long getNeedConsignNum() {
			return this.needConsignNum;
		}
		public void setNeedConsignNum(Long needConsignNum) {
			this.needConsignNum = needConsignNum;
		}
		public Long getNumIid() {
			return this.numIid;
		}
		public void setNumIid(Long numIid) {
			this.numIid = numIid;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public String getSkuId() {
			return this.skuId;
		}
		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public Long getSubOrderId() {
			return this.subOrderId;
		}
		public void setSubOrderId(Long subOrderId) {
			this.subOrderId = subOrderId;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}

}

	/**
 * 采购单及子采购单信息。返回 PurchaseOrder 包含的字段信息。
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopDpOrderDo extends TaobaoObject {

	private static final long serialVersionUID = 7752528527858178664L;

	/**
		 * 支付宝交易号。
		 */
		@ApiField("alipay_no")
		private String alipayNo;
		/**
		 * 买家nick，供应商查询不会返回买家昵称，分销商查询才会返回。
		 */
		@ApiField("buyer_nick")
		private String buyerNick;
		/**
		 * 买家支付给分销商的总金额。注意买家购买的商品可能不是全部来自同一供货商，请同时参考子单上的相关金额。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
		 */
		@ApiField("buyer_payment")
		private String buyerPayment;
		/**
		 * 加密后的买家淘宝ID，长度为32位
		 */
		@ApiField("buyer_taobao_id")
		private String buyerTaobaoId;
		/**
		 * 物流发货时间。格式:yyyy-MM-dd HH:mm:ss
		 */
		@ApiField("consign_time")
		private Date consignTime;
		/**
		 * 采购单创建时间。格式:yyyy-MM-dd HH:mm:ss
		 */
		@ApiField("created")
		private Date created;
		/**
		 * 分销商来源网站（taobao）。
		 */
		@ApiField("distributor_from")
		private String distributorFrom;
		/**
		 * 分销商实付金额。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
		 */
		@ApiField("distributor_payment")
		private String distributorPayment;
		/**
		 * 分销商在来源网站的帐号名。
		 */
		@ApiField("distributor_username")
		private String distributorUsername;
		/**
		 * 交易结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 主订单属性信息，key-value形式：
	orderNovice ：订单发票抬头；
	orderNoviceContent ：代表发票明细
		 */
		@ApiListField("features")
		@ApiField("feature")
		private List<FeatureDo> features;
		/**
		 * 分销流水号，分销平台产生的主键
		 */
		@ApiField("fenxiao_id")
		private Long fenxiaoId;
		/**
		 * 供应商交易ID 非采购单ID，如果改发货状态 是需要该ID，ID在用户未付款前为0，付款后有具体值（发货时使用该ID）
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 自定义key
		 */
		@ApiListField("isv_custom_key")
		@ApiField("string")
		private List<String> isvCustomKey;
		/**
		 * 自定义值
		 */
		@ApiListField("isv_custom_value")
		@ApiField("string")
		private List<String> isvCustomValue;
		/**
		 * 物流公司
		 */
		@ApiField("logistics_company_name")
		private String logisticsCompanyName;
		/**
		 * 运单号
		 */
		@ApiField("logistics_id")
		private String logisticsId;
		/**
		 * 子单物流发货信息
		 */
		@ApiListField("logistics_infos")
		@ApiField("erp_logistics_info")
		private List<ErpLogisticsInfo> logisticsInfos;
		/**
		 * 采购单留言。（代销模式下信息包括买家留言和分销商留言）
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 交易修改时间。格式:yyyy-MM-dd HH:mm:ss
		 */
		@ApiField("modified")
		private Date modified;
		/**
		 * 采购单留言列表
		 */
		@ApiListField("order_messages")
		@ApiField("order_message")
		private List<OrderMessages> orderMessages;
		/**
		 * 付款时间。格式:yyyy-MM-dd HH:mm:ss
		 */
		@ApiField("pay_time")
		private Date payTime;
		/**
		 * 支付方式：ALIPAY_SURETY（支付宝担保交易）、ALIPAY_CHAIN（分账交易）、TRANSFER（线下转账）、PREPAY（预存款）、IMMEDIATELY（即时到账）、CASHGOODS（先款后货）、ACCOUNT_PERIOD（账期支付）
		 */
		@ApiField("pay_type")
		private String payType;
		/**
		 * 采购单邮费。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
		 */
		@ApiField("post_fee")
		private String postFee;
		/**
		 * 买家详细信息
		 */
		@ApiField("receiver")
		private TopReceiverDo receiver;
		/**
		 * 配送方式，FAST(快速)、EMS、ORDINARY(平邮)、SELLER(卖家包邮)
		 */
		@ApiField("shipping")
		private String shipping;
		/**
		 * 订单快照URL
		 */
		@ApiField("snapshot_url")
		private String snapshotUrl;
		/**
		 * 采购单交易状态。可选值： <br>WAIT_BUYER_PAY(等待付款)<br> WAIT_SELLER_SEND_GOODS(已付款，待发货）<br> WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)<br> PAID_FORBID_CONSIGN(已付款，禁止发货 ps:只有大快消行业的才有)<br> TRADE_FINISHED(交易成功)<br> TRADE_CLOSED(交易关闭)<br> WAIT_BUYER_CONFIRM_GOODS_ACOUNTED(已付款（已分账），已发货。只对代销分账支持)<br> PAY_ACOUNTED_GOODS_CONFIRM （已分账发货成功）<br> PAY_WAIT_ACOUNT_GOODS_CONFIRM（已付款，确认收货）
		 */
		@ApiField("status")
		private String status;
		/**
		 * 子订单的详细信息列表。
		 */
		@ApiListField("sub_purchase_orders")
		@ApiField("sub_purchase_order")
		private List<SubOrderDetail> subPurchaseOrders;
		/**
		 * 返回供应商备注旗帜vlaue在1-5之间。非1-5之间，都采用1作为默认。 1:红色 2:黄色 3:绿色 4:蓝色 5:粉红色
		 */
		@ApiField("supplier_flag")
		private Long supplierFlag;
		/**
		 * 供应商来源网站, values: taobao, alibaba
		 */
		@ApiField("supplier_from")
		private String supplierFrom;
		/**
		 * 供应商备注
		 */
		@ApiField("supplier_memo")
		private String supplierMemo;
		/**
		 * 供应商在来源网站的帐号名。
		 */
		@ApiField("supplier_username")
		private String supplierUsername;
		/**
		 * 主订单ID （经销不显示）
		 */
		@ApiField("tc_order_id")
		private Long tcOrderId;
		/**
		 * 采购单总额（不含邮费,精确到2位小数;单位:元。如:200.07，表示:200元7分 )
		 */
		@ApiField("total_fee")
		private String totalFee;
		/**
		 * 分销方式：AGENT（代销）、DEALER（经销）
		 */
		@ApiField("trade_type")
		private String tradeType;
	

	public String getAlipayNo() {
			return this.alipayNo;
		}
		public void setAlipayNo(String alipayNo) {
			this.alipayNo = alipayNo;
		}
		public String getBuyerNick() {
			return this.buyerNick;
		}
		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}
		public String getBuyerPayment() {
			return this.buyerPayment;
		}
		public void setBuyerPayment(String buyerPayment) {
			this.buyerPayment = buyerPayment;
		}
		public String getBuyerTaobaoId() {
			return this.buyerTaobaoId;
		}
		public void setBuyerTaobaoId(String buyerTaobaoId) {
			this.buyerTaobaoId = buyerTaobaoId;
		}
		public Date getConsignTime() {
			return this.consignTime;
		}
		public void setConsignTime(Date consignTime) {
			this.consignTime = consignTime;
		}
		public Date getCreated() {
			return this.created;
		}
		public void setCreated(Date created) {
			this.created = created;
		}
		public String getDistributorFrom() {
			return this.distributorFrom;
		}
		public void setDistributorFrom(String distributorFrom) {
			this.distributorFrom = distributorFrom;
		}
		public String getDistributorPayment() {
			return this.distributorPayment;
		}
		public void setDistributorPayment(String distributorPayment) {
			this.distributorPayment = distributorPayment;
		}
		public String getDistributorUsername() {
			return this.distributorUsername;
		}
		public void setDistributorUsername(String distributorUsername) {
			this.distributorUsername = distributorUsername;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public List<FeatureDo> getFeatures() {
			return this.features;
		}
		public void setFeatures(List<FeatureDo> features) {
			this.features = features;
		}
		public Long getFenxiaoId() {
			return this.fenxiaoId;
		}
		public void setFenxiaoId(Long fenxiaoId) {
			this.fenxiaoId = fenxiaoId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<String> getIsvCustomKey() {
			return this.isvCustomKey;
		}
		public void setIsvCustomKey(List<String> isvCustomKey) {
			this.isvCustomKey = isvCustomKey;
		}
		public List<String> getIsvCustomValue() {
			return this.isvCustomValue;
		}
		public void setIsvCustomValue(List<String> isvCustomValue) {
			this.isvCustomValue = isvCustomValue;
		}
		public String getLogisticsCompanyName() {
			return this.logisticsCompanyName;
		}
		public void setLogisticsCompanyName(String logisticsCompanyName) {
			this.logisticsCompanyName = logisticsCompanyName;
		}
		public String getLogisticsId() {
			return this.logisticsId;
		}
		public void setLogisticsId(String logisticsId) {
			this.logisticsId = logisticsId;
		}
		public List<ErpLogisticsInfo> getLogisticsInfos() {
			return this.logisticsInfos;
		}
		public void setLogisticsInfos(List<ErpLogisticsInfo> logisticsInfos) {
			this.logisticsInfos = logisticsInfos;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public Date getModified() {
			return this.modified;
		}
		public void setModified(Date modified) {
			this.modified = modified;
		}
		public List<OrderMessages> getOrderMessages() {
			return this.orderMessages;
		}
		public void setOrderMessages(List<OrderMessages> orderMessages) {
			this.orderMessages = orderMessages;
		}
		public Date getPayTime() {
			return this.payTime;
		}
		public void setPayTime(Date payTime) {
			this.payTime = payTime;
		}
		public String getPayType() {
			return this.payType;
		}
		public void setPayType(String payType) {
			this.payType = payType;
		}
		public String getPostFee() {
			return this.postFee;
		}
		public void setPostFee(String postFee) {
			this.postFee = postFee;
		}
		public TopReceiverDo getReceiver() {
			return this.receiver;
		}
		public void setReceiver(TopReceiverDo receiver) {
			this.receiver = receiver;
		}
		public String getShipping() {
			return this.shipping;
		}
		public void setShipping(String shipping) {
			this.shipping = shipping;
		}
		public String getSnapshotUrl() {
			return this.snapshotUrl;
		}
		public void setSnapshotUrl(String snapshotUrl) {
			this.snapshotUrl = snapshotUrl;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public List<SubOrderDetail> getSubPurchaseOrders() {
			return this.subPurchaseOrders;
		}
		public void setSubPurchaseOrders(List<SubOrderDetail> subPurchaseOrders) {
			this.subPurchaseOrders = subPurchaseOrders;
		}
		public Long getSupplierFlag() {
			return this.supplierFlag;
		}
		public void setSupplierFlag(Long supplierFlag) {
			this.supplierFlag = supplierFlag;
		}
		public String getSupplierFrom() {
			return this.supplierFrom;
		}
		public void setSupplierFrom(String supplierFrom) {
			this.supplierFrom = supplierFrom;
		}
		public String getSupplierMemo() {
			return this.supplierMemo;
		}
		public void setSupplierMemo(String supplierMemo) {
			this.supplierMemo = supplierMemo;
		}
		public String getSupplierUsername() {
			return this.supplierUsername;
		}
		public void setSupplierUsername(String supplierUsername) {
			this.supplierUsername = supplierUsername;
		}
		public Long getTcOrderId() {
			return this.tcOrderId;
		}
		public void setTcOrderId(Long tcOrderId) {
			this.tcOrderId = tcOrderId;
		}
		public String getTotalFee() {
			return this.totalFee;
		}
		public void setTotalFee(String totalFee) {
			this.totalFee = totalFee;
		}
		public String getTradeType() {
			return this.tradeType;
		}
		public void setTradeType(String tradeType) {
			this.tradeType = tradeType;
		}

}



}
