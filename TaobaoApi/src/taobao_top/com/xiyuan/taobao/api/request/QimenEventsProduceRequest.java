package com.xiyuan.taobao.api.request;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import com.xiyuan.taobao.api.TaobaoObject;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.QimenEventsProduceResponse;

/**
 * TOP API: taobao.qimen.events.produce request
 * 
 * @author top auto create
 * @since 1.0, 2018.10.23
 */
public class QimenEventsProduceRequest extends BaseTaobaoRequest<QimenEventsProduceResponse> {
	
	

	/** 
	* 奇门事件列表, 最多50条
	 */
	private String messages;

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public void setMessages(List<QimenEvent> messages) {
		this.messages = new JSONWriter(false,true).write(messages);
	}

	public String getMessages() {
		return this.messages;
	}

	public String getApiMethodName() {
		return "taobao.qimen.events.produce";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("messages", this.messages);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenEventsProduceResponse> getResponseClass() {
		return QimenEventsProduceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(messages, 50, "messages");
	}
	
	/**
 * 奇门事件对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Event extends TaobaoObject {

	private static final long serialVersionUID = 4132319241419176136L;

	/**
		 * 订单创建时间,数字
		 */
		@ApiField("create")
		private Long create;
		/**
		 * 扩展属性
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 外部商家名称。必须同时填写platform
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 商家平台编码.MAIN:官方渠道,JD:京东,DD:当当,PP:拍拍,YX:易讯,EBAY:ebay,AMAZON:亚马逊,SN:苏宁,GM:国美,WPH:唯品会,JM:聚美,MGJ:蘑菇街,YT:银泰,YHD:1号店,1688:1688,POS:POS门店,OTHER:其他
		 */
		@ApiField("platform")
		private String platform;
		/**
		 * 事件状态，如QIMEN_ERP_TRANSFER，QIMEN_ERP_CHECK
		 */
		@ApiField("status")
		private String status;
		/**
		 * 淘宝订单号
		 */
		@ApiField("tid")
		private String tid;
	

	public Long getCreate() {
			return this.create;
		}
		public void setCreate(Long create) {
			this.create = create;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getPlatform() {
			return this.platform;
		}
		public void setPlatform(String platform) {
			this.platform = platform;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTid() {
			return this.tid;
		}
		public void setTid(String tid) {
			this.tid = tid;
		}

}

	/**
 * 奇门事件列表, 最多50条
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class QimenEvent extends TaobaoObject {

	private static final long serialVersionUID = 8639778798451494836L;

	/**
		 * 奇门事件对象
		 */
		@ApiField("event")
		private Event event;
	

	public Event getEvent() {
			return this.event;
		}
		public void setEvent(Event event) {
			this.event = event;
		}

}


}