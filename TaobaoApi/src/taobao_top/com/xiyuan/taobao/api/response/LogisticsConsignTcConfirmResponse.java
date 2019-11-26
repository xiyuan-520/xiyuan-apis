package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.consign.tc.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsConsignTcConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7262688667399174413L;

	/** 
	 * 菜鸟发货单据
	 */
	@ApiField("order_consign_code")
	private String orderConsignCode;

	/** 
	 * 是否重试
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 单次调用流程唯一id
	 */
	@ApiField("trace_id")
	private String traceId;


	public void setOrderConsignCode(String orderConsignCode) {
		this.orderConsignCode = orderConsignCode;
	}
	public String getOrderConsignCode( ) {
		return this.orderConsignCode;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}
	


}
