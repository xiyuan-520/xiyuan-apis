package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.ipout.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopIpoutGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4254619392255628637L;

	/** 
	 * TOP网关出口IP列表
	 */
	@ApiField("ip_list")
	private String ipList;


	public void setIpList(String ipList) {
		this.ipList = ipList;
	}
	public String getIpList( ) {
		return this.ipList;
	}
	


}
