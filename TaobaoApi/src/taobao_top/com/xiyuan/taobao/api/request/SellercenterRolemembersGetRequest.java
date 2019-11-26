package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.SellercenterRolemembersGetResponse;

/**
 * TOP API: taobao.sellercenter.rolemembers.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SellercenterRolemembersGetRequest extends BaseTaobaoRequest<SellercenterRolemembersGetResponse> {
	
	

	/** 
	* 角色id
	 */
	private Long roleId;

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.rolemembers.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("role_id", this.roleId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercenterRolemembersGetResponse> getResponseClass() {
		return SellercenterRolemembersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(roleId, "roleId");
	}
	

}