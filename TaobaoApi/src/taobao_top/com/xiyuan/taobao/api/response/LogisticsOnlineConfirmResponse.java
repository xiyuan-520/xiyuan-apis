package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Shipping;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.online.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOnlineConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6582215198498644937L;

	/** 
	 * 只返回is_success：是否成功。
	 */
	@ApiField("shipping")
	private Shipping shipping;


	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Shipping getShipping( ) {
		return this.shipping;
	}
	


}
