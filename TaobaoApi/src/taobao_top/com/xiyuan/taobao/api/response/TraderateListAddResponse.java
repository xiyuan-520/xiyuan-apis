package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.domain.TradeRate;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderate.list.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderateListAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3674269316634461225L;

	/** 
	 * 返回的评论的信息，仅返回tid和created字段
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
