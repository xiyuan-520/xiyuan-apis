package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 卖家移动工作平台返回资源计数结构体
 *
 * @author top auto create
 * @since 1.0, null
 */
public class MessageInfo extends TaobaoObject {

	private static final long serialVersionUID = 8791897953852789714L;

	/**
	 * 最新的一个消息
	 */
	@ApiField("last_msg")
	private String lastMsg;

	/**
	 * 资源的数量
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 子账号userid
	 */
	@ApiField("sub_user_id")
	private String subUserId;

	/**
	 * 业务类型，比如：item表示商品
	 */
	@ApiField("topic")
	private String topic;

	/**
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 主账号userid
	 */
	@ApiField("user_id")
	private String userId;


	public String getLastMsg() {
		return this.lastMsg;
	}
	public void setLastMsg(String lastMsg) {
		this.lastMsg = lastMsg;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public String getSubUserId() {
		return this.subUserId;
	}
	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
