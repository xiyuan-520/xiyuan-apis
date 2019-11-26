package com.xiyuan.taobao.api.internal.parser.xml;

import com.xiyuan.taobao.api.ApiException;
import com.xiyuan.taobao.api.TaobaoParser;
import com.xiyuan.taobao.api.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectXmlParser<T> implements TaobaoParser<T> {

	private Class<T> clazz;

	public ObjectXmlParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T parse(String rsp, String responseType) throws ApiException {
		Converter converter = new XmlConverter(responseType);
		return converter.toResponse(rsp, clazz);
	}

	public Class<T> getResponseClass() {
		return clazz;
	}

}
