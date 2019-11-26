package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 图片链接
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PicUrl extends TaobaoObject {

	private static final long serialVersionUID = 6817779765174978282L;

	/**
	 * 图片链接地址
	 */
	@ApiField("url")
	private String url;


	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
