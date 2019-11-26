package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;
import com.xiyuan.taobao.api.domain.LogisticsCompany;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.companies.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsCompaniesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1512686884613921256L;

	/** 
	 * 物流公司信息。返回的LogisticCompany包含的具体信息为入参fields请求的字段信息。
	 */
	@ApiListField("logistics_companies")
	@ApiField("logistics_company")
	private List<LogisticsCompany> logisticsCompanies;


	public void setLogisticsCompanies(List<LogisticsCompany> logisticsCompanies) {
		this.logisticsCompanies = logisticsCompanies;
	}
	public List<LogisticsCompany> getLogisticsCompanies( ) {
		return this.logisticsCompanies;
	}
	


}
