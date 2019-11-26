package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.domain.UserSubscribe;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.appstore.subscribe.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AppstoreSubscribeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5876713911778823956L;

	/** 
	 * 用户订购信息
	 */
	@ApiField("user_subscribe")
	private UserSubscribe userSubscribe;


	public void setUserSubscribe(UserSubscribe userSubscribe) {
		this.userSubscribe = userSubscribe;
	}
	public UserSubscribe getUserSubscribe( ) {
		return this.userSubscribe;
	}
	


}
