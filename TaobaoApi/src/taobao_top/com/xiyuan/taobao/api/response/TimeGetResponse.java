package com.xiyuan.taobao.api.response;

import java.util.Date;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.time.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TimeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8414914142698794285L;

	/** 
	 * 淘宝系统当前时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time")
	private Date time;


	public void setTime(Date time) {
		this.time = time;
	}
	public Date getTime( ) {
		return this.time;
	}
	


}
