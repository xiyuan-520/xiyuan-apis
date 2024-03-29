package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.openstorage.isv.resources.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoOpenstorageIsvResourcesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5891874671176667874L;

	/** 
	 * result
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
 * data
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IsvResourceMetaInfo extends TaobaoObject {

	private static final long serialVersionUID = 7547999554421799764L;

	/**
		 * 是否需要发布
		 */
		@ApiField("need_publish")
		private Boolean needPublish;
		/**
		 * 资源id
		 */
		@ApiField("resource_id")
		private Long resourceId;
		/**
		 * 资源名称
		 */
		@ApiField("resource_name")
		private String resourceName;
		/**
		 * 资源类型
		 */
		@ApiField("resource_type")
		private String resourceType;
	

	public Boolean getNeedPublish() {
			return this.needPublish;
		}
		public void setNeedPublish(Boolean needPublish) {
			this.needPublish = needPublish;
		}
		public Long getResourceId() {
			return this.resourceId;
		}
		public void setResourceId(Long resourceId) {
			this.resourceId = resourceId;
		}
		public String getResourceName() {
			return this.resourceName;
		}
		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
		public String getResourceType() {
			return this.resourceType;
		}
		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 6653945196648341618L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误消息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * data
		 */
		@ApiListField("resourcelist")
		@ApiField("isv_resource_meta_info")
		private List<IsvResourceMetaInfo> resourcelist;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	

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
		public List<IsvResourceMetaInfo> getResourcelist() {
			return this.resourcelist;
		}
		public void setResourcelist(List<IsvResourceMetaInfo> resourcelist) {
			this.resourcelist = resourcelist;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}
