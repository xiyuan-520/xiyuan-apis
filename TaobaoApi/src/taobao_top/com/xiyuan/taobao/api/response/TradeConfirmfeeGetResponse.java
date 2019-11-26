package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.TradeConfirmFee;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.confirmfee.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeConfirmfeeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7336292664499987952L;

	/** 
	 * 获取到的交易确认收货费用
	 */
	@ApiField("trade_confirm_fee")
	private TradeConfirmFee tradeConfirmFee;


	public void setTradeConfirmFee(TradeConfirmFee tradeConfirmFee) {
		this.tradeConfirmFee = tradeConfirmFee;
	}
	public TradeConfirmFee getTradeConfirmFee( ) {
		return this.tradeConfirmFee;
	}
	


}
