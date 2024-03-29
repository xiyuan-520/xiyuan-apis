package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.ShopcatsListGetResponse;

/**
 * TOP API: taobao.shopcats.list.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class ShopcatsListGetRequest extends BaseTaobaoRequest<ShopcatsListGetResponse> {
	
	

	/** 
	* 需要返回的字段列表，见ShopCat，默认返回：cid,parent_cid,name,is_parent
	 */
	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public String getApiMethodName() {
		return "taobao.shopcats.list.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ShopcatsListGetResponse> getResponseClass() {
		return ShopcatsListGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
	}
	

}