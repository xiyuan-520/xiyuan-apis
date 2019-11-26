package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fuwu.sale.link.gen response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FuwuSaleLinkGenResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5436953912858612824L;

	/** 
	 * 通过营销链接接口生成的营销链接短地址
	 */
	@ApiField("url")
	private String url;


	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}
	


}
