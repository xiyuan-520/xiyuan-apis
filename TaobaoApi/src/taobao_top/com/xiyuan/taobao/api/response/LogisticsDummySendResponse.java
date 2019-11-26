package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Shipping;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.dummy.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsDummySendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7461465155173622775L;

	/** 
	 * 返回发货是否成功is_success
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
