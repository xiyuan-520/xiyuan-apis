package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QimenEventProduceResponse;

/**
 * TOP API: taobao.qimen.event.produce request
 * 
 * @author top auto create
 * @since 1.0, 2018.10.23
 */
public class QimenEventProduceRequest extends BaseTaobaoRequest<QimenEventProduceResponse> {
	
	

	/** 
	* 订单创建时间,数字
	 */
	private Long create;

	/** 
	* JSON格式扩展字段
	 */
	private String ext;

	/** 
	* 外部商家名称。必须同时填写platform
	 */
	private String nick;

	/** 
	* 商家平台编码.MAIN:官方渠道,JD:京东,DD:当当,PP:拍拍,YX:易讯,EBAY:ebay,AMAZON:亚马逊,SN:苏宁,GM:国美,WPH:唯品会,JM:聚美,MGJ:蘑菇街,YT:银泰,YHD:1号店,1688:1688,POS:POS门店,OTHER:其他
	 */
	private String platform;

	/** 
	* 事件状态，如QIMEN_ERP_TRANSFER，QIMEN_ERP_CHECK
	 */
	private String status;

	/** 
	* 淘宝订单号
	 */
	private String tid;

	public void setCreate(Long create) {
		this.create = create;
	}

	public Long getCreate() {
		return this.create;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return this.ext;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.qimen.event.produce";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("create", this.create);
		txtParams.put("ext", this.ext);
		txtParams.put("nick", this.nick);
		txtParams.put("platform", this.platform);
		txtParams.put("status", this.status);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenEventProduceResponse> getResponseClass() {
		return QimenEventProduceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}