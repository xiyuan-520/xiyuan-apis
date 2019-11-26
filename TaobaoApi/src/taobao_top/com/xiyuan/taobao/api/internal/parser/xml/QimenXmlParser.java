package com.xiyuan.taobao.api.internal.parser.xml;

import com.xiyuan.qimen.api.QimenResponse;
import com.xiyuan.taobao.api.ApiException;
import com.xiyuan.taobao.api.TaobaoParser;
import com.xiyuan.taobao.api.internal.mapping.Converter;

public class QimenXmlParser<T extends QimenResponse> implements TaobaoParser<T> {

	private Class<T> clazz;

	public QimenXmlParser(Class<T> clazz) {
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
