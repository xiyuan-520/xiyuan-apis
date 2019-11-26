package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.domain.TradeRate;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderate.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderateAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8392258661121384895L;

	/** 
	 * 返回tid、oid、create
	 */
	@ApiField("trade_rate")
	private TradeRate tradeRate;


	public void setTradeRate(TradeRate tradeRate) {
		this.tradeRate = tradeRate;
	}
	public TradeRate getTradeRate( ) {
		return this.tradeRate;
	}
	


}
