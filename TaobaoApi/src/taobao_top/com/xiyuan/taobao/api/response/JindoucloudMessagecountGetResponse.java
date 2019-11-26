package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.domain.MessageInfo;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jindoucloud.messagecount.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JindoucloudMessagecountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8559499917755399758L;

	/** 
	 * 返回的资源计数列表
	 */
	@ApiListField("message_infos")
	@ApiField("message_info")
	private List<MessageInfo> messageInfos;


	public void setMessageInfos(List<MessageInfo> messageInfos) {
		this.messageInfos = messageInfos;
	}
	public List<MessageInfo> getMessageInfos( ) {
		return this.messageInfos;
	}
	


}
