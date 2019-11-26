package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Item;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.inventory.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemsInventoryGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7895262982475121578L;

	/** 
	 * 搜索到底商品列表，具体字段根据设定的fields决定，不包括desc,stuff_status字段
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	/** 
	 * 搜索到符合条件的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
