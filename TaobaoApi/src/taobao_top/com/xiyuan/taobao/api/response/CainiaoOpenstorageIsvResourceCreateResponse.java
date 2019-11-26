package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.openstorage.isv.resource.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoOpenstorageIsvResourceCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2757274411892541153L;

	/** 
	 * 错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误消息
	 */
	@ApiField("err_message")
	private String errMessage;


	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public String getErrMessage( ) {
		return this.errMessage;
	}
	


}
