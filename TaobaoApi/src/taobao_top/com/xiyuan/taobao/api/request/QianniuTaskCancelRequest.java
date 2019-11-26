package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskCancelResponse;

/**
 * TOP API: taobao.qianniu.task.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskCancelRequest extends BaseTaobaoRequest<QianniuTaskCancelResponse> {
	
	

	/** 
	* 任务备注
	 */
	private String memo;

	/** 
	* 任务元数据ID
	 */
	private Long metaId;

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMetaId(Long metaId) {
		this.metaId = metaId;
	}

	public Long getMetaId() {
		return this.metaId;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.task.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("memo", this.memo);
		txtParams.put("meta_id", this.metaId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskCancelResponse> getResponseClass() {
		return QianniuTaskCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(metaId, "metaId");
	}
	

}