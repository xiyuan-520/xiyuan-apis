package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.shop.getbytitle response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShopGetbytitleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2778193435433963721L;

	/** 
	 * 错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 错误信息
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 有无错误
	 */
	@ApiField("is_error")
	private Boolean isError;

	/** 
	 * test
	 */
	@ApiField("result_shop")
	private String resultShop;


	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setIsError(Boolean isError) {
		this.isError = isError;
	}
	public Boolean getIsError( ) {
		return this.isError;
	}

	public void setResultShop(String resultShop) {
		this.resultShop = resultShop;
	}
	public String getResultShop( ) {
		return this.resultShop;
	}
	


}
