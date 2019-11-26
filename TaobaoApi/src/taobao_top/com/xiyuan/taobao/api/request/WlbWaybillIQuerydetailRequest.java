package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.domain.WaybillDetailQueryRequest;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.WlbWaybillIQuerydetailResponse;

/**
 * TOP API: taobao.wlb.waybill.i.querydetail request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WlbWaybillIQuerydetailRequest extends BaseTaobaoRequest<WlbWaybillIQuerydetailResponse> {
	
	

	/** 
	* 面单查询请求
	 */
	private String waybillDetailQueryRequest;

	public void setWaybillDetailQueryRequest(String waybillDetailQueryRequest) {
		this.waybillDetailQueryRequest = waybillDetailQueryRequest;
	}

	public void setWaybillDetailQueryRequest(WaybillDetailQueryRequest waybillDetailQueryRequest) {
		this.waybillDetailQueryRequest = new JSONWriter(false,true).write(waybillDetailQueryRequest);
	}

	public String getWaybillDetailQueryRequest() {
		return this.waybillDetailQueryRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.querydetail";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_detail_query_request", this.waybillDetailQueryRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillIQuerydetailResponse> getResponseClass() {
		return WlbWaybillIQuerydetailResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}