package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.waybill.ii.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillIiGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2765236579836131461L;

	/** 
	 * 系统自动生成
	 */
	@ApiListField("modules")
	@ApiField("waybill_cloud_print_response")
	private List<WaybillCloudPrintResponse> modules;


	public void setModules(List<WaybillCloudPrintResponse> modules) {
		this.modules = modules;
	}
	public List<WaybillCloudPrintResponse> getModules( ) {
		return this.modules;
	}
	
	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WaybillCloudPrintResponse extends TaobaoObject {

	private static final long serialVersionUID = 6666488656487746318L;

	/**
		 * 请求id
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 子母件中的母单号，当为子母件模式时，需要此单号为实际挂载物流详情的单号，需要使用此单号进行发货，查询物流详情，非子母件，此字段为空
		 */
		@ApiField("parent_waybill_code")
		private String parentWaybillCode;
		/**
		 * 模板内容,具体解释见<a href="http://open.taobao.com/doc2/detail.htm?spm=a219a.7629140.0.0.8cf9Nj&treeId=17&articleId=105085&docType=1#12">链接</a>
		 */
		@ApiField("print_data")
		private String printData;
		/**
		 * 面单号, 子母件模式下为子面单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	

	public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
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



}
