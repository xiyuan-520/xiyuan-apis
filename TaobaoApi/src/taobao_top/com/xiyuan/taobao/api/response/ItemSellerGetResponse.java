package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Item;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.seller.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSellerGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3335668499964832566L;

	/** 
	 * 商品详细信息
	 */
	@ApiField("item")
	private Item item;


	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem( ) {
		return this.item;
	}
	


}
