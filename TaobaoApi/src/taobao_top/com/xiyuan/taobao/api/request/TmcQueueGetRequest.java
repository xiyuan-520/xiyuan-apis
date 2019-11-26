package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TmcQueueGetResponse;

/**
 * TOP API: taobao.tmc.queue.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class TmcQueueGetRequest extends BaseTaobaoRequest<TmcQueueGetResponse> {
	
	

	/** 
	* TMC组名
	 */
	private String groupName;

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public String getApiMethodName() {
		return "taobao.tmc.queue.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_name", this.groupName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcQueueGetResponse> getResponseClass() {
		return TmcQueueGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupName, "groupName");
	}
	

}