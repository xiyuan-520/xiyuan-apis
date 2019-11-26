package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskRemoveResponse;

/**
 * TOP API: taobao.qianniu.task.remove request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskRemoveRequest extends BaseTaobaoRequest<QianniuTaskRemoveResponse> {
	
	

	/** 
	* 对于发起人删除一个任务，请使用这个字段，同时清除所有处理人。
	 */
	private Long metadataId;

	public void setMetadataId(Long metadataId) {
		this.metadataId = metadataId;
	}

	public Long getMetadataId() {
		return this.metadataId;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.task.remove";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("metadata_id", this.metadataId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskRemoveResponse> getResponseClass() {
		return QianniuTaskRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(metadataId, "metadataId");
	}
	

}