package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Department;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.subuser.departments.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SubuserDepartmentsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1313612897557997497L;

	/** 
	 * 部门信息
	 */
	@ApiListField("departments")
	@ApiField("department")
	private List<Department> departments;


	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public List<Department> getDepartments( ) {
		return this.departments;
	}
	


}
