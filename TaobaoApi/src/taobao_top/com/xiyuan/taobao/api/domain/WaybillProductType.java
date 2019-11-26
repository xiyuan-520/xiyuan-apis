package com.xiyuan.taobao.api.domain;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;


/**
 * 物流产品类型
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillProductType extends TaobaoObject {

	private static final long serialVersionUID = 3675212393385391438L;

	/**
	 * 物流产品类型编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 物流产品类型名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 物流服务类型列表
	 */
	@ApiListField("service_types")
	@ApiField("waybill_service_type")
	private List<WaybillServiceType> serviceTypes;


	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<WaybillServiceType> getServiceTypes() {
		return this.serviceTypes;
	}
	public void setServiceTypes(List<WaybillServiceType> serviceTypes) {
		this.serviceTypes = serviceTypes;
	}

}
