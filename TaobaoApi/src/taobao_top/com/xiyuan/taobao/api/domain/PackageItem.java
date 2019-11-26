package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 包裹里面的商品类型
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PackageItem extends TaobaoObject {

	private static final long serialVersionUID = 5818236327676963893L;

	/**
	 * 商品数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;


	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
