package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.trade.user.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenTradeUserDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4656653442462486158L;

	/** 
	 * modal
	 */
	@ApiField("modal")
	private Boolean modal;


	public void setModal(Boolean modal) {
		this.modal = modal;
	}
	public Boolean getModal( ) {
		return this.modal;
	}
	


}
