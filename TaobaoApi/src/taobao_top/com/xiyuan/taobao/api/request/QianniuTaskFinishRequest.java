package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskFinishResponse;

/**
 * TOP API: taobao.qianniu.task.finish request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskFinishRequest extends BaseTaobaoRequest<QianniuTaskFinishResponse> {
	
	

	/** 
	* 任务备注
	 */
	private String memo;

	/** 
	* 任务ID
	 */
	private Long taskId;

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.task.finish";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("memo", this.memo);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskFinishResponse> getResponseClass() {
		return QianniuTaskFinishResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}