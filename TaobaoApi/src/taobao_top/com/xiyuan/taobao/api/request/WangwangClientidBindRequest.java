package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.WangwangClientidBindResponse;

/**
 * TOP API: taobao.wangwang.clientid.bind request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WangwangClientidBindRequest extends BaseTaobaoRequest<WangwangClientidBindResponse> {
	
	

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
		return "taobao.wangwang.clientid.bind";
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

	public Class<WangwangClientidBindResponse> getResponseClass() {
		return WangwangClientidBindResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appName, "appName");
		RequestCheckUtils.checkNotEmpty(clientId, "clientId");
	}
	

}