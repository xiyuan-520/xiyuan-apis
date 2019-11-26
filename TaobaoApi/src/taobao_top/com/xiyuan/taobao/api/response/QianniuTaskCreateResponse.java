package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.domain.QTaskMetadata;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.task.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuTaskCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7653558979146297666L;

	/** 
	 * 创建的任务元数据
	 */
	@ApiField("result")
	private QTaskMetadata result;


	public void setResult(QTaskMetadata result) {
		this.result = result;
	}
	public QTaskMetadata getResult( ) {
		return this.result;
	}
	


}
