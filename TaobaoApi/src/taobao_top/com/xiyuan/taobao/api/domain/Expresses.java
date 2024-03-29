package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 家装快递公司信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Expresses extends TaobaoObject {

	private static final long serialVersionUID = 1329592927654564852L;

	/**
	 * 公司编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 公司名称
	 */
	@ApiField("name")
	private String name;


	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
