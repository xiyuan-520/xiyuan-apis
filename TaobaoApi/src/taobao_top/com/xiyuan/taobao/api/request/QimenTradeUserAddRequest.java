package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QimenTradeUserAddResponse;

/**
 * TOP API: taobao.qimen.trade.user.add request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class QimenTradeUserAddRequest extends BaseTaobaoRequest<QimenTradeUserAddResponse> {
	
	

	/** 
	* 商家备注
	 */
	private String memo;

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public String getApiMethodName() {
		return "taobao.qimen.trade.user.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("memo", this.memo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenTradeUserAddResponse> getResponseClass() {
		return QimenTradeUserAddResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}