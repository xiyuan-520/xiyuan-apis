package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.query.by.waybillcode response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiQueryByWaybillcodeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6566711312942283529L;

	/** 
	 * 查询返回值
	 */
	@ApiListField("modules")
	@ApiField("waybill_cloud_print_with_result_desc_response")
	private List<WaybillCloudPrintWithResultDescResponse> modules;


	public void setModules(List<WaybillCloudPrintWithResultDescResponse> modules) {
		this.modules = modules;
	}
	public List<WaybillCloudPrintWithResultDescResponse> getModules( ) {
		return this.modules;
	}
	
	/**
 * 面单查询结构体
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillCloudPrintResponse extends TaobaoObject {

	private static final long serialVersionUID = 1525569435277878659L;

	/**
		 * 快运子母件中的母单号
		 */
		@ApiField("parent_waybill_code")
		private String parentWaybillCode;
		/**
		 * 面单信息
		 */
		@ApiField("print_data")
		private String printData;
		/**
		 * 面单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	

	public String getParentWaybillCode() {
			return this.parentWaybillCode;
		}
		public void setParentWaybillCode(String parentWaybillCode) {
			this.parentWaybillCode = parentWaybillCode;
		}
		public String getPrintData() {
			return this.printData;
		}
		public void setPrintData(String printData) {
			this.printData = printData;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}

}

	/**
 * 查询返回值
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillCloudPrintWithResultDescResponse extends TaobaoObject {

	private static final long serialVersionUID = 5128595634688152317L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 请求成功
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * 面单查询结构体
		 */
		@ApiField("waybill_cloud_print_response")
		private WaybillCloudPrintResponse waybillCloudPrintResponse;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMessage() {
			return this.errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public WaybillCloudPrintResponse getWaybillCloudPrintResponse() {
			return this.waybillCloudPrintResponse;
		}
		public void setWaybillCloudPrintResponse(WaybillCloudPrintResponse waybillCloudPrintResponse) {
			this.waybillCloudPrintResponse = waybillCloudPrintResponse;
		}

}



}
