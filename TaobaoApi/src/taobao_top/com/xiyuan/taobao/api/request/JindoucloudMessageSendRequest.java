package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.JindoucloudMessageSendResponse;

/**
 * TOP API: taobao.jindoucloud.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class JindoucloudMessageSendRequest extends BaseTaobaoRequest<JindoucloudMessageSendResponse> {
	
	

	/** 
	* 发送的消息。参数说明：
<div>nick：接收者，支持子账号 ，必填
<div>title：展示的标题，必填
<div>biz_id：业务id，同一个业务可以变化多次，即有多个状态的迁移。比如：交易消息的状态迁移。可选
<div>send_no：发送的消息编号，服务端会用appkey+user+send_no对消息做重复发送的控制，必填。
<div>msg_category：分配给isv的允许发送的一级类目。必填
<div>msg_type：分配给isv的允许发送的一级类目下的二级类目，必填。
<div>view_data：json数据，在客户端展示的数据，最多5个。可选。
<div>biz_data：消息跳转到插件，插件需要处理这条消息需要的参数，可选。
	 */
	private String messages;

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public String getMessages() {
		return this.messages;
	}

	public String getApiMethodName() {
		return "taobao.jindoucloud.message.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("messages", this.messages);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JindoucloudMessageSendResponse> getResponseClass() {
		return JindoucloudMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(messages, "messages");
	}
	

}