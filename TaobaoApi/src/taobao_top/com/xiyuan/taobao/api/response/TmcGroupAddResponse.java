package com.xiyuan.taobao.api.response;

import java.util.Date;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.group.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcGroupAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5784388949461634946L;

	/** 
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/** 
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;


	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated( ) {
		return this.created;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}
	


}
