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
import com.xiyuan.taobao.api.response.CainiaoWaybillIiGetResponse;

/**
 * TOP API: cainiao.waybill.ii.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.20
 */
public class CainiaoWaybillIiGetRequest extends BaseTaobaoRequest<CainiaoWaybillIiGetResponse> {
	
	

	/** 
	* 入参信息
	 */
	private String paramWaybillCloudPrintApplyNewRequest;

	public void setParamWaybillCloudPrintApplyNewRequest(String paramWaybillCloudPrintApplyNewRequest) {
		this.paramWaybillCloudPrintApplyNewRequest = paramWaybillCloudPrintApplyNewRequest;
	}

	public void setParamWaybillCloudPrintApplyNewRequest(WaybillCloudPrintApplyNewRequest paramWaybillCloudPrintApplyNewRequest) {
		this.paramWaybillCloudPrintApplyNewRequest = new JSONWriter(false,true).write(paramWaybillCloudPrintApplyNewRequest);
	}

	public String getParamWaybillCloudPrintApplyNewRequest() {
		return this.paramWaybillCloudPrintApplyNewRequest;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_waybill_cloud_print_apply_new_request", this.paramWaybillCloudPrintApplyNewRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiGetResponse> getResponseClass() {
		return CainiaoWaybillIiGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 发货地址需要通过<a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.3OFCPk&treeId=17&articleId=104860&docType=1">search接口</a>
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class AddressDto extends TaobaoObject {

	private static final long serialVersionUID = 4384455185626854549L;

	/**
		 * 城市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 详细地址
		 */
		@ApiField("detail")
		private String detail;
		/**
		 * 区
		 */
		@ApiField("district")
		private String district;
		/**
		 * 省
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道
		 */
		@ApiField("town")
		private String town;
	

	public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDetail() {
			return this.detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getDistrict() {
			return this.district;
		}
		public void setDistrict(String district) {
			this.district = district;
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
 * 发货人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UserInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 4417619948222969262L;

	/**
		 * 发货地址需要通过<a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.3OFCPk&treeId=17&articleId=104860&docType=1">search接口</a>
		 */
		@ApiField("address")
		private AddressDto address;
		/**
		 * 手机号码
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 固定电话
		 */
		@ApiField("phone")
		private String phone;
	

	public AddressDto getAddress() {
			return this.address;
		}
		public void setAddress(AddressDto address) {
			this.address = address;
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
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}

}

	/**
 * 订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 7325149373548984871L;

	/**
		 * <a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.8cf9Nj&treeId=17&articleId=105085&docType=1#2">订单渠道平台编码</a>
		 */
		@ApiField("order_channels_type")
		private String orderChannelsType;
		/**
		 * 订单号,数量限制100
		 */
		@ApiListField("trade_order_list")
		@ApiField("string")
		private List<String> tradeOrderList;
	

	public String getOrderChannelsType() {
			return this.orderChannelsType;
		}
		public void setOrderChannelsType(String orderChannelsType) {
			this.orderChannelsType = orderChannelsType;
		}
		public List<String> getTradeOrderList() {
			return this.tradeOrderList;
		}
		public void setTradeOrderList(List<String> tradeOrderList) {
			this.tradeOrderList = tradeOrderList;
		}

}

	/**
 * 商品信息,数量限制为100
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Item extends TaobaoObject {

	private static final long serialVersionUID = 1142239795839515844L;

	/**
		 * 数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
	

	public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}

}

	/**
 * 包裹信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 6646536456668723414L;

	/**
		 * 大件快运中的货品描述，比如服装，家具
		 */
		@ApiField("goods_description")
		private String goodsDescription;
		/**
		 * 包裹id,拆合单使用，<a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.8cf9Nj&treeId=17&articleId=105085&docType=1#10">使用方式</a> 注：该字段必须大小写不可重复，例如：123-A,123-a 不可当做不同ID，否则存在一定可能取号失败
		 */
		@ApiField("id")
		private String id;
		/**
		 * 商品信息,数量限制为100
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * 大件快运中的包装方式描述
		 */
		@ApiField("packaging_description")
		private String packagingDescription;
		/**
		 * 子母件模式中的总包裹数/总件数，用于打印当前包裹处于总件数的位置比如5-2，可以表示总包裹数为5，当前为第2个包裹，只有快运公司需要传入，其他的可以不用传入
		 */
		@ApiField("total_packages_count")
		private Long totalPackagesCount;
		/**
		 * 体积, 单位 ml
		 */
		@ApiField("volume")
		private Long volume;
		/**
		 * 重量,单位 g
		 */
		@ApiField("weight")
		private Long weight;
	

	public String getGoodsDescription() {
			return this.goodsDescription;
		}
		public void setGoodsDescription(String goodsDescription) {
			this.goodsDescription = goodsDescription;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public List<Item> getItems() {
			return this.items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		public String getPackagingDescription() {
			return this.packagingDescription;
		}
		public void setPackagingDescription(String packagingDescription) {
			this.packagingDescription = packagingDescription;
		}
		public Long getTotalPackagesCount() {
			return this.totalPackagesCount;
		}
		public void setTotalPackagesCount(Long totalPackagesCount) {
			this.totalPackagesCount = totalPackagesCount;
		}
		public Long getVolume() {
			return this.volume;
		}
		public void setVolume(Long volume) {
			this.volume = volume;
		}
		public Long getWeight() {
			return this.weight;
		}
		public void setWeight(Long weight) {
			this.weight = weight;
		}

}

	/**
 * 请求面单信息，数量限制为10
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TradeOrderInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 6385476878241864458L;

	/**
		 * 服务值,传值方式见<a href="http://open.taobao.com/docs/doc.htm?spm=a219a.7629140.0.0.seE3Yp&treeId=17&articleId=106156&docType=1">链接</a>
		 */
		@ApiField("logistics_services")
		private String logisticsServices;
		/**
		 * <a href="http://open.taobao.com/docs/doc.htm?docType=1&articleId=105086&treeId=17&platformId=17#6">请求ID</a>
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 订单信息
		 */
		@ApiField("order_info")
		private OrderInfoDto orderInfo;
		/**
		 * 包裹信息
		 */
		@ApiField("package_info")
		private PackageInfoDto packageInfo;
		/**
		 * 收件人信息
		 */
		@ApiField("recipient")
		private UserInfoDto recipient;
		/**
		 * 标准模板模板URL<a href="http://open.taobao.com/doc2/apiDetail.htm?apiId=26756">获取方式</a>,<a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.Wl5ToC&treeId=17&articleId=105049&docType=1">打印组件使用文档</a>
		 */
		@ApiField("template_url")
		private String templateUrl;
		/**
		 * 使用者ID<a href="http://open.taobao.com/support/hotProblemDetail.htm?spm=a219a.7386793.0.0.4mwx9s&id=244622&tagId=">获取方式</a>
		 */
		@ApiField("user_id")
		private Long userId;
	

	public String getLogisticsServices() {
			return this.logisticsServices;
		}
		public void setLogisticsServices(String logisticsServices) {
			this.logisticsServices = logisticsServices;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public OrderInfoDto getOrderInfo() {
			return this.orderInfo;
		}
		public void setOrderInfo(OrderInfoDto orderInfo) {
			this.orderInfo = orderInfo;
		}
		public PackageInfoDto getPackageInfo() {
			return this.packageInfo;
		}
		public void setPackageInfo(PackageInfoDto packageInfo) {
			this.packageInfo = packageInfo;
		}
		public UserInfoDto getRecipient() {
			return this.recipient;
		}
		public void setRecipient(UserInfoDto recipient) {
			this.recipient = recipient;
		}
		public String getTemplateUrl() {
			return this.templateUrl;
		}
		public void setTemplateUrl(String templateUrl) {
			this.templateUrl = templateUrl;
		}
		public Long getUserId() {
			return this.userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}

}

	/**
 * 入参信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillCloudPrintApplyNewRequest extends TaobaoObject {

	private static final long serialVersionUID = 2449677523584526659L;

	/**
		 * <a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.8cf9Nj&treeId=17&articleId=105085&docType=1#1">物流公司Code</a>
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 是否使用智分宝预分拣， 仓库WMS系统对接落地配业务，其它场景请不要使用
		 */
		@ApiField("dms_sorting")
		private Boolean dmsSorting;
		/**
		 * 目前已经不推荐使用此字段，请不要使用
		 */
		@ApiField("product_code")
		private String productCode;
		/**
		 * 配送资源code， 仓库WMS系统对接落地配业务，其它场景请不要使用
		 */
		@ApiField("resource_code")
		private String resourceCode;
		/**
		 * 发货人信息
		 */
		@ApiField("sender")
		private UserInfoDto sender;
		/**
		 * 仓code， 仓库WMS系统对接落地配业务，其它场景请不要使用
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 订单上是否带3PLtiming属性, 该属性需要严格与订单上属性保持一致，如果不确定，请使用默认false。
		 */
		@ApiField("three_pl_timing")
		private Boolean threePlTiming;
		/**
		 * 请求面单信息，数量限制为10
		 */
		@ApiListField("trade_order_info_dtos")
		@ApiField("trade_order_info_dto")
		private List<TradeOrderInfoDto> tradeOrderInfoDtos;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public Boolean getDmsSorting() {
			return this.dmsSorting;
		}
		public void setDmsSorting(Boolean dmsSorting) {
			this.dmsSorting = dmsSorting;
		}
		public String getProductCode() {
			return this.productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public String getResourceCode() {
			return this.resourceCode;
		}
		public void setResourceCode(String resourceCode) {
			this.resourceCode = resourceCode;
		}
		public UserInfoDto getSender() {
			return this.sender;
		}
		public void setSender(UserInfoDto sender) {
			this.sender = sender;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public Boolean getThreePlTiming() {
			return this.threePlTiming;
		}
		public void setThreePlTiming(Boolean threePlTiming) {
			this.threePlTiming = threePlTiming;
		}
		public List<TradeOrderInfoDto> getTradeOrderInfoDtos() {
			return this.tradeOrderInfoDtos;
		}
		public void setTradeOrderInfoDtos(List<TradeOrderInfoDto> tradeOrderInfoDtos) {
			this.tradeOrderInfoDtos = tradeOrderInfoDtos;
		}

}


}