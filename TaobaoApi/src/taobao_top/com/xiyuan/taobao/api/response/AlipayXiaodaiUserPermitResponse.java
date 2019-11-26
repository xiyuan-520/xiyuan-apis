package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alipay.xiaodai.user.permit response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayXiaodaiUserPermitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1845325259317671483L;

	/** 
	 * 是否成功
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
