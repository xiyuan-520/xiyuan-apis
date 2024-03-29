package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.WangwangClientidUnbindResponse;

/**
 * TOP API: taobao.wangwang.clientid.unbind request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WangwangClientidUnbindRequest extends BaseTaobaoRequest<WangwangClientidUnbindResponse> {
	
	

	/** 
	* 应用名
	 */
	private String appName;

	/** 
	* 客户端Id
	 */
	private String clientId;

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientId() {
		return this.clientId;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.clientid.unbind";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("app_name", this.appName);
		txtParams.put("client_id", this.clientId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WangwangClientidUnbindResponse> getResponseClass() {
		return WangwangClientidUnbindResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appName, "appName");
		RequestCheckUtils.checkNotEmpty(clientId, "clientId");
	}
	

}