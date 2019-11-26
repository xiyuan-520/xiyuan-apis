package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Sku;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.skus.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6222378547854381465L;

	/** 
	 * Sku列表
	 */
	@ApiListField("skus")
	@ApiField("sku")
	private List<Sku> skus;


	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}
	public List<Sku> getSkus( ) {
		return this.skus;
	}
	


}
