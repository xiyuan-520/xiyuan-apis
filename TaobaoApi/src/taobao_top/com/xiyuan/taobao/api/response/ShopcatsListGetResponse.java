package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.ShopCat;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.shopcats.list.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShopcatsListGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7146628568469711565L;

	/** 
	 * 店铺类目列表信息
	 */
	@ApiListField("shop_cats")
	@ApiField("shop_cat")
	private List<ShopCat> shopCats;


	public void setShopCats(List<ShopCat> shopCats) {
		this.shopCats = shopCats;
	}
	public List<ShopCat> getShopCats( ) {
		return this.shopCats;
	}
	


}
