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
import com.xiyuan.taobao.api.response.CainiaoWaybillIiQueryByWaybillcodeResponse;

/**
 * TOP API: cainiao.waybill.ii.query.by.waybillcode request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CainiaoWaybillIiQueryByWaybillcodeRequest extends BaseTaobaoRequest<CainiaoWaybillIiQueryByWaybillcodeResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String paramList;

	public void setParamList(String paramList) {
		this.paramList = paramList;
	}

	public void setParamList(List<WaybillDetailQueryByWaybillCodeRequest> paramList) {
		this.paramList = new JSONWriter(false,true).write(paramList);
	}

	public String getParamList() {
		return this.paramList;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.query.by.waybillcode";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_list", this.paramList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiQueryByWaybillcodeResponse> getResponseClass() {
		return CainiaoWaybillIiQueryByWaybillcodeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(paramList, 20, "paramList");
	}
	
	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillDetailQueryByWaybillCodeRequest extends TaobaoObject {

	private static final long serialVersionUID = 4631522469223796799L;

	/**
		 * 快递公司code
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 电子面单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}

}


}