package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.CainiaoWaybillIiCancelResponse;

/**
 * TOP API: cainiao.waybill.ii.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class CainiaoWaybillIiCancelRequest extends BaseTaobaoRequest<CainiaoWaybillIiCancelResponse> {
	
	

	/** 
	* 快递公司code
	 */
	private String cpCode;

	/** 
	* 电子面单号
	 */
	private String waybillCode;

	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public String getCpCode() {
		return this.cpCode;
	}

	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
	}

	public String getWaybillCode() {
		return this.waybillCode;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cp_code", this.cpCode);
		txtParams.put("waybill_code", this.waybillCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiCancelResponse> getResponseClass() {
		return CainiaoWaybillIiCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cpCode, "cpCode");
		RequestCheckUtils.checkNotEmpty(waybillCode, "waybillCode");
	}
	

}