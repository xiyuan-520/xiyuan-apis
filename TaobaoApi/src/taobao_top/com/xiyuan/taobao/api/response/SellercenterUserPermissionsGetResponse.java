package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.domain.Permission;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.user.permissions.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterUserPermissionsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6588891433522361572L;

	/** 
	 * 权限列表
	 */
	@ApiListField("permissions")
	@ApiField("permission")
	private List<Permission> permissions;


	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	public List<Permission> getPermissions( ) {
		return this.permissions;
	}
	


}
