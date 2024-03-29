package com.xiyuan.taobao.api.request;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import com.xiyuan.taobao.api.TaobaoObject;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.CainiaoWaybillIiQueryByTradecodeResponse;

/**
 * TOP API: cainiao.waybill.ii.query.by.tradecode request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CainiaoWaybillIiQueryByTradecodeRequest extends BaseTaobaoRequest<CainiaoWaybillIiQueryByTradecodeResponse> {
	
	

	/** 
	* 订单号列表
	 */
	private String paramList;

	public void setParamList(String paramList) {
		this.paramList = paramList;
	}

	public void setParamList(List<WaybillDetailQueryByBizSubCodeRequest> paramList) {
		this.paramList = new JSONWriter(false,true).write(paramList);
	}

	public String getParamList() {
		return this.paramList;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.query.by.tradecode";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_list", this.paramList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiQueryByTradecodeResponse> getResponseClass() {
		return CainiaoWaybillIiQueryByTradecodeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(paramList, 10, "paramList");
	}
	
	/**
 * 订单号列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillDetailQueryByBizSubCodeRequest extends TaobaoObject {

	private static final long serialVersionUID = 8277439933954949291L;

	/**
		 * 订单号
		 */
		@ApiField("biz_sub_code")
		private String bizSubCode;
		/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
	

	public String getBizSubCode() {
			return this.bizSubCode;
		}
		public void setBizSubCode(String bizSubCode) {
			this.bizSubCode = bizSubCode;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

}


}