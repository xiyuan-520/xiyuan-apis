package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 类目属性
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Feature extends TaobaoObject {

	private static final long serialVersionUID = 3218437158898358738L;

	/**
	 * 属性键
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性值
	 */
	@ApiField("attr_value")
	private String attrValue;


	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
