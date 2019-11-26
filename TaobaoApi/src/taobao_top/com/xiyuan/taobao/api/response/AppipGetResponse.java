package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.appip.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AppipGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5442887922817158717L;

	/** 
	 * ISV发起请求服务器IP
	 */
	@ApiField("ip")
	private String ip;


	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp( ) {
		return this.ip;
	}
	


}
