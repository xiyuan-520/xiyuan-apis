package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.JindoucloudMessagecountGetResponse;

/**
 * TOP API: taobao.jindoucloud.messagecount.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class JindoucloudMessagecountGetRequest extends BaseTaobaoRequest<JindoucloudMessagecountGetResponse> {
	
	

	/** 
	* 客户端的版本信息
	 */
	private String clientInfo;

	/** 
	* 需要的字段
	 */
	private String fields;

	/** 
	* 是否需要详细的数字和最后一条消息
	 */
	private Boolean needDetail;

	/** 
	* 查询的计数器的类型，比如：item，表示商品类型，可以传递多个类型，多个类型之间用英文逗号分隔
	 */
	private String topic;

	/** 
	* 用于区分是要获取服务号的未读数还是系统消息的未读数。4表示系统消息，5表示服务号
	 */
	private Long type;

	/** 
	* 如果是子账号，则用:拼接，第一位是主账号，第二位是子账号，如果是主账号，则没有:
	 */
	private String userIds;

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}

	public String getClientInfo() {
		return this.clientInfo;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setNeedDetail(Boolean needDetail) {
		this.needDetail = needDetail;
	}

	public Boolean getNeedDetail() {
		return this.needDetail;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "taobao.jindoucloud.messagecount.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("client_info", this.clientInfo);
		txtParams.put("fields", this.fields);
		txtParams.put("need_detail", this.needDetail);
		txtParams.put("topic", this.topic);
		txtParams.put("type", this.type);
		txtParams.put("user_ids", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JindoucloudMessagecountGetResponse> getResponseClass() {
		return JindoucloudMessagecountGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
	}
	

}