package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.user.topics.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcUserTopicsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5723346326875685237L;

	/** 
	 * 错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 错误信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * topic列表
	 */
	@ApiListField("topics")
	@ApiField("string")
	private List<String> topics;


	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public List<String> getTopics( ) {
		return this.topics;
	}
	


}
