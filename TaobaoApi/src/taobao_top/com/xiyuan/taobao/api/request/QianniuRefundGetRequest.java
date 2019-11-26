package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuRefundGetResponse;

/**
 * TOP API: taobao.qianniu.refund.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuRefundGetRequest extends BaseTaobaoRequest<QianniuRefundGetResponse> {
	
	

	/** 
	* 退款id
	 */
	private Long refundId;

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.refund.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("refund_id", this.refundId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuRefundGetResponse> getResponseClass() {
		return QianniuRefundGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
	}
	

}