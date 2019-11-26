package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TopAuthTokenCreateResponse;

/**
 * TOP API: taobao.top.auth.token.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class TopAuthTokenCreateRequest extends BaseTaobaoRequest<TopAuthTokenCreateResponse> {
	
	

	/** 
	* 授权code，grantType==authorization_code 时需要
	 */
	private String code;

	/** 
	* 与生成code的uuid配对
	 */
	private String uuid;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public String getApiMethodName() {
		return "taobao.top.auth.token.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("code", this.code);
		txtParams.put("uuid", this.uuid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopAuthTokenCreateResponse> getResponseClass() {
		return TopAuthTokenCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(code, "code");
	}
	

}