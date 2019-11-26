package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 发货的包裹
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ConfirmConsignGoodsDto extends TaobaoObject {

	private static final long serialVersionUID = 8355572636617268865L;

	/**
	 * 待发货商品的前端宝贝id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 待发货商品的数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 待发货商品的子交易号
	 */
	@ApiField("tc_sub_trade_id")
	private Long tcSubTradeId;


	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getTcSubTradeId() {
		return this.tcSubTradeId;
	}
	public void setTcSubTradeId(Long tcSubTradeId) {
		this.tcSubTradeId = tcSubTradeId;
	}

}
