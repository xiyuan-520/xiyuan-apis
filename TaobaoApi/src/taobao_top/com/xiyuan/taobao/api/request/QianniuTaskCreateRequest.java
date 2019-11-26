package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QianniuTaskCreateResponse;

/**
 * TOP API: taobao.qianniu.task.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class QianniuTaskCreateRequest extends BaseTaobaoRequest<QianniuTaskCreateResponse> {
	
	

	/** 
	* 任务元数据，JSON格式，例如：
meta = {
            title : "可自定义",
            content : “任务正文”,
            sender_uid : user_id,
            sender_nick : user_nick,
            reminder_flag : 1,
            finish_strategy : 0,
         biz_type : "memo",
         priority : 0
        };
说明：reminder_flag:1表示需要发送任务提醒消息,0表示不需要消息提醒。建议写1;
finish_strategy : 0表示只要一个人完成任务就可以，1表示所有人都需要完成任务。根据场景设置，建议选0;
biz_type : 任务类型，请咨询千牛官方获取正确的任务类型;
priority : 1表示高优先级，0表示普通;
这里的举例为必填字段，一些选填字段没有列出，如有其它需求请联系千牛官方。
	 */
	private String meta;

	/** 
	* 任务列表，JSON格式的数组，即支持多个接收人，例如：
task = [{
            receiver_uid : user_id,
            receiver_nick : user_nick,
            biz_type : "memo",
            sub_biz_type : "memo",
            biz_id : user_nick,
            biz_nick : user_nick
         }];
上述为必填字段，其它字段请咨询千牛官方。
	 */
	private String tasks;

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getMeta() {
		return this.meta;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public String getTasks() {
		return this.tasks;
	}

	public String getApiMethodName() {
		return "taobao.qianniu.task.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("meta", this.meta);
		txtParams.put("tasks", this.tasks);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QianniuTaskCreateResponse> getResponseClass() {
		return QianniuTaskCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(meta, "meta");
		RequestCheckUtils.checkNotEmpty(tasks, "tasks");
	}
	

}