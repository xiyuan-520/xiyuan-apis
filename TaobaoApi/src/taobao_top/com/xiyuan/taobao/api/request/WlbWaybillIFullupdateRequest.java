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
import com.xiyuan.taobao.api.response.WlbWaybillIFullupdateResponse;

/**
 * TOP API: taobao.wlb.waybill.i.fullupdate request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WlbWaybillIFullupdateRequest extends BaseTaobaoRequest<WlbWaybillIFullupdateResponse> {
	
	

	/** 
	* 更新面单信息请求
	 */
	private String waybillApplyFullUpdateRequest;

	public void setWaybillApplyFullUpdateRequest(String waybillApplyFullUpdateRequest) {
		this.waybillApplyFullUpdateRequest = waybillApplyFullUpdateRequest;
	}

	public void setWaybillApplyFullUpdateRequest(WaybillApplyFullUpdateRequest waybillApplyFullUpdateRequest) {
		this.waybillApplyFullUpdateRequest = new JSONWriter(false,true).write(waybillApplyFullUpdateRequest);
	}

	public String getWaybillApplyFullUpdateRequest() {
		return this.waybillApplyFullUpdateRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.fullupdate";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_apply_full_update_request", this.waybillApplyFullUpdateRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillIFullupdateResponse> getResponseClass() {
		return WlbWaybillIFullupdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 包裹里面的商品名称
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageItem extends TaobaoObject {

	private static final long serialVersionUID = 4165968636834392993L;

	/**
		 * 商品数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 商品名称
		 */
		@ApiField("item_name")
		private String itemName;
	

	public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

}

	/**
 * 物流服务能力集合
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class LogisticsService extends TaobaoObject {

	private static final long serialVersionUID = 5116447157924699418L;

	/**
		 * 服务编码
		 */
		@ApiField("service_code")
		private String serviceCode;
		/**
		 * 服务类型值，json格式表示
		 */
		@ApiField("service_value4_json")
		private String serviceValue4Json;
	

	public String getServiceCode() {
			return this.serviceCode;
		}
		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}
		public String getServiceValue4Json() {
			return this.serviceValue4Json;
		}
		public void setServiceValue4Json(String serviceValue4Json) {
			this.serviceValue4Json = serviceValue4Json;
		}

}

	/**
 * 收\发货地址
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillAddress extends TaobaoObject {

	private static final long serialVersionUID = 4892537367494926823L;

	/**
		 * 详细地址
		 */
		@ApiField("address_detail")
		private String addressDetail;
		/**
		 * 区名称（三级地址）
		 */
		@ApiField("area")
		private String area;
		/**
		 * 市名称（二级地址）
		 */
		@ApiField("city")
		private String city;
		/**
		 * 一级地址（省、直辖市
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道\镇名称（四级地址）
		 */
		@ApiField("town")
		private String town;
	

	public String getAddressDetail() {
			return this.addressDetail;
		}
		public void setAddressDetail(String addressDetail) {
			this.addressDetail = addressDetail;
		}
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
 * 更新面单信息请求
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillApplyFullUpdateRequest extends TaobaoObject {

	private static final long serialVersionUID = 6261572458897459864L;

	/**
		 * 收\发货地址
		 */
		@ApiField("consignee_address")
		private WaybillAddress consigneeAddress;
		/**
		 * 收件人姓名
		 */
		@ApiField("consignee_name")
		private String consigneeName;
		/**
		 * 收件人电话
		 */
		@ApiField("consignee_phone")
		private String consigneePhone;
		/**
		 * 快递服务商CODE
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 物流服务能力集合
		 */
		@ApiListField("logistics_service_list")
		@ApiField("logistics_service")
		private List<LogisticsService> logisticsServiceList;
		/**
		 * 订单渠道类型
		 */
		@ApiField("order_channels_type")
		private String orderChannelsType;
		/**
		 * ERP 订单号或包裹号
		 */
		@ApiField("package_id")
		private String packageId;
		/**
		 * 包裹里面的商品名称
		 */
		@ApiListField("package_items")
		@ApiField("package_item")
		private List<PackageItem> packageItems;
		/**
		 * 快递服务产品类型编码
		 */
		@ApiField("product_type")
		private String productType;
		/**
		 * 使用者ID
		 */
		@ApiField("real_user_id")
		private Long realUserId;
		/**
		 * 发件人姓名
		 */
		@ApiField("send_name")
		private String sendName;
		/**
		 * 发件人联系方式
		 */
		@ApiField("send_phone")
		private String sendPhone;
		/**
		 * 交易订单号（组合表示合并订单）
		 */
		@ApiListField("trade_order_list")
		@ApiField("string")
		private List<String> tradeOrderList;
		/**
		 * 包裹体积 单位为ML(毫升)或立方厘米
		 */
		@ApiField("volume")
		private Long volume;
		/**
		 * 电子面单单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
		/**
		 * 包裹重量 单位为G(克)
		 */
		@ApiField("weight")
		private Long weight;
	

	public WaybillAddress getConsigneeAddress() {
			return this.consigneeAddress;
		}
		public void setConsigneeAddress(WaybillAddress consigneeAddress) {
			this.consigneeAddress = consigneeAddress;
		}
		public String getConsigneeName() {
			return this.consigneeName;
		}
		public void setConsigneeName(String consigneeName) {
			this.consigneeName = consigneeName;
		}
		public String getConsigneePhone() {
			return this.consigneePhone;
		}
		public void setConsigneePhone(String consigneePhone) {
			this.consigneePhone = consigneePhone;
		}
		public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public List<LogisticsService> getLogisticsServiceList() {
			return this.logisticsServiceList;
		}
		public void setLogisticsServiceList(List<LogisticsService> logisticsServiceList) {
			this.logisticsServiceList = logisticsServiceList;
		}
		public String getOrderChannelsType() {
			return this.orderChannelsType;
		}
		public void setOrderChannelsType(String orderChannelsType) {
			this.orderChannelsType = orderChannelsType;
		}
		public String getPackageId() {
			return this.packageId;
		}
		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}
		public List<PackageItem> getPackageItems() {
			return this.packageItems;
		}
		public void setPackageItems(List<PackageItem> packageItems) {
			this.packageItems = packageItems;
		}
		public String getProductType() {
			return this.productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		public Long getRealUserId() {
			return this.realUserId;
		}
		public void setRealUserId(Long realUserId) {
			this.realUserId = realUserId;
		}
		public String getSendName() {
			return this.sendName;
		}
		public void setSendName(String sendName) {
			this.sendName = sendName;
		}
		public String getSendPhone() {
			return this.sendPhone;
		}
		public void setSendPhone(String sendPhone) {
			this.sendPhone = sendPhone;
		}
		public List<String> getTradeOrderList() {
			return this.tradeOrderList;
		}
		public void setTradeOrderList(List<String> tradeOrderList) {
			this.tradeOrderList = tradeOrderList;
		}
		public Long getVolume() {
			return this.volume;
		}
		public void setVolume(Long volume) {
			this.volume = volume;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}
		public Long getWeight() {
			return this.weight;
		}
		public void setWeight(Long weight) {
			this.weight = weight;
		}

}


}