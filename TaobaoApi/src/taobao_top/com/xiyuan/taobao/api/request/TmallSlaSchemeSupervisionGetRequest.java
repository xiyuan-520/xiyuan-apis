package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TmallSlaSchemeSupervisionGetResponse;

/**
 * TOP API: tmall.sla.scheme.supervision.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class TmallSlaSchemeSupervisionGetRequest extends BaseTaobaoRequest<TmallSlaSchemeSupervisionGetResponse> {
	
	

	/** 
	* 获取返回结果说明
	 */
	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public String getApiMethodName() {
		return "tmall.sla.scheme.supervision.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallSlaSchemeSupervisionGetResponse> getResponseClass() {
		return TmallSlaSchemeSupervisionGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
	}
	

}