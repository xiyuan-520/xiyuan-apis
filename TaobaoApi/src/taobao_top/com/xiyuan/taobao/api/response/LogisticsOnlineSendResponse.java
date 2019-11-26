package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Shipping;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.online.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOnlineSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6457573122879151321L;

	/** 
	 * de
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
