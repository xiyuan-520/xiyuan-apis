package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Shipping;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.offline.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOfflineSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6388316264564673432L;

	/** 
	 * 自己联系的调用结果
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
