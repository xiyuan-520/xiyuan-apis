package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.domain.LogisticsPartner;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.partners.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsPartnersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7729191896445924939L;

	/** 
	 * 查询揽送范围之内的物流公司信息
	 */
	@ApiListField("logistics_partners")
	@ApiField("logistics_partner")
	private List<LogisticsPartner> logisticsPartners;


	public void setLogisticsPartners(List<LogisticsPartner> logisticsPartners) {
		this.logisticsPartners = logisticsPartners;
	}
	public List<LogisticsPartner> getLogisticsPartners( ) {
		return this.logisticsPartners;
	}
	


}
