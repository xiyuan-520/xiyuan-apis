package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8437573728727494223L;

	/** 
	 * CP网点信息及对应的商家的发货信息
	 */
	@ApiListField("waybill_apply_subscription_cols")
	@ApiField("waybill_apply_subscription_info")
	private List<WaybillApplySubscriptionInfo> waybillApplySubscriptionCols;


	public void setWaybillApplySubscriptionCols(List<WaybillApplySubscriptionInfo> waybillApplySubscriptionCols) {
		this.waybillApplySubscriptionCols = waybillApplySubscriptionCols;
	}
	public List<WaybillApplySubscriptionInfo> getWaybillApplySubscriptionCols( ) {
		return this.waybillApplySubscriptionCols;
	}
	
	/**
 * 当前网点下的发货地址
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class AddressDto extends TaobaoObject {

	private static final long serialVersionUID = 2321565724916733949L;

	/**
		 * 市名称（二级地址）
		 */
		@ApiField("city")
		private String city;
		/**
		 * 详细地址
		 */
		@ApiField("detail")
		private String detail;
		/**
		 * 区名称（三级地址）
		 */
		@ApiField("district")
		private String district;
		/**
		 * 省名称（一级地址）
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道\镇名称（四级地址）
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
 * 服务属性定义
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ServiceAttributeDto extends TaobaoObject {

	private static final long serialVersionUID = 5677897362894917336L;

	/**
		 * 属性的值，用户实际传入的值
		 */
		@ApiField("attribute_code")
		private String attributeCode;
		/**
		 * 属性的名称，可以用于前端的展示
		 */
		@ApiField("attribute_name")
		private String attributeName;
		/**
		 * 属性的类型，可能值有 [number, string, enum]
		 */
		@ApiField("attribute_type")
		private String attributeType;
		/**
		 * 枚举类型的枚举值，key为用户选中的需要传值的数据，value为对应的描述，可以作为前端的展示
		 */
		@ApiField("type_desc")
		private String typeDesc;
	

	public String getAttributeCode() {
			return this.attributeCode;
		}
		public void setAttributeCode(String attributeCode) {
			this.attributeCode = attributeCode;
		}
		public String getAttributeName() {
			return this.attributeName;
		}
		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}
		public String getAttributeType() {
			return this.attributeType;
		}
		public void setAttributeType(String attributeType) {
			this.attributeType = attributeType;
		}
		public String getTypeDesc() {
			return this.typeDesc;
		}
		public void setTypeDesc(String typeDesc) {
			this.typeDesc = typeDesc;
		}

}

	/**
 * 可用的服务信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ServiceInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 2242239951947442957L;

	/**
		 * 该服务是否为必选服务
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 服务属性定义
		 */
		@ApiListField("service_attributes")
		@ApiField("service_attribute_dto")
		private List<ServiceAttributeDto> serviceAttributes;
		/**
		 * 服务编码
		 */
		@ApiField("service_code")
		private String serviceCode;
		/**
		 * 服务的官方描述，可以用作前端展示
		 */
		@ApiField("service_desc")
		private String serviceDesc;
		/**
		 * 服务名称
		 */
		@ApiField("service_name")
		private String serviceName;
	

	public Boolean getRequired() {
			return this.required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
		public List<ServiceAttributeDto> getServiceAttributes() {
			return this.serviceAttributes;
		}
		public void setServiceAttributes(List<ServiceAttributeDto> serviceAttributes) {
			this.serviceAttributes = serviceAttributes;
		}
		public String getServiceCode() {
			return this.serviceCode;
		}
		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}
		public String getServiceDesc() {
			return this.serviceDesc;
		}
		public void setServiceDesc(String serviceDesc) {
			this.serviceDesc = serviceDesc;
		}
		public String getServiceName() {
			return this.serviceName;
		}
		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

}

	/**
 * CP网点信息及对应的商家的发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillBranchAccount extends TaobaoObject {

	private static final long serialVersionUID = 3767215368356248671L;

	/**
		 * 已用面单数量
		 */
		@ApiField("allocated_quantity")
		private Long allocatedQuantity;
		/**
		 * 网点Code
		 */
		@ApiField("branch_code")
		private String branchCode;
		/**
		 * 网点名称
		 */
		@ApiField("branch_name")
		private String branchName;
		/**
		 * 网点状态
		 */
		@ApiField("branch_status")
		private Long branchStatus;
		/**
		 * 取消的面单总数
		 */
		@ApiField("cancel_quantity")
		private Long cancelQuantity;
		/**
		 * 已经打印的面单总数
		 */
		@ApiField("print_quantity")
		private Long printQuantity;
		/**
		 * 电子面单余额数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 号段信息
		 */
		@ApiField("segment_code")
		private String segmentCode;
		/**
		 * 可用的服务信息列表
		 */
		@ApiListField("service_info_cols")
		@ApiField("service_info_dto")
		private List<ServiceInfoDto> serviceInfoCols;
		/**
		 * 当前网点下的发货地址
		 */
		@ApiListField("shipp_address_cols")
		@ApiField("address_dto")
		private List<AddressDto> shippAddressCols;
	

	public Long getAllocatedQuantity() {
			return this.allocatedQuantity;
		}
		public void setAllocatedQuantity(Long allocatedQuantity) {
			this.allocatedQuantity = allocatedQuantity;
		}
		public String getBranchCode() {
			return this.branchCode;
		}
		public void setBranchCode(String branchCode) {
			this.branchCode = branchCode;
		}
		public String getBranchName() {
			return this.branchName;
		}
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		public Long getBranchStatus() {
			return this.branchStatus;
		}
		public void setBranchStatus(Long branchStatus) {
			this.branchStatus = branchStatus;
		}
		public Long getCancelQuantity() {
			return this.cancelQuantity;
		}
		public void setCancelQuantity(Long cancelQuantity) {
			this.cancelQuantity = cancelQuantity;
		}
		public Long getPrintQuantity() {
			return this.printQuantity;
		}
		public void setPrintQuantity(Long printQuantity) {
			this.printQuantity = printQuantity;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getSegmentCode() {
			return this.segmentCode;
		}
		public void setSegmentCode(String segmentCode) {
			this.segmentCode = segmentCode;
		}
		public List<ServiceInfoDto> getServiceInfoCols() {
			return this.serviceInfoCols;
		}
		public void setServiceInfoCols(List<ServiceInfoDto> serviceInfoCols) {
			this.serviceInfoCols = serviceInfoCols;
		}
		public List<AddressDto> getShippAddressCols() {
			return this.shippAddressCols;
		}
		public void setShippAddressCols(List<AddressDto> shippAddressCols) {
			this.shippAddressCols = shippAddressCols;
		}

}

	/**
 * CP网点信息及对应的商家的发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillApplySubscriptionInfo extends TaobaoObject {

	private static final long serialVersionUID = 7581675632926683988L;

	/**
		 * CP网点信息及对应的商家的发货信息
		 */
		@ApiListField("branch_account_cols")
		@ApiField("waybill_branch_account")
		private List<WaybillBranchAccount> branchAccountCols;
		/**
		 * 物流服务商ID
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 物流服务商业务类型 1：直营 2：加盟 3：落地配 4：直营带网点
		 */
		@ApiField("cp_type")
		private Long cpType;
	

	public List<WaybillBranchAccount> getBranchAccountCols() {
			return this.branchAccountCols;
		}
		public void setBranchAccountCols(List<WaybillBranchAccount> branchAccountCols) {
			this.branchAccountCols = branchAccountCols;
		}
		public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public Long getCpType() {
			return this.cpType;
		}
		public void setCpType(Long cpType) {
			this.cpType = cpType;
		}

}



}
