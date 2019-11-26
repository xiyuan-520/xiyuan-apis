package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.sla.scheme.supervision.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallSlaSchemeSupervisionGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8463289275789926583L;

	/** 
	 * 打标服务数量
	 */
	@ApiField("reach_standard_schemes_quantity")
	private Long reachStandardSchemesQuantity;

	/** 
	 * 不达标的服务数量
	 */
	@ApiField("substandard_schemes_quantity")
	private Long substandardSchemesQuantity;

	/** 
	 * 管控的服务数量
	 */
	@ApiField("supervised_schemes_quantity")
	private Long supervisedSchemesQuantity;


	public void setReachStandardSchemesQuantity(Long reachStandardSchemesQuantity) {
		this.reachStandardSchemesQuantity = reachStandardSchemesQuantity;
	}
	public Long getReachStandardSchemesQuantity( ) {
		return this.reachStandardSchemesQuantity;
	}

	public void setSubstandardSchemesQuantity(Long substandardSchemesQuantity) {
		this.substandardSchemesQuantity = substandardSchemesQuantity;
	}
	public Long getSubstandardSchemesQuantity( ) {
		return this.substandardSchemesQuantity;
	}

	public void setSupervisedSchemesQuantity(Long supervisedSchemesQuantity) {
		this.supervisedSchemesQuantity = supervisedSchemesQuantity;
	}
	public Long getSupervisedSchemesQuantity( ) {
		return this.supervisedSchemesQuantity;
	}
	


}
