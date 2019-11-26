package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskmetasGetResponse;

/**
 * TOP API: taobao.qianniu.taskmetas.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.22
 */
public class QianniuTaskmetasGetRequest extends BaseTaobaoRequest<QianniuTaskmetasGetResponse> {
	
	

	/** 
	* 任务类型
	 */
	private String bizType;

	/** 
	* 客户端的版本信息
	 */
	private String clientInfo;

	/** 
	* 当前页码
	 */
	private Long currentPage;

	/** 
	* 逗号分隔的字段列表.如id,title,content,sender_uid,sender_nick,finish_strategy,biz_sys_Id,biz_sys_task_type,start_time,end_time,reminder_flag,priority
	 */
	private String fields;

	/** 
	* 按关键字搜索
	 */
	private String keyWord;

	/** 
	* 任务元ID，多个以逗号分离
	 */
	private String metaIds;

	/** 
	* 排序字段。gmt_create,priority等
	 */
	private String orderBy;

	/** 
	* 升降序。asc为升，desc为降
	 */
	private String orderType;

	/** 
	* 分页数，最大100
	 */
	private Long pageSize;

	/** 
	* 接收人uid
	 */
	private Long receiverUid;

	/** 
	* 发起任务人的uid
	 */
	private Long senderUid;

	/** 
	* 0为未完成。2为完成。4为取消。不填为所有
	 */
	private Long status;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}

	public String getClientInfo() {
		return this.clientInfo;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getKeyWord() {
		return this.keyWord;
	}

	public void setMetaIds(String metaIds) {
		this.metaIds = metaIds;
	}

	public String getMetaIds() {
		return this.metaIds;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setReceiverUid(Long receiverUid) {
		this.receiverUid = receiverUid;
	}

	public Long getReceiverUid() {
		return this.receiverUid;
	}

	public void setSenderUid(Long senderUid) {
		this.senderUid = senderUid;
	}

	public Long getSenderUid() {
		return this.senderUid;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.taskmetas.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_type", this.bizType);
		txtParams.put("client_info", this.clientInfo);
		txtParams.put("current_page", this.currentPage);
		txtParams.put("fields", this.fields);
		txtParams.put("key_word", this.keyWord);
		txtParams.put("meta_ids", this.metaIds);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("order_type", this.orderType);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("receiver_uid", this.receiverUid);
		txtParams.put("sender_uid", this.senderUid);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskmetasGetResponse> getResponseClass() {
		return QianniuTaskmetasGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
	}
	

}