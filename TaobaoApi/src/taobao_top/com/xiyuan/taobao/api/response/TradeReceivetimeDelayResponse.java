package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Trade;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.receivetime.delay response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeReceivetimeDelayResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1356593262339376355L;

	/** 
	 * 更新后的交易数据，只包括tid和modified两个字段。
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
