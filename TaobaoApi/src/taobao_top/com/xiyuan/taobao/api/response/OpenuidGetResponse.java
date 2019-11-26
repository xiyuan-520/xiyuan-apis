package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.openuid.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenuidGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1645982944382511863L;

	/** 
	 * OpenUID
	 */
	@ApiField("open_uid")
	private String openUid;


	public void setOpenUid(String openUid) {
		this.openUid = openUid;
	}
	public String getOpenUid( ) {
		return this.openUid;
	}
	


}
