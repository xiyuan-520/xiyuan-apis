package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.TmcMessage;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.messages.consume response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessagesConsumeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6173244765488964644L;

	/** 
	 * 消息列表
	 */
	@ApiListField("messages")
	@ApiField("tmc_message")
	private List<TmcMessage> messages;


	public void setMessages(List<TmcMessage> messages) {
		this.messages = messages;
	}
	public List<TmcMessage> getMessages( ) {
		return this.messages;
	}
	


}
