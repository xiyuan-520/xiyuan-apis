package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.openuid.change response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenuidChangeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5699344493194842498L;

	/** 
	 * 转换到新的openUId
	 */
	@ApiField("new_open_uid")
	private String newOpenUid;


	public void setNewOpenUid(String newOpenUid) {
		this.newOpenUid = newOpenUid;
	}
	public String getNewOpenUid( ) {
		return this.newOpenUid;
	}
	


}
