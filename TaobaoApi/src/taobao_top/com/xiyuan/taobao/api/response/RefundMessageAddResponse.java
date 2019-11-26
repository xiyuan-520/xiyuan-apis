package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.RefundMessage;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.message.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RefundMessageAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7591317855281682179L;

	/** 
	 * 退款信息。包含id和created
	 */
	@ApiField("refund_message")
	private RefundMessage refundMessage;


	public void setRefundMessage(RefundMessage refundMessage) {
		this.refundMessage = refundMessage;
	}
	public RefundMessage getRefundMessage( ) {
		return this.refundMessage;
	}
	


}
