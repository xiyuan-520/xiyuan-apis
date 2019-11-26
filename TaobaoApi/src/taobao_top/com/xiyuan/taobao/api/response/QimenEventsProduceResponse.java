package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.events.produce response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenEventsProduceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8191593365162118811L;

	/** 
	 * 是否全部成功
	 */
	@ApiField("is_all_success")
	private Boolean isAllSuccess;

	/** 
	 * 发送结果，与发送时的参数顺序一致。如果is_all_success为true时，不用校验result是否成功
	 */
	@ApiListField("results")
	@ApiField("qimen_result")
	private List<QimenResult> results;


	public void setIsAllSuccess(Boolean isAllSuccess) {
		this.isAllSuccess = isAllSuccess;
	}
	public Boolean getIsAllSuccess( ) {
		return this.isAllSuccess;
	}

	public void setResults(List<QimenResult> results) {
		this.results = results;
	}
	public List<QimenResult> getResults( ) {
		return this.results;
	}
	
	/**
 * 发送结果，与发送时的参数顺序一致。如果is_all_success为true时，不用校验result是否成功
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class QimenResult extends TaobaoObject {

	private static final long serialVersionUID = 7351784522344662435L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 是否成功
		 */
		@ApiField("is_success")
		private Boolean isSuccess;
	

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
		public Boolean getIsSuccess() {
			return this.isSuccess;
		}
		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}

}



}
