package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.UserSellerGetResponse;

/**
 * TOP API: taobao.user.seller.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class UserSellerGetRequest extends BaseTaobaoRequest<UserSellerGetResponse> {
	
	

	/** 
	* 需要返回的字段列表，可选值为返回示例值中的可以看到的字段
	 */
	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public String getApiMethodName() {
		return "taobao.user.seller.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<UserSellerGetResponse> getResponseClass() {
		return UserSellerGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 200, "fields");
	}
	

}