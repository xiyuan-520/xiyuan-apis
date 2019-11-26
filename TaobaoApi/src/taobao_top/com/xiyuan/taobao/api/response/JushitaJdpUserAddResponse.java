package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jdp.user.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJdpUserAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6595692685554785663L;

	/** 
	 * 是否添加成功
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
