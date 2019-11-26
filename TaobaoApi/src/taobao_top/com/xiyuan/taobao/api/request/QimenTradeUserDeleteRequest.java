package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QimenTradeUserDeleteResponse;

/**
 * TOP API: taobao.qimen.trade.user.delete request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class QimenTradeUserDeleteRequest extends BaseTaobaoRequest<QimenTradeUserDeleteResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.qimen.trade.user.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenTradeUserDeleteResponse> getResponseClass() {
		return QimenTradeUserDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}