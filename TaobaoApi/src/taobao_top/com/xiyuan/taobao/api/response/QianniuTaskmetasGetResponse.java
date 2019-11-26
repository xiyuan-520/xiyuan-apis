package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.domain.QTaskMetadata;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.taskmetas.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuTaskmetasGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4738492431756928885L;

	/** 
	 * taskmetas
	 */
	@ApiListField("taskmetas")
	@ApiField("q_task_metadata")
	private List<QTaskMetadata> taskmetas;


	public void setTaskmetas(List<QTaskMetadata> taskmetas) {
		this.taskmetas = taskmetas;
	}
	public List<QTaskMetadata> getTaskmetas( ) {
		return this.taskmetas;
	}
	


}
