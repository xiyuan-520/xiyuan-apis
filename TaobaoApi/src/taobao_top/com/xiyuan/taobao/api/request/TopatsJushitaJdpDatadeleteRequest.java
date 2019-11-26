package com.xiyuan.taobao.api.request;

import java.util.Date;
import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.TopatsJushitaJdpDatadeleteResponse;

/**
 * TOP API: taobao.topats.jushita.jdp.datadelete request
 * 
 * @author top auto create
 * @since 1.0, 2018.11.13
 */
public class TopatsJushitaJdpDatadeleteRequest extends BaseTaobaoRequest<TopatsJushitaJdpDatadeleteResponse> {
	
	

	/** 
	* 删除数据时间段的结束修改时间，格式为：yyyy-MM-dd HH:mm:ss，结束时间必须为前天的23:59:59秒以前，根据是业务的modified时间
	 */
	private Date endDate;

	/** 
	* 数据库实例名，当删除用户的绑定关系已经不在推送里时，此参数必填
	 */
	private String rdsName;

	/** 
	* 删除数据时间段的起始修改时间，格式为：yyyy-MM-dd HH:mm:ss,根据是业务的modified时间
	 */
	private Date startDate;

	/** 
	* 推送的数据类型，可选值为：tb_trade(淘宝交易)，tb_item(淘宝商品)，tb_refund(淘宝退款)，fx_trade(分销订单)，同时删除多种类型以分号分隔，如："tb_trade;tb_item;tb_refund;fx_trade"
	 */
	private String syncTypes;

	/** 
	* 用户昵称，必填
	 */
	private String userNick;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setRdsName(String rdsName) {
		this.rdsName = rdsName;
	}

	public String getRdsName() {
		return this.rdsName;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setSyncTypes(String syncTypes) {
		this.syncTypes = syncTypes;
	}

	public String getSyncTypes() {
		return this.syncTypes;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.topats.jushita.jdp.datadelete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("rds_name", this.rdsName);
		txtParams.put("start_date", this.startDate);
		txtParams.put("sync_types", this.syncTypes);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopatsJushitaJdpDatadeleteResponse> getResponseClass() {
		return TopatsJushitaJdpDatadeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
		RequestCheckUtils.checkNotEmpty(syncTypes, "syncTypes");
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
	}
	

}