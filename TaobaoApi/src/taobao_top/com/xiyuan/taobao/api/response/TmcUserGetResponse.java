package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.TmcUser;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8836598374978599948L;

	/** 
	 * 开通的用户数据
	 */
	@ApiField("tmc_user")
	private TmcUser tmcUser;


	public void setTmcUser(TmcUser tmcUser) {
		this.tmcUser = tmcUser;
	}
	public TmcUser getTmcUser( ) {
		return this.tmcUser;
	}
	


}
