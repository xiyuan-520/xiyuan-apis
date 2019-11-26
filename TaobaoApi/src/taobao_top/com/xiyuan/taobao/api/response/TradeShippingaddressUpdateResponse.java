package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Trade;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.shippingaddress.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeShippingaddressUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7284966349927372582L;

	/** 
	 * 交易结构
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
