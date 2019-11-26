package com.xiyuan.taobao.api.domain;

import java.util.Date;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 轻任务元数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class QTaskMetadata extends TaobaoObject {

	private static final long serialVersionUID = 7774172275791595215L;

	/**
	 * 点击动作的协议
	 */
	@ApiField("action")
	private String action;

	/**
	 * 轻任务附件信息，userId_timestamp_随机字符串，例如：23434_1234458623_seresfto
	 */
	@ApiField("attachments")
	private String attachments;

	/**
	 * 我的安排的任务上的提醒时间
	 */
	@ApiField("biz_remind_time")
	private Date bizRemindTime;

	/**
	 * 是biz_remind_time的数字格式
	 */
	@ApiField("biz_remind_time_long")
	private Long bizRemindTimeLong;

	/**
	 * 来源系统ID
	 */
	@ApiField("biz_sys_id")
	private Long bizSysId;

	/**
	 * 任务在来源系统的类型, 这个是业务系统的自定义类型
	 */
	@ApiField("biz_sys_task_type")
	private Long bizSysTaskType;

	/**
	 * 接收的任务类型，所有相关的任务的类型一致时有效。当任务类型不一致时为diff
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * biztype的中文名
	 */
	@ApiField("biz_type_str")
	private String bizTypeStr;

	/**
	 * 当前任务的评论数
	 */
	@ApiField("comment_count")
	private Long commentCount;

	/**
	 * 任务摘要内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 任务结束时间，格式：当前时间毫秒数
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * end_time的数字格式
	 */
	@ApiField("end_time_long")
	private Long endTimeLong;

	/**
	 * 完成的任务数。如果完成策略是只需要1个人完成的，则只要一个人完成就会返回总任务条数。如果是所有人都要完成的，则会返回实际完成条数。
	 */
	@ApiField("finish_count")
	private Long finishCount;

	/**
	 * 任务完成标识： 0表示只要有一个人完成任务即可，1表示所有人需要各自都完成任务
	 */
	@ApiField("finish_strategy")
	private Long finishStrategy;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * gmt_create的数字格式
	 */
	@ApiField("gmt_create_long")
	private Long gmtCreateLong;

	/**
	 * 任务更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * gmt_modified的数字格式
	 */
	@ApiField("gmt_modified_long")
	private Long gmtModifiedLong;

	/**
	 * 主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 任务元备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * newYunpanAttachments
	 */
	@ApiField("new_yunpan_attachments")
	private String newYunpanAttachments;

	/**
	 * 优先级，0低，1中，2高
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 任务的接收人
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 提醒标志位： 0表示不需要提醒，1表示需要状态变更提醒
	 */
	@ApiField("reminder_flag")
	private Long reminderFlag;

	/**
	 * 发起者用户昵称
	 */
	@ApiField("sender_nick")
	private String senderNick;

	/**
	 * 发起者用户数字ID
	 */
	@ApiField("sender_uid")
	private Long senderUid;

	/**
	 * 任务开始时间，格式：当前时间毫秒数
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * start_time的数字格式
	 */
	@ApiField("start_time_long")
	private Long startTimeLong;

	/**
	 * 0为未完成，2为完成，4为取消
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 与此任务元相关的任务数
	 */
	@ApiField("task_count")
	private Long taskCount;

	/**
	 * 任务标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 同次操作的任务元数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 语音备注的文件名
	 */
	@ApiField("voice_file")
	private String voiceFile;


	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAttachments() {
		return this.attachments;
	}
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public Date getBizRemindTime() {
		return this.bizRemindTime;
	}
	public void setBizRemindTime(Date bizRemindTime) {
		this.bizRemindTime = bizRemindTime;
	}

	public Long getBizRemindTimeLong() {
		return this.bizRemindTimeLong;
	}
	public void setBizRemindTimeLong(Long bizRemindTimeLong) {
		this.bizRemindTimeLong = bizRemindTimeLong;
	}

	public Long getBizSysId() {
		return this.bizSysId;
	}
	public void setBizSysId(Long bizSysId) {
		this.bizSysId = bizSysId;
	}

	public Long getBizSysTaskType() {
		return this.bizSysTaskType;
	}
	public void setBizSysTaskType(Long bizSysTaskType) {
		this.bizSysTaskType = bizSysTaskType;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizTypeStr() {
		return this.bizTypeStr;
	}
	public void setBizTypeStr(String bizTypeStr) {
		this.bizTypeStr = bizTypeStr;
	}

	public Long getCommentCount() {
		return this.commentCount;
	}
	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getEndTimeLong() {
		return this.endTimeLong;
	}
	public void setEndTimeLong(Long endTimeLong) {
		this.endTimeLong = endTimeLong;
	}

	public Long getFinishCount() {
		return this.finishCount;
	}
	public void setFinishCount(Long finishCount) {
		this.finishCount = finishCount;
	}

	public Long getFinishStrategy() {
		return this.finishStrategy;
	}
	public void setFinishStrategy(Long finishStrategy) {
		this.finishStrategy = finishStrategy;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getGmtCreateLong() {
		return this.gmtCreateLong;
	}
	public void setGmtCreateLong(Long gmtCreateLong) {
		this.gmtCreateLong = gmtCreateLong;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getGmtModifiedLong() {
		return this.gmtModifiedLong;
	}
	public void setGmtModifiedLong(Long gmtModifiedLong) {
		this.gmtModifiedLong = gmtModifiedLong;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNewYunpanAttachments() {
		return this.newYunpanAttachments;
	}
	public void setNewYunpanAttachments(String newYunpanAttachments) {
		this.newYunpanAttachments = newYunpanAttachments;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Long getReminderFlag() {
		return this.reminderFlag;
	}
	public void setReminderFlag(Long reminderFlag) {
		this.reminderFlag = reminderFlag;
	}

	public String getSenderNick() {
		return this.senderNick;
	}
	public void setSenderNick(String senderNick) {
		this.senderNick = senderNick;
	}

	public Long getSenderUid() {
		return this.senderUid;
	}
	public void setSenderUid(Long senderUid) {
		this.senderUid = senderUid;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getStartTimeLong() {
		return this.startTimeLong;
	}
	public void setStartTimeLong(Long startTimeLong) {
		this.startTimeLong = startTimeLong;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTaskCount() {
		return this.taskCount;
	}
	public void setTaskCount(Long taskCount) {
		this.taskCount = taskCount;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getVoiceFile() {
		return this.voiceFile;
	}
	public void setVoiceFile(String voiceFile) {
		this.voiceFile = voiceFile;
	}

}
