package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.WlbWaybillIProductResponse;

/**
 * TOP API: taobao.wlb.waybill.i.product request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WlbWaybillIProductRequest extends BaseTaobaoRequest<WlbWaybillIProductResponse> {
	
	

	/** 
	* 查询物流商电子面单产品类型入参
	 */
	private String waybillProductTypeRequest;

	public void setWaybillProductTypeRequest(String waybillProductTypeRequest) {
		this.waybillProductTypeRequest = waybillProductTypeRequest;
	}

	public void setWaybillProductTypeRequest(WaybillProductTypeRequest waybillProductTypeRequest) {
		this.waybillProductTypeRequest = new JSONWriter(false,true).write(waybillProductTypeRequest);
	}

	public String getWaybillProductTypeRequest() {
		return this.waybillProductTypeRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.product";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_product_type_request", this.waybillProductTypeRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillIProductResponse> getResponseClass() {
		return WlbWaybillIProductResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 查询物流商电子面单产品类型入参
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillProductTypeRequest extends TaobaoObject {

	private static final long serialVersionUID = 6662257693157529747L;

	/**
		 * 物流商编码CODE
		 */
		@ApiField("cp_code")
		private String cpCode;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}

}


}