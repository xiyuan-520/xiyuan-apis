package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskMessageSendResponse;

/**
 * TOP API: taobao.qianniu.task.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskMessageSendRequest extends BaseTaobaoRequest<QianniuTaskMessageSendResponse> {
	
	

	/** 
	* 任务元id，如果taskid不为空，则只发给task对应的单个接收人。如果taskid为空，则发给metadata_id对应的所有接收人。
	 */
	private Long metadataId;

	/** 
	* 任务ID。如果taskid不为空，则只发给task对应的单个接收人。如果taskid为空，则发给metadata_id对应的所有接收人。
	 */
	private Long taskId;

	public void setMetadataId(Long metadataId) {
		this.metadataId = metadataId;
	}

	public Long getMetadataId() {
		return this.metadataId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.task.message.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("metadata_id", this.metadataId);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskMessageSendResponse> getResponseClass() {
		return QianniuTaskMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}