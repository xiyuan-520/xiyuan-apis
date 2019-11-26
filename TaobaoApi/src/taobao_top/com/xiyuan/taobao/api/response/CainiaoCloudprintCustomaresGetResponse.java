package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cloudprint.customares.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintCustomaresGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6657342846759547632L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private CloudPrintBaseResult result;


	public void setResult(CloudPrintBaseResult result) {
		this.result = result;
	}
	public CloudPrintBaseResult getResult( ) {
		return this.result;
	}
	
	/**
 * keys
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class KeyResult extends TaobaoObject {

	private static final long serialVersionUID = 6865892914769578234L;

	/**
		 * key名称
		 */
		@ApiField("key_name")
		private String keyName;
	

	public String getKeyName() {
			return this.keyName;
		}
		public void setKeyName(String keyName) {
			this.keyName = keyName;
		}

}

	/**
 * 数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CustomAreaResult extends TaobaoObject {

	private static final long serialVersionUID = 5724198677738411784L;

	/**
		 * 自定义区id
		 */
		@ApiField("custom_area_id")
		private Long customAreaId;
		/**
		 * 自定义区url
		 */
		@ApiField("custom_area_url")
		private String customAreaUrl;
		/**
		 * keys
		 */
		@ApiListField("keys")
		@ApiField("key_result")
		private List<KeyResult> keys;
	

	public Long getCustomAreaId() {
			return this.customAreaId;
		}
		public void setCustomAreaId(Long customAreaId) {
			this.customAreaId = customAreaId;
		}
		public String getCustomAreaUrl() {
			return this.customAreaUrl;
		}
		public void setCustomAreaUrl(String customAreaUrl) {
			this.customAreaUrl = customAreaUrl;
		}
		public List<KeyResult> getKeys() {
			return this.keys;
		}
		public void setKeys(List<KeyResult> keys) {
			this.keys = keys;
		}

}

	/**
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 6474526413678253954L;

	/**
		 * 数据
		 */
		@ApiListField("datas")
		@ApiField("custom_area_result")
		private List<CustomAreaResult> datas;
		/**
		 * 系统自动生成
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 系统自动生成
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 系统自动生成
		 */
		@ApiField("success")
		private Boolean success;
	

	public List<CustomAreaResult> getDatas() {
			return this.datas;
		}
		public void setDatas(List<CustomAreaResult> datas) {
			this.datas = datas;
		}
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
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}
