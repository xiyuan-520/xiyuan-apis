package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskmetaUpdateResponse;

/**
 * TOP API: taobao.qianniu.taskmeta.update request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskmetaUpdateRequest extends BaseTaobaoRequest<QianniuTaskmetaUpdateResponse> {
	
	

	/** 
	* 要更新的任务元数据，JSON格式，例如：
meta= {
		"id" : 1,
		"title" : "xxx",
		"content" : "yyyy",
		"biz_sys_Id" : 12232,
		"biz_sys_task_type" : 1212,
		"start_time" : 1380173565480,
		"end_time" : 1380173565480,
 "sender_uid" : 213123213,
		"sender_nick" : "tbtest1063",
		"reminder_flag" : 1,
		"finish_strategy" : 1
	}
	 */
	private String meta;

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getMeta() {
		return this.meta;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.taskmeta.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("meta", this.meta);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskmetaUpdateResponse> getResponseClass() {
		return QianniuTaskmetaUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(meta, "meta");
	}
	

}