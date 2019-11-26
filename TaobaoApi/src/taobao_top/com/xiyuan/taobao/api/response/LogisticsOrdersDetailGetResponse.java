package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.Shipping;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.orders.detail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOrdersDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4799362871753619787L;

	/** 
	 * 获取的物流订单详情列表.返回的Shipping包含的具体信息为入参fields请求的字段信息.
	 */
	@ApiListField("shippings")
	@ApiField("shipping")
	private List<Shipping> shippings;

	/** 
	 * 搜索到的物流订单列表总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setShippings(List<Shipping> shippings) {
		this.shippings = shippings;
	}
	public List<Shipping> getShippings( ) {
		return this.shippings;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
