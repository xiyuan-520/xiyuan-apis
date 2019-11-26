package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TmallTraderateFeedsGetResponse;

/**
 * TOP API: tmall.traderate.feeds.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class TmallTraderateFeedsGetRequest extends BaseTaobaoRequest<TmallTraderateFeedsGetResponse> {
	
	

	/** 
	* 交易子订单ID
	 */
	private Long childTradeId;

	public void setChildTradeId(Long childTradeId) {
		this.childTradeId = childTradeId;
	}

	public Long getChildTradeId() {
		return this.childTradeId;
	}

	public String getApiMethodName() {
		return "tmall.traderate.feeds.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("child_trade_id", this.childTradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallTraderateFeedsGetResponse> getResponseClass() {
		return TmallTraderateFeedsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(childTradeId, "childTradeId");
	}
	

}