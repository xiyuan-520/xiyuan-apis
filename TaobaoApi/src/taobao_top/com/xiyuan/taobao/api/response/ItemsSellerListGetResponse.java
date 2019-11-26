package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Item;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.seller.list.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemsSellerListGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7633279948527234271L;

	/** 
	 * 商品详细信息列表
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;


	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}
	


}
