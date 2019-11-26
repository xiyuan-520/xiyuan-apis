package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.LogisticsOnlineCancelResponse;

/**
 * TOP API: taobao.logistics.online.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class LogisticsOnlineCancelRequest extends BaseTaobaoRequest<LogisticsOnlineCancelResponse> {
	
	

	/** 
	* 淘宝交易ID
	 */
	private Long tid;

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.logistics.online.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsOnlineCancelResponse> getResponseClass() {
		return LogisticsOnlineCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}