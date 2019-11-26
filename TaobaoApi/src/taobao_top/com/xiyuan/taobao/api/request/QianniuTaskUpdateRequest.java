package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskUpdateResponse;

/**
 * TOP API: taobao.qianniu.task.update request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskUpdateRequest extends BaseTaobaoRequest<QianniuTaskUpdateResponse> {
	
	

	/** 
	* 应用自定义参数
	 */
	private String bizParam;

	/** 
	* 0表示没有删除，1表示删除
	 */
	private Long isDeleted;

	/** 
	* 任务备注。当memo_mode为1时，memo将采用追加方式。
	 */
	private String memo;

	/** 
	* 表示memo字段的更新策略。如需采用追加方式的，请将此字段设置为1。
	 */
	private Long memoMode;

	/** 
	* 默认填0，数字越大优化级越高。当前常用0和1.
	 */
	private Long priority;

	/** 
	* 0为不提醒，1为全部提醒，2为PC提醒，3为移动提醒，4为已提醒，5为已忽略。
	 */
	private Long remindFlag;

	/** 
	* 提醒时间，时间的毫秒数
	 */
	private Long remindTime;

	/** 
	* 状态值，多个以逗号分隔
	 */
	private String status;

	/** 
	* 子任务状态，由业务方自定义
	 */
	private String subStatus;

	/** 
	* 任务标签
	 */
	private String tag;

	/** 
	* 任务ID
	 */
	private Long taskId;

	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
	}

	public String getBizParam() {
		return this.bizParam;
	}

	public void setIsDeleted(Long isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getIsDeleted() {
		return this.isDeleted;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemoMode(Long memoMode) {
		this.memoMode = memoMode;
	}

	public Long getMemoMode() {
		return this.memoMode;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setRemindFlag(Long remindFlag) {
		this.remindFlag = remindFlag;
	}

	public Long getRemindFlag() {
		return this.remindFlag;
	}

	public void setRemindTime(Long remindTime) {
		this.remindTime = remindTime;
	}

	public Long getRemindTime() {
		return this.remindTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getSubStatus() {
		return this.subStatus;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.task.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_param", this.bizParam);
		txtParams.put("is_deleted", this.isDeleted);
		txtParams.put("memo", this.memo);
		txtParams.put("memo_mode", this.memoMode);
		txtParams.put("priority", this.priority);
		txtParams.put("remind_flag", this.remindFlag);
		txtParams.put("remind_time", this.remindTime);
		txtParams.put("status", this.status);
		txtParams.put("sub_status", this.subStatus);
		txtParams.put("tag", this.tag);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskUpdateResponse> getResponseClass() {
		return QianniuTaskUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}