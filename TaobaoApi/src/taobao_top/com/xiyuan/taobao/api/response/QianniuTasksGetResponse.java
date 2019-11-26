package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.domain.QTask;
import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qianniu.tasks.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QianniuTasksGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7367479432895645191L;

	/** 
	 * 返回的任务列表
	 */
	@ApiListField("tasks")
	@ApiField("q_task")
	private List<QTask> tasks;


	public void setTasks(List<QTask> tasks) {
		this.tasks = tasks;
	}
	public List<QTask> getTasks( ) {
		return this.tasks;
	}
	


}
