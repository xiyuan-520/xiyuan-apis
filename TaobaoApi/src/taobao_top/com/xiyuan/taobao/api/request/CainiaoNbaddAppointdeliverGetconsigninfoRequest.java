package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.CainiaoNbaddAppointdeliverGetconsigninfoResponse;

/**
 * TOP API: cainiao.nbadd.appointdeliver.getconsigninfo request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CainiaoNbaddAppointdeliverGetconsigninfoRequest extends BaseTaobaoRequest<CainiaoNbaddAppointdeliverGetconsigninfoResponse> {
	
	

	/** 
	* 淘宝交易订单id
	 */
	private Long tradeOrderId;

	public void setTradeOrderId(Long tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	public Long getTradeOrderId() {
		return this.tradeOrderId;
	}

	public String getApiMethodName() {
		return "cainiao.nbadd.appointdeliver.getconsigninfo";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("trade_order_id", this.tradeOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoNbaddAppointdeliverGetconsigninfoResponse> getResponseClass() {
		return CainiaoNbaddAppointdeliverGetconsigninfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tradeOrderId, "tradeOrderId");
	}
	

}