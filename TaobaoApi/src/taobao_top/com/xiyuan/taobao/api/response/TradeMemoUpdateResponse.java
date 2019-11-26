package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Trade;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.memo.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeMemoUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4526763871536845684L;

	/** 
	 * 更新交易的备注信息后返回的Trade，其中可用字段为tid和modified
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
