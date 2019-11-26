package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.domain.SubUserFullInfo;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.subuser.fullinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SubuserFullinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8198162363748419359L;

	/** 
	 * 子账号详细信息，其中包括账号基本信息、员工信息和部门职务信息
	 */
	@ApiField("sub_fullinfo")
	private SubUserFullInfo subFullinfo;


	public void setSubFullinfo(SubUserFullInfo subFullinfo) {
		this.subFullinfo = subFullinfo;
	}
	public SubUserFullInfo getSubFullinfo( ) {
		return this.subFullinfo;
	}
	


}
