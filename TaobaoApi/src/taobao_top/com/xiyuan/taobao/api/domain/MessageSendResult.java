package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 消息发送结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public class MessageSendResult extends TaobaoObject {

	private static final long serialVersionUID = 7618628589921583346L;

	/**
	 * 错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/**
	 * 错误描述
	 */
	@ApiField("err_msg")
	private String errMsg;

	/**
	 * 发送结果
	 */
	@ApiField("is_success")
	private String isSuccess;

	/**
	 * nick
	 */
	@ApiField("nick")
	private String nick;


	public String getErrCode() {
		return this.errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

}
