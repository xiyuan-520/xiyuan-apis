package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.CainiaoCloudprintMystdtemplatesGetResponse;

/**
 * TOP API: cainiao.cloudprint.mystdtemplates.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class CainiaoCloudprintMystdtemplatesGetRequest extends BaseTaobaoRequest<CainiaoCloudprintMystdtemplatesGetResponse> {
	
	

	public String getApiMethodName() {
		return "cainiao.cloudprint.mystdtemplates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintMystdtemplatesGetResponse> getResponseClass() {
		return CainiaoCloudprintMystdtemplatesGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}