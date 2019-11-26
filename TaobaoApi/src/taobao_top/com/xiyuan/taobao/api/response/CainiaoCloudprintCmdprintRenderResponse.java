package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.cloudprint.cmdprint.render response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintCmdprintRenderResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8525955779447399774L;

	/** 
	 * 指令集内容串
	 */
	@ApiField("cmd_content")
	private String cmdContent;

	/** 
	 * 指令集编码方式：origin-原串 gzip-采用gzip压缩并base64编码
	 */
	@ApiField("cmd_encoding")
	private String cmdEncoding;

	/** 
	 * 0成功，非0失败
	 */
	@ApiField("ret_code")
	private String retCode;

	/** 
	 * 错误信息
	 */
	@ApiField("ret_msg")
	private String retMsg;


	public void setCmdContent(String cmdContent) {
		this.cmdContent = cmdContent;
	}
	public String getCmdContent( ) {
		return this.cmdContent;
	}

	public void setCmdEncoding(String cmdEncoding) {
		this.cmdEncoding = cmdEncoding;
	}
	public String getCmdEncoding( ) {
		return this.cmdEncoding;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetCode( ) {
		return this.retCode;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public String getRetMsg( ) {
		return this.retMsg;
	}
	


}
