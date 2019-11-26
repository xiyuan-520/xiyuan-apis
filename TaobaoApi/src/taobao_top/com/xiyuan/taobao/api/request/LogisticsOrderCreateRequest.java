package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.LogisticsOrderCreateResponse;

/**
 * TOP API: taobao.logistics.order.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class LogisticsOrderCreateRequest extends BaseTaobaoRequest<LogisticsOrderCreateResponse> {
	
	

	/** 
	* 运送的货物名称列表，用|号隔开
	 */
	private String goodsNames;

	/** 
	* 运送货物的数量列表，用|号隔开
	 */
	private String goodsQuantities;

	/** 
	* 创建订单同时是否进行发货，默认发货。
	 */
	private Boolean isConsign;

	/** 
	* 运送货物的单价列表(注意：单位为分），用|号隔开
	 */
	private String itemValues;

	/** 
	* 发货的物流公司代码，如申通=STO，圆通=YTO。is_consign=true时，此项必填。
	 */
	private String logisCompanyCode;

	/** 
	* 发货方式,默认为自己联系发货。可选值:ONLINE(在线下单)、OFFLINE(自己联系)。
	 */
	private String logisType;

	/** 
	* 发货的物流公司运单号。在logis_type=OFFLINE且is_consign=true时，此项必填。
	 */
	private String mailNo;

	/** 
	* 物流发货类型：1-普通订单
不填为默认类型 1-普通订单
	 */
	private Long orderType;

	/** 
	* 卖家旺旺号
	 */
	private String sellerWangwangId;

	/** 
	* 运费承担方式。1为买家承担运费，2为卖家承担运费，其他值为错误参数。
	 */
	private Long shipping;

	/** 
	* 订单的交易号码
	 */
	private Long tradeId;

	public void setGoodsNames(String goodsNames) {
		this.goodsNames = goodsNames;
	}

	public String getGoodsNames() {
		return this.goodsNames;
	}

	public void setGoodsQuantities(String goodsQuantities) {
		this.goodsQuantities = goodsQuantities;
	}

	public String getGoodsQuantities() {
		return this.goodsQuantities;
	}

	public void setIsConsign(Boolean isConsign) {
		this.isConsign = isConsign;
	}

	public Boolean getIsConsign() {
		return this.isConsign;
	}

	public void setItemValues(String itemValues) {
		this.itemValues = itemValues;
	}

	public String getItemValues() {
		return this.itemValues;
	}

	public void setLogisCompanyCode(String logisCompanyCode) {
		this.logisCompanyCode = logisCompanyCode;
	}

	public String getLogisCompanyCode() {
		return this.logisCompanyCode;
	}

	public void setLogisType(String logisType) {
		this.logisType = logisType;
	}

	public String getLogisType() {
		return this.logisType;
	}

	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

	public String getMailNo() {
		return this.mailNo;
	}

	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public Long getOrderType() {
		return this.orderType;
	}

	public void setSellerWangwangId(String sellerWangwangId) {
		this.sellerWangwangId = sellerWangwangId;
	}

	public String getSellerWangwangId() {
		return this.sellerWangwangId;
	}

	public void setShipping(Long shipping) {
		this.shipping = shipping;
	}

	public Long getShipping() {
		return this.shipping;
	}

	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public Long getTradeId() {
		return this.tradeId;
	}

	public String getApiMethodName() {
		return "taobao.logistics.order.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("goods_names", this.goodsNames);
		txtParams.put("goods_quantities", this.goodsQuantities);
		txtParams.put("is_consign", this.isConsign);
		txtParams.put("item_values", this.itemValues);
		txtParams.put("logis_company_code", this.logisCompanyCode);
		txtParams.put("logis_type", this.logisType);
		txtParams.put("mail_no", this.mailNo);
		txtParams.put("order_type", this.orderType);
		txtParams.put("seller_wangwang_id", this.sellerWangwangId);
		txtParams.put("shipping", this.shipping);
		txtParams.put("trade_id", this.tradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsOrderCreateResponse> getResponseClass() {
		return LogisticsOrderCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(goodsNames, "goodsNames");
		RequestCheckUtils.checkNotEmpty(goodsQuantities, "goodsQuantities");
		RequestCheckUtils.checkNotEmpty(itemValues, "itemValues");
		RequestCheckUtils.checkNotEmpty(sellerWangwangId, "sellerWangwangId");
	}
	

}