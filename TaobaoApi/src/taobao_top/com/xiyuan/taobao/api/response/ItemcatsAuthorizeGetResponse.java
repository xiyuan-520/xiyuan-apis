package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.SellerAuthorize;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.itemcats.authorize.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemcatsAuthorizeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1255578256837771332L;

	/** 
	 * 里面有3个数组：
Brand[]品牌列表,
ItemCat[] 类目列表
XinpinItemCat[] 针对于C卖家新品类目列表
	 */
	@ApiField("seller_authorize")
	private SellerAuthorize sellerAuthorize;


	public void setSellerAuthorize(SellerAuthorize sellerAuthorize) {
		this.sellerAuthorize = sellerAuthorize;
	}
	public SellerAuthorize getSellerAuthorize( ) {
		return this.sellerAuthorize;
	}
	


}
