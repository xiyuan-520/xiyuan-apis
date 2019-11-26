package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTasksCountResponse;

/**
 * TOP API: taobao.qianniu.tasks.count request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTasksCountRequest extends BaseTaobaoRequest<QianniuTasksCountResponse> {
	
	

	/** 
	* 业务ID列表，逗号分隔
	 */
	private String bizIds;

	/** 
	* 与业务相关的买家nick
	 */
	private String bizNick;

	/** 
	* 业务类型
	 */
	private String bizType;

	/** 
	* 按时间段搜索的结束日期。不填则不限。格式为2014-01-01
	 */
	private String endDate;

	/** 
	* 需要排除的任务类型
	 */
	private String excludeBizType;

	/** 
	* 关键词搜索。只对任务内容进行模糊匹配，以及bizid和biznick进行精准匹配
	 */
	private String keyWord;

	/** 
	* 任务元id，多个以逗号分隔
	 */
	private String metadataIds;

	/** 
	* 优先级
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
	* 按时间段搜索时的开始日期，格式如2014-01-01，不填则不限
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
		return "taobao.qianniu.tasks.count";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_ids", this.bizIds);
		txtParams.put("biz_nick", this.bizNick);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("end_date", this.endDate);
		txtParams.put("exclude_biz_type", this.excludeBizType);
		txtParams.put("key_word", this.keyWord);
		txtParams.put("metadata_ids", this.metadataIds);
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

	public Class<QianniuTasksCountResponse> getResponseClass() {
		return QianniuTasksCountResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}