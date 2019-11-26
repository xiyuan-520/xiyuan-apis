package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Role;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.roles.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterRolesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7355599478972645454L;

	/** 
	 * 卖家子账号角色列表。<br/>返回对象为 role数据对象中的role_id，role_name，description，seller_id，create_time，modified_time。不包含permissions(权限点)
	 */
	@ApiListField("roles")
	@ApiField("role")
	private List<Role> roles;


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public List<Role> getRoles( ) {
		return this.roles;
	}
	


}
