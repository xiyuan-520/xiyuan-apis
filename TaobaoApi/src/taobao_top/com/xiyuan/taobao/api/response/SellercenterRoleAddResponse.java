package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Role;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.role.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterRoleAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1359941193466812835L;

	/** 
	 * 子账号角色
	 */
	@ApiField("role")
	private Role role;


	public void setRole(Role role) {
		this.role = role;
	}
	public Role getRole( ) {
		return this.role;
	}
	


}
