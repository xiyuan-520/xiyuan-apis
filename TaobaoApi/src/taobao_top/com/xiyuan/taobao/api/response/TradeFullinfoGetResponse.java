package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Trade;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.fullinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeFullinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3381244461637446465L;

	/** 
	 * 交易主订单信息
	 */
	@ApiField("trade")
	private Trade trade;


	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Trade getTrade( ) {
		return this.trade;
	}
	


}
