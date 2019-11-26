package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Sku;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.sku.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkuGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4479241196168438123L;

	/** 
	 * Sku
	 */
	@ApiField("sku")
	private Sku sku;


	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Sku getSku( ) {
		return this.sku;
	}
	


}
