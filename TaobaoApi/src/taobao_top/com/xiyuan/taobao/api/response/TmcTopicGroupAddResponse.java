package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.topic.group.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcTopicGroupAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2678748145922175327L;

	/** 
	 * true
	 */
	@ApiField("result")
	private Boolean result;


	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}
	


}
