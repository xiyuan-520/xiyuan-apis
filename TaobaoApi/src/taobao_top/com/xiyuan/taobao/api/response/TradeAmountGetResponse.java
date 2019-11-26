package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.TradeAmount;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.amount.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeAmountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7228288211191355522L;

	/** 
	 * 主订单的财务信息详情
	 */
	@ApiField("trade_amount")
	private TradeAmount tradeAmount;


	public void setTradeAmount(TradeAmount tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public TradeAmount getTradeAmount( ) {
		return this.tradeAmount;
	}
	


}
