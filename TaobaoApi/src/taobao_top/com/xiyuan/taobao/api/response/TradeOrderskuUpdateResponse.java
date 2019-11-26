package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Order;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.ordersku.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeOrderskuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1579513994864275577L;

	/** 
	 * 只返回oid和modified
	 */
	@ApiField("order")
	private Order order;


	public void setOrder(Order order) {
		this.order = order;
	}
	public Order getOrder( ) {
		return this.order;
	}
	


}
