package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.express.modify.appoint response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsExpressModifyAppointResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6253716896337315139L;

	/** 
	 * 调用结果
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
 * 业务返回结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ExpressModifyAppointTopResponseDto extends TaobaoObject {

	private static final long serialVersionUID = 8747652364862844759L;

	/**
		 * 订单号
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 是否执行成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}

	/**
 * 调用结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SingleResultDto extends TaobaoObject {

	private static final long serialVersionUID = 4167372547193124675L;

	/**
		 * 错误编码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误描述
		 */
		@ApiField("error_desc")
		private String errorDesc;
		/**
		 * 是否幂等
		 */
		@ApiField("is_idempotent")
		private Boolean isIdempotent;
		/**
		 * 是否需要重试
		 */
		@ApiField("is_retry")
		private Boolean isRetry;
		/**
		 * 业务返回结果
		 */
		@ApiField("result")
		private ExpressModifyAppointTopResponseDto result;
		/**
		 * 是否调用成功
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * 调用码
		 */
		@ApiField("trace_id")
		private String traceId;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorDesc() {
			return this.errorDesc;
		}
		public void setErrorDesc(String errorDesc) {
			this.errorDesc = errorDesc;
		}
		public Boolean getIsIdempotent() {
			return this.isIdempotent;
		}
		public void setIsIdempotent(Boolean isIdempotent) {
			this.isIdempotent = isIdempotent;
		}
		public Boolean getIsRetry() {
			return this.isRetry;
		}
		public void setIsRetry(Boolean isRetry) {
			this.isRetry = isRetry;
		}
		public ExpressModifyAppointTopResponseDto getResult() {
			return this.result;
		}
		public void setResult(ExpressModifyAppointTopResponseDto result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public String getTraceId() {
			return this.traceId;
		}
		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

}



}
