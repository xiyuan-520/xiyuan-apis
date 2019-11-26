package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.CainiaoCloudprintSingleCustomareaGetResponse;

/**
 * TOP API: cainiao.cloudprint.single.customarea.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.10.10
 */
public class CainiaoCloudprintSingleCustomareaGetRequest extends BaseTaobaoRequest<CainiaoCloudprintSingleCustomareaGetResponse> {
	
	

	/** 
	* 这是商家用户id
	 */
	private Long sellerId;

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getSellerId() {
		return this.sellerId;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.single.customarea.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("seller_id", this.sellerId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintSingleCustomareaGetResponse> getResponseClass() {
		return CainiaoCloudprintSingleCustomareaGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}