package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.AlibabaEinvoiceApplyGetResponse;

/**
 * TOP API: alibaba.einvoice.apply.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.11.23
 */
public class AlibabaEinvoiceApplyGetRequest extends BaseTaobaoRequest<AlibabaEinvoiceApplyGetResponse> {
	
	

	/** 
	* 开票申请ID，跟消息中的apply_id对应，传入applyId后，只会返回一条开票申请消息
	 */
	private String applyId;

	/** 
	* 平台订单号
	 */
	private String platformTid;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyId() {
		return this.applyId;
	}

	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}

	public String getPlatformTid() {
		return this.platformTid;
	}

	public String getApiMethodName() {
		return "alibaba.einvoice.apply.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("apply_id", this.applyId);
		txtParams.put("platform_tid", this.platformTid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceApplyGetResponse> getResponseClass() {
		return AlibabaEinvoiceApplyGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(platformTid, "platformTid");
	}
	

}