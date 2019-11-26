package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.User;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.user.seller.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class UserSellerGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2227169744892441147L;

	/** 
	 * 用户信息
	 */
	@ApiField("user")
	private User user;


	public void setUser(User user) {
		this.user = user;
	}
	public User getUser( ) {
		return this.user;
	}
	


}
