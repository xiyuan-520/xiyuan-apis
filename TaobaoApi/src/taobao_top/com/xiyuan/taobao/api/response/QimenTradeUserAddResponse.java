package com.xiyuan.taobao.api.response;

import java.util.Date;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.qimen.trade.user.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class QimenTradeUserAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5689311366266595533L;

	/** 
	 * appkey
	 */
	@ApiField("appkey")
	private String appkey;

	/** 
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 卖家备注
	 */
	@ApiField("memo")
	private String memo;


	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}
	public String getAppkey( ) {
		return this.appkey;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}
	


}
