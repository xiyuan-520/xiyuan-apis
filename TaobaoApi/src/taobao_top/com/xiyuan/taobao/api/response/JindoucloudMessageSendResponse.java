package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.domain.MessageSendResult;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jindoucloud.message.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JindoucloudMessageSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4487137815912753857L;

	/** 
	 * 返回结果
	 */
	@ApiListField("send_results")
	@ApiField("send_result")
	private List<MessageSendResult> sendResults;


	public void setSendResults(List<MessageSendResult> sendResults) {
		this.sendResults = sendResults;
	}
	public List<MessageSendResult> getSendResults( ) {
		return this.sendResults;
	}
	


}
