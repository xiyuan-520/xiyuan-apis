package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTasksGetResponse;

/**
 * TOP API: taobao.qianniu.tasks.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.16
 */
public class QianniuTasksGetRequest extends BaseTaobaoRequest<QianniuTasksGetResponse> {
	
	

	/** 
	* 业务ID列表，逗号分隔
	 */
	private String bizIds;

	/** 
	* 业务相关的对象，当前主要表示买家nick
	 */
	private String bizNick;

	/** 
	* 业务类型
	 */
	private String bizType;

	/** 
	* 客户端的版本信息
	 */
	private String clientInfo;

	/** 
	* 当前页数，从1开始
	 */
	private Long currentPage;

	/** 
	* 根据任务创建时间搜索的结束日期（含），不填则不限。例如只查询2014-01-01当天的任务，则将start_date和end_date都设置成2014-01-01
	 */
	private String endDate;

	/** 
	* 需要排除的任务类型
	 */
	private String excludeBizType;

	/** 
	* 逗号分隔的字段列表，各个字段含义： id：任务ID receiver_uid：执行者用户数字ID receiver_nick：执行者用户昵称 status：任务状态：0-未执行，1-执行中，2-执行完成，3-超时，4-取消，5-忽略 sub_status：子任务状态，由业务方自定义 finish_strategy：任务完成策略：1-一个人完成，2-所有人完成 gmt_finished：任务完成时间，格式：时间毫秒数 biz_type：业务类型 sub_biz_type：子业务类型 biz_id：业务ID biz_param：业务参数 biz_entry：业务入口 tag：任务标签 memo：任务备注
	 */
	private String fields;

	/** 
	* 关键词搜索。只对任务内容进行模糊匹配，以及bizid和biznick进行精准匹配
	 */
	private String keyWord;

	/** 
	* 任务元id，多个以逗号分隔
	 */
	private String metadataIds;

	/** 
	* 根据任务修改时间搜索的结束时间（含），不填则不限。例如查询“2014-01-01 00:00:10”之前有修改的任务，则将modify_end_time_str设置成“2014-01-01 00:00:10”
	 */
	private String modifyEndTimeStr;

	/** 
	* 根据任务修改时间搜索的开始时间（含），不填则不限。例如查询“2014-01-01 00:00:10”之后有修改的任务，则将modify_start_time_str设置成“2014-01-01 00:00:10”
	 */
	private String modifyStartTimeStr;

	/** 
	* 是否需要删除的任务，默认为false
	 */
	private Boolean needDeleted;

	/** 
	* 是否需要meta信息，默认值为false
	 */
	private Boolean needMeta;

	/** 
	* 排序字段，可以为id,gmt_create,gmt_finished,metadata_id等
	 */
	private String orderBy;

	/** 
	* asc为升，desc为降
	 */
	private String orderType;

	/** 
	* 每页条数
	 */
	private Long pageSize;

	/** 
	* 优先级。即创建时的metadata中的优先级。0为低，1为中，2为高。
	 */
	private Long priority;

	/** 
	* 任务执行者用户数字ID
	 */
	private Long receiverUid;

	/** 
	* 0-不需要提醒，未设提醒时间 1-设置过提醒时间，需要提醒
	 */
	private Long remindFlag;

	/** 
	* 任务发起者用户数字ID
	 */
	private Long senderUid;

	/** 
	* 根据任务创建时间搜索的开始日期（含），不填则不限。例如只查询2014-01-01当天的任务，则将start_date和end_date都设置成2014-01-01
	 */
	private String startDate;

	/** 
	* 逗号分隔的任务状态：0-未执行，1-执行中，2-执行完成，3-超时，4-取消，5-忽略
	 */
	private String status;

	/** 
	* 子任务类型
	 */
	private String subBizType;

	/** 
	* 逗号分隔的子任务状态，由业务方自定义
	 */
	private String subStatus;

	/** 
	* 任务的ID列表，用逗号分隔
	 */
	private String taskIds;

	public void setBizIds(String bizIds) {
		this.bizIds = bizIds;
	}

	public String getBizIds() {
		return this.bizIds;
	}

	public void setBizNick(String bizNick) {
		this.bizNick = bizNick;
	}

	public String getBizNick() {
		return this.bizNick;
	}

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

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setExcludeBizType(String excludeBizType) {
		this.excludeBizType = excludeBizType;
	}

	public String getExcludeBizType() {
		return this.excludeBizType;
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

	public void setMetadataIds(String metadataIds) {
		this.metadataIds = metadataIds;
	}

	public String getMetadataIds() {
		return this.metadataIds;
	}

	public void setModifyEndTimeStr(String modifyEndTimeStr) {
		this.modifyEndTimeStr = modifyEndTimeStr;
	}

	public String getModifyEndTimeStr() {
		return this.modifyEndTimeStr;
	}

	public void setModifyStartTimeStr(String modifyStartTimeStr) {
		this.modifyStartTimeStr = modifyStartTimeStr;
	}

	public String getModifyStartTimeStr() {
		return this.modifyStartTimeStr;
	}

	public void setNeedDeleted(Boolean needDeleted) {
		this.needDeleted = needDeleted;
	}

	public Boolean getNeedDeleted() {
		return this.needDeleted;
	}

	public void setNeedMeta(Boolean needMeta) {
		this.needMeta = needMeta;
	}

	public Boolean getNeedMeta() {
		return this.needMeta;
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

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setReceiverUid(Long receiverUid) {
		this.receiverUid = receiverUid;
	}

	public Long getReceiverUid() {
		return this.receiverUid;
	}

	public void setRemindFlag(Long remindFlag) {
		this.remindFlag = remindFlag;
	}

	public Long getRemindFlag() {
		return this.remindFlag;
	}

	public void setSenderUid(Long senderUid) {
		this.senderUid = senderUid;
	}

	public Long getSenderUid() {
		return this.senderUid;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getSubStatus() {
		return this.subStatus;
	}

	public void setTaskIds(String taskIds) {
		this.taskIds = taskIds;
	}

	public String getTaskIds() {
		return this.taskIds;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.tasks.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_ids", this.bizIds);
		txtParams.put("biz_nick", this.bizNick);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("client_info", this.clientInfo);
		txtParams.put("current_page", this.currentPage);
		txtParams.put("end_date", this.endDate);
		txtParams.put("exclude_biz_type", this.excludeBizType);
		txtParams.put("fields", this.fields);
		txtParams.put("key_word", this.keyWord);
		txtParams.put("metadata_ids", this.metadataIds);
		txtParams.put("modify_end_time_str", this.modifyEndTimeStr);
		txtParams.put("modify_start_time_str", this.modifyStartTimeStr);
		txtParams.put("need_deleted", this.needDeleted);
		txtParams.put("need_meta", this.needMeta);
		txtParams.put("order_by", this.orderBy);
		txtParams.put("order_type", this.orderType);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("priority", this.priority);
		txtParams.put("receiver_uid", this.receiverUid);
		txtParams.put("remind_flag", this.remindFlag);
		txtParams.put("sender_uid", this.senderUid);
		txtParams.put("start_date", this.startDate);
		txtParams.put("status", this.status);
		txtParams.put("sub_biz_type", this.subBizType);
		txtParams.put("sub_status", this.subStatus);
		txtParams.put("task_ids", this.taskIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTasksGetResponse> getResponseClass() {
		return QianniuTasksGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
	}
	

}