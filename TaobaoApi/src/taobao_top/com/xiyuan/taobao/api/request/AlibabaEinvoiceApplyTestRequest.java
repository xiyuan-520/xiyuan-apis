package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.AlibabaEinvoiceApplyTestResponse;

/**
 * TOP API: alibaba.einvoice.apply.test request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class AlibabaEinvoiceApplyTestRequest extends BaseTaobaoRequest<AlibabaEinvoiceApplyTestResponse> {
	
	

	/** 
	* 0=个人，1=企业
	 */
	private Long businessType;

	/** 
	* 买家抬头
	 */
	private String payerName;

	/** 
	* 买家税号
	 */
	private String payerRegisterNo;

	/** 
	* 订单号
	 */
	private String platformTid;

	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public Long getBusinessType() {
		return this.businessType;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}

	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}

	public String getPlatformTid() {
		return this.platformTid;
	}

	public String getApiMethodName() {
		return "alibaba.einvoice.apply.test";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("business_type", this.businessType);
		txtParams.put("payer_name", this.payerName);
		txtParams.put("payer_register_no", this.payerRegisterNo);
		txtParams.put("platform_tid", this.platformTid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceApplyTestResponse> getResponseClass() {
		return AlibabaEinvoiceApplyTestResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(businessType, "businessType");
		RequestCheckUtils.checkNotEmpty(payerName, "payerName");
		RequestCheckUtils.checkNotEmpty(platformTid, "platformTid");
	}
	

}