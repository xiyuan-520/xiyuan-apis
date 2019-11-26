package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.user.cancel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcUserCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8668895782546729755L;

	/** 
	 * 是否成功,如果为false并且没有错误码，表示删除的用户不存在。
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
