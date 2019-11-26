package com.xiyuan.taobao.api.domain;

import java.util.Date;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;


/**
 * 轻任务
 *
 * @author top auto create
 * @since 1.0, null
 */
public class QTask extends TaobaoObject {

	private static final long serialVersionUID = 2797862625741629255L;

	/**
	 * json格式的字符串，包含跳转协议
	 */
	@ApiField("action")
	private String action;

	/**
	 * 附件的文件名
	 */
	@ApiField("attachments")
	private String attachments;

	/**
	 * 业务入口
	 */
	@ApiField("biz_entry")
	private String bizEntry;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 点击业务号时的动作
	 */
	@ApiField("biz_id_action")
	private String bizIdAction;

	/**
	 * 业务号的展示名称
	 */
	@ApiField("biz_id_name")
	private String bizIdName;

	/**
	 * 与业务相关的对象。当前主要用于保存买家nick
	 */
	@ApiField("biz_nick")
	private String bizNick;

	/**
	 * 业务参数
	 */
	@ApiField("biz_param")
	private String bizParam;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * biz_type的类型中文名
	 */
	@ApiField("biz_type_str")
	private String bizTypeStr;

	/**
	 * 当前任务的评论数
	 */
	@ApiField("comment_count")
	private Long commentCount;

	/**
	 * 新任务的内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 表示是否为本条记录接收人实际完成
	 */
	@ApiField("finish_flag")
	private Long finishFlag;

	/**
	 * 任务完成标识, 0-一个人完成整个任务, 1-所有人完成整个任务完成，冗余任务元数据字段
	 */
	@ApiField("finish_strategy")
	private Long finishStrategy;

	/**
	 * 任务创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * gmt_create的数字格式
	 */
	@ApiField("gmt_create_long")
	private Long gmtCreateLong;

	/**
	 * 任务完成时间，格式：当前时间毫秒数
	 */
	@ApiField("gmt_finished")
	private Date gmtFinished;

	/**
	 * gmt_finished的数字格式
	 */
	@ApiField("gmt_finished_long")
	private Long gmtFinishedLong;

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
	 * 任务ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 是否删除
	 */
	@ApiField("is_deleted")
	private Long isDeleted;

	/**
	 * 任务备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 关联的任务元数据
	 */
	@ApiField("meta")
	private QTaskMetadata meta;

	/**
	 * 任务元id
	 */
	@ApiField("metadata_id")
	private Long metadataId;

	/**
	 * newYunpanAttachments
	 */
	@ApiField("new_yunpan_attachments")
	private String newYunpanAttachments;

	/**
	 * 父任务的id
	 */
	@ApiField("parent_task_id")
	private Long parentTaskId;

	/**
	 * 优先级，同任务元中的priority值，方便查询使用。
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 任务&ldquo;已读&rdquo;、&ldquo;未读&rdquo;状态，0：已读，1：未读
	 */
	@ApiField("read_status")
	private Long readStatus;

	/**
	 * 执行者用户昵称
	 */
	@ApiField("receiver_nick")
	private String receiverNick;

	/**
	 * 执行者用户数字ID
	 */
	@ApiField("receiver_uid")
	private Long receiverUid;

	/**
	 * 到期提醒的方式。0-不提醒 1-pc和移动提醒 2-仅pc提醒 3-仅移动提醒。在查询类接口中，只需要传2或3即可，为1的数据都会包含在其中。
	 */
	@ApiField("remind_flag")
	private Long remindFlag;

	/**
	 * 提醒时间
	 */
	@ApiField("remind_time")
	private Date remindTime;

	/**
	 * remind_time的数字格式
	 */
	@ApiField("remind_time_long")
	private Long remindTimeLong;

	/**
	 * 发起人nick
	 */
	@ApiField("sender_nick")
	private String senderNick;

	/**
	 * 发起人uid
	 */
	@ApiField("sender_uid")
	private Long senderUid;

	/**
	 * 任务状态：0-未执行，1-执行中，2-执行完成，3-超时，4-取消，5-忽略
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 子任务状态，由业务方自定义
	 */
	@ApiField("sub_status")
	private Long subStatus;

	/**
	 * 任务标签
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 同次操作相关的任务数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 语音附件的文件名
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

	public String getBizEntry() {
		return this.bizEntry;
	}
	public void setBizEntry(String bizEntry) {
		this.bizEntry = bizEntry;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizIdAction() {
		return this.bizIdAction;
	}
	public void setBizIdAction(String bizIdAction) {
		this.bizIdAction = bizIdAction;
	}

	public String getBizIdName() {
		return this.bizIdName;
	}
	public void setBizIdName(String bizIdName) {
		this.bizIdName = bizIdName;
	}

	public String getBizNick() {
		return this.bizNick;
	}
	public void setBizNick(String bizNick) {
		this.bizNick = bizNick;
	}

	public String getBizParam() {
		return this.bizParam;
	}
	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
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

	public Long getFinishFlag() {
		return this.finishFlag;
	}
	public void setFinishFlag(Long finishFlag) {
		this.finishFlag = finishFlag;
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

	public Date getGmtFinished() {
		return this.gmtFinished;
	}
	public void setGmtFinished(Date gmtFinished) {
		this.gmtFinished = gmtFinished;
	}

	public Long getGmtFinishedLong() {
		return this.gmtFinishedLong;
	}
	public void setGmtFinishedLong(Long gmtFinishedLong) {
		this.gmtFinishedLong = gmtFinishedLong;
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

	public Long getIsDeleted() {
		return this.isDeleted;
	}
	public void setIsDeleted(Long isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public QTaskMetadata getMeta() {
		return this.meta;
	}
	public void setMeta(QTaskMetadata meta) {
		this.meta = meta;
	}

	public Long getMetadataId() {
		return this.metadataId;
	}
	public void setMetadataId(Long metadataId) {
		this.metadataId = metadataId;
	}

	public String getNewYunpanAttachments() {
		return this.newYunpanAttachments;
	}
	public void setNewYunpanAttachments(String newYunpanAttachments) {
		this.newYunpanAttachments = newYunpanAttachments;
	}

	public Long getParentTaskId() {
		return this.parentTaskId;
	}
	public void setParentTaskId(Long parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Long getReadStatus() {
		return this.readStatus;
	}
	public void setReadStatus(Long readStatus) {
		this.readStatus = readStatus;
	}

	public String getReceiverNick() {
		return this.receiverNick;
	}
	public void setReceiverNick(String receiverNick) {
		this.receiverNick = receiverNick;
	}

	public Long getReceiverUid() {
		return this.receiverUid;
	}
	public void setReceiverUid(Long receiverUid) {
		this.receiverUid = receiverUid;
	}

	public Long getRemindFlag() {
		return this.remindFlag;
	}
	public void setRemindFlag(Long remindFlag) {
		this.remindFlag = remindFlag;
	}

	public Date getRemindTime() {
		return this.remindTime;
	}
	public void setRemindTime(Date remindTime) {
		this.remindTime = remindTime;
	}

	public Long getRemindTimeLong() {
		return this.remindTimeLong;
	}
	public void setRemindTimeLong(Long remindTimeLong) {
		this.remindTimeLong = remindTimeLong;
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

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public Long getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(Long subStatus) {
		this.subStatus = subStatus;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
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
