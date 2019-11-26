package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cloudprint.stdtemplates.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintStdtemplatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2286749646619796763L;

	/** 
	 * 结果集
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
 * 该cp的所有标准模板
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class StandardTemplateDo extends TaobaoObject {

	private static final long serialVersionUID = 1726189778763787144L;

	/**
		 * 模板id
		 */
		@ApiField("standard_template_id")
		private Long standardTemplateId;
		/**
		 * 模板名称
		 */
		@ApiField("standard_template_name")
		private String standardTemplateName;
		/**
		 * 模板url
		 */
		@ApiField("standard_template_url")
		private String standardTemplateUrl;
		/**
		 * 1 快递标准面单 ,2 快递三联面单, 3 快递便携式三联单, 4 快运标准面单, 5 快运三联面单
		 */
		@ApiField("standard_waybill_type")
		private Long standardWaybillType;
	

	public Long getStandardTemplateId() {
			return this.standardTemplateId;
		}
		public void setStandardTemplateId(Long standardTemplateId) {
			this.standardTemplateId = standardTemplateId;
		}
		public String getStandardTemplateName() {
			return this.standardTemplateName;
		}
		public void setStandardTemplateName(String standardTemplateName) {
			this.standardTemplateName = standardTemplateName;
		}
		public String getStandardTemplateUrl() {
			return this.standardTemplateUrl;
		}
		public void setStandardTemplateUrl(String standardTemplateUrl) {
			this.standardTemplateUrl = standardTemplateUrl;
		}
		public Long getStandardWaybillType() {
			return this.standardWaybillType;
		}
		public void setStandardWaybillType(Long standardWaybillType) {
			this.standardWaybillType = standardWaybillType;
		}

}

	/**
 * 所有cp的标准模板
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class StandardTemplateResult extends TaobaoObject {

	private static final long serialVersionUID = 6276649617965381995L;

	/**
		 * cp编码
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 该cp的所有标准模板
		 */
		@ApiListField("standard_templates")
		@ApiField("standard_template_do")
		private List<StandardTemplateDo> standardTemplates;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public List<StandardTemplateDo> getStandardTemplates() {
			return this.standardTemplates;
		}
		public void setStandardTemplates(List<StandardTemplateDo> standardTemplates) {
			this.standardTemplates = standardTemplates;
		}

}

	/**
 * 结果集
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 5159667878293519358L;

	/**
		 * 所有cp的标准模板
		 */
		@ApiListField("datas")
		@ApiField("standard_template_result")
		private List<StandardTemplateResult> datas;
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
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public List<StandardTemplateResult> getDatas() {
			return this.datas;
		}
		public void setDatas(List<StandardTemplateResult> datas) {
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
