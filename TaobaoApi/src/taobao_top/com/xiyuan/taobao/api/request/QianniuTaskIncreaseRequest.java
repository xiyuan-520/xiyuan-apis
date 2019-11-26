package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskIncreaseResponse;

/**
 * TOP API: taobao.qianniu.task.increase request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskIncreaseRequest extends BaseTaobaoRequest<QianniuTaskIncreaseResponse> {
	
	

	/** 
	* 任务元id
	 */
	private Long metadataId;

	/** 
	* 任务列表，JSON格式，例如： tasks =[{ "receiver_uid" : 123, "receiver_nick" : "nick"}, { "receiver_uid" : 456, "receiver_nick" : "nick2"} ]
	 */
	private String tasks;

	public void setMetadataId(Long metadataId) {
		this.metadataId = metadataId;
	}

	public Long getMetadataId() {
		return this.metadataId;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public String getTasks() {
		return this.tasks;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.task.increase";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("metadata_id", this.metadataId);
		txtParams.put("tasks", this.tasks);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskIncreaseResponse> getResponseClass() {
		return QianniuTaskIncreaseResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(metadataId, "metadataId");
		RequestCheckUtils.checkNotEmpty(tasks, "tasks");
	}
	

}