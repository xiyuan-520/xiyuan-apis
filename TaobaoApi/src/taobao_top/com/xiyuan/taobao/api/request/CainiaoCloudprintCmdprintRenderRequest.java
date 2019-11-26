package com.xiyuan.taobao.api.request;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.CainiaoCloudprintCmdprintRenderResponse;

/**
 * TOP API: cainiao.cloudprint.cmdprint.render request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CainiaoCloudprintCmdprintRenderRequest extends BaseTaobaoRequest<CainiaoCloudprintCmdprintRenderResponse> {
	
	

	/** 
	* 参数对象
	 */
	private String params;

	public void setParams(String params) {
		this.params = params;
	}

	public void setParams(CmdRenderParams params) {
		this.params = new JSONWriter(false,true).write(params);
	}

	public String getParams() {
		return this.params;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.cmdprint.render";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("params", this.params);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintCmdprintRenderResponse> getResponseClass() {
		return CainiaoCloudprintCmdprintRenderResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 包含的区域列表。对于有自定义区的文档，content会包含两条，即第一条是标准模板区域内容、第二条是自定义区域内容
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RenderContent extends TaobaoObject {

	private static final long serialVersionUID = 4171922332993271281L;

	/**
		 * 打印数据
		 */
		@ApiField("print_data")
		private String printData;
		/**
		 * 模板url
		 */
		@ApiField("template_url")
		private String templateUrl;
	

	public String getPrintData() {
			return this.printData;
		}
		public void setPrintData(String printData) {
			this.printData = printData;
		}
		public String getTemplateUrl() {
			return this.templateUrl;
		}
		public void setTemplateUrl(String templateUrl) {
			this.templateUrl = templateUrl;
		}

}

	/**
 * 需要打印的文档，包括模板地址、打印数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RenderDocument extends TaobaoObject {

	private static final long serialVersionUID = 3413246228132553441L;

	/**
		 * 包含的区域列表。对于有自定义区的文档，content会包含两条，即第一条是标准模板区域内容、第二条是自定义区域内容
		 */
		@ApiListField("contents")
		@ApiField("render_content")
		private List<RenderContent> contents;
	

	public List<RenderContent> getContents() {
			return this.contents;
		}
		public void setContents(List<RenderContent> contents) {
			this.contents = contents;
		}

}

	/**
 * 打印配置
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RenderConfig extends TaobaoObject {

	private static final long serialVersionUID = 4435492223252425113L;

	/**
		 * 下联logo
		 */
		@ApiField("need_bottom_logo")
		private Boolean needBottomLogo;
		/**
		 * 中间logo
		 */
		@ApiField("need_middle_logo")
		private Boolean needMiddleLogo;
		/**
		 * 上联logo
		 */
		@ApiField("need_top_logo")
		private Boolean needTopLogo;
		/**
		 * 打印方向：normal-正常 reverse-翻转(旋转180°)
		 */
		@ApiField("orientation")
		private String orientation;
	

	public Boolean getNeedBottomLogo() {
			return this.needBottomLogo;
		}
		public void setNeedBottomLogo(Boolean needBottomLogo) {
			this.needBottomLogo = needBottomLogo;
		}
		public Boolean getNeedMiddleLogo() {
			return this.needMiddleLogo;
		}
		public void setNeedMiddleLogo(Boolean needMiddleLogo) {
			this.needMiddleLogo = needMiddleLogo;
		}
		public Boolean getNeedTopLogo() {
			return this.needTopLogo;
		}
		public void setNeedTopLogo(Boolean needTopLogo) {
			this.needTopLogo = needTopLogo;
		}
		public String getOrientation() {
			return this.orientation;
		}
		public void setOrientation(String orientation) {
			this.orientation = orientation;
		}

}

	/**
 * 参数对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CmdRenderParams extends TaobaoObject {

	private static final long serialVersionUID = 8141614551595934549L;

	/**
		 * 客户端ID
		 */
		@ApiField("client_id")
		private String clientId;
		/**
		 * 客户端类型：weixin/alipay/native
		 */
		@ApiField("client_type")
		private String clientType;
		/**
		 * 打印配置
		 */
		@ApiField("config")
		private RenderConfig config;
		/**
		 * 需要打印的文档，包括模板地址、打印数据
		 */
		@ApiField("document")
		private RenderDocument document;
		/**
		 * 打印机名称
		 */
		@ApiField("printer_name")
		private String printerName;
	

	public String getClientId() {
			return this.clientId;
		}
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		public String getClientType() {
			return this.clientType;
		}
		public void setClientType(String clientType) {
			this.clientType = clientType;
		}
		public RenderConfig getConfig() {
			return this.config;
		}
		public void setConfig(RenderConfig config) {
			this.config = config;
		}
		public RenderDocument getDocument() {
			return this.document;
		}
		public void setDocument(RenderDocument document) {
			this.document = document;
		}
		public String getPrinterName() {
			return this.printerName;
		}
		public void setPrinterName(String printerName) {
			this.printerName = printerName;
		}

}


}