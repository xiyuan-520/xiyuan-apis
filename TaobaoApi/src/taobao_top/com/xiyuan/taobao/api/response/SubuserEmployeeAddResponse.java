package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.subuser.employee.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SubuserEmployeeAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6555355179121829145L;

	/** 
	 * 操作是否成功 true:操作成功; false:操作失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
