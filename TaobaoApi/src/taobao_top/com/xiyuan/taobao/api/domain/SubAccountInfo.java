package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 子账号基本信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SubAccountInfo extends TaobaoObject {

	private static final long serialVersionUID = 2683293694258666412L;

	/**
	 * openAutoReply
	 */
	@ApiField("open_auto_reply")
	private Boolean openAutoReply;

	/**
	 * true
	 */
	@ApiField("sub_dispatch_status")
	private Boolean subDispatchStatus;

	/**
	 * 123456
	 */
	@ApiField("sub_id")
	private Long subId;

	/**
	 * 小红
	 */
	@ApiField("sub_name")
	private String subName;

	/**
	 * zhangsan:no1
	 */
	@ApiField("sub_nick")
	private String subNick;

	/**
	 * true
	 */
	@ApiField("sub_owed_status")
	private Boolean subOwedStatus;

	/**
	 * 1
	 */
	@ApiField("sub_status")
	private Long subStatus;

	/**
	 * 654321
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * zhangsan
	 */
	@ApiField("user_nick")
	private String userNick;


	public Boolean getOpenAutoReply() {
		return this.openAutoReply;
	}
	public void setOpenAutoReply(Boolean openAutoReply) {
		this.openAutoReply = openAutoReply;
	}

	public Boolean getSubDispatchStatus() {
		return this.subDispatchStatus;
	}
	public void setSubDispatchStatus(Boolean subDispatchStatus) {
		this.subDispatchStatus = subDispatchStatus;
	}

	public Long getSubId() {
		return this.subId;
	}
	public void setSubId(Long subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return this.subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getSubNick() {
		return this.subNick;
	}
	public void setSubNick(String subNick) {
		this.subNick = subNick;
	}

	public Boolean getSubOwedStatus() {
		return this.subOwedStatus;
	}
	public void setSubOwedStatus(Boolean subOwedStatus) {
		this.subOwedStatus = subOwedStatus;
	}

	public Long getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(Long subStatus) {
		this.subStatus = subStatus;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
