package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jdp.user.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJdpUserDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7597647828218982344L;

	/** 
	 * 是否删除成功
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
