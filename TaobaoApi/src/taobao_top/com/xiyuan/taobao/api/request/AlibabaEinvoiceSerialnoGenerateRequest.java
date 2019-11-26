package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.AlibabaEinvoiceSerialnoGenerateResponse;

/**
 * TOP API: alibaba.einvoice.serialno.generate request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class AlibabaEinvoiceSerialnoGenerateRequest extends BaseTaobaoRequest<AlibabaEinvoiceSerialnoGenerateResponse> {
	
	

	public String getApiMethodName() {
		return "alibaba.einvoice.serialno.generate";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoiceSerialnoGenerateResponse> getResponseClass() {
		return AlibabaEinvoiceSerialnoGenerateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}