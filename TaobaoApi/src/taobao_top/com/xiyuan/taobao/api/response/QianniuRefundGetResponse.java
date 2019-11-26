package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.refund.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuRefundGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1427113693662861827L;

	/** 
	 * 返回taobao 表示是淘宝的退款id，如果出错，可能是退款id不存在，或者是天猫退款id
	 */
	@ApiField("refund_info")
	private String refundInfo;


	public void setRefundInfo(String refundInfo) {
		this.refundInfo = refundInfo;
	}
	public String getRefundInfo( ) {
		return this.refundInfo;
	}
	


}
