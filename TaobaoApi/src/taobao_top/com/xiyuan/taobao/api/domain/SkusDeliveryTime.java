package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * sku物流信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SkusDeliveryTime extends TaobaoObject {

	private static final long serialVersionUID = 1284546343513968724L;

	/**
	 * sku时间
	 */
	@ApiField("sku_delivery_time")
	private String skuDeliveryTime;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private Long skuId;


	public String getSkuDeliveryTime() {
		return this.skuDeliveryTime;
	}
	public void setSkuDeliveryTime(String skuDeliveryTime) {
		this.skuDeliveryTime = skuDeliveryTime;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

}
