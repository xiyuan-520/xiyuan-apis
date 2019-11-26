package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.merchant.inventory.adjust response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoMerchantInventoryAdjustResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2249111797552439985L;

	/** 
	 * result
	 */
	@ApiField("result")
	private SingleResultDto result;


	public void setResult(SingleResultDto result) {
		this.result = result;
	}
	public SingleResultDto getResult( ) {
		return this.result;
	}
	
	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SingleResultDto extends TaobaoObject {

	private static final long serialVersionUID = 4299345717968189798L;

	/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * errorMessage
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * success
		 */
		@ApiField("flag")
		private Boolean flag;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMessage() {
			return this.errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public Boolean getFlag() {
			return this.flag;
		}
		public void setFlag(Boolean flag) {
			this.flag = flag;
		}

}



}
