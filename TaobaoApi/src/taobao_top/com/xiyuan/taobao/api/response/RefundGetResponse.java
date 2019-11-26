package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Refund;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RefundGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1768199192571225616L;

	/** 
	 * 退款详情
	 */
	@ApiField("refund")
	private Refund refund;


	public void setRefund(Refund refund) {
		this.refund = refund;
	}
	public Refund getRefund( ) {
		return this.refund;
	}
	


}
