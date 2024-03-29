package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.LogisticsAddressRemoveResponse;

/**
 * TOP API: taobao.logistics.address.remove request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class LogisticsAddressRemoveRequest extends BaseTaobaoRequest<LogisticsAddressRemoveResponse> {
	
	

	/** 
	* 地址库ID
	 */
	private Long contactId;

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public Long getContactId() {
		return this.contactId;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.remove";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("contact_id", this.contactId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsAddressRemoveResponse> getResponseClass() {
		return LogisticsAddressRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(contactId, "contactId");
	}
	

}