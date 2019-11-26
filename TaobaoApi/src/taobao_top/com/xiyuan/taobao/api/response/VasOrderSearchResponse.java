package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.ArticleBizOrder;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.order.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class VasOrderSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2812896118367861829L;

	/** 
	 * 商品订单对象
	 */
	@ApiListField("article_biz_orders")
	@ApiField("article_biz_order")
	private List<ArticleBizOrder> articleBizOrders;

	/** 
	 * 总记录数
	 */
	@ApiField("total_item")
	private Long totalItem;


	public void setArticleBizOrders(List<ArticleBizOrder> articleBizOrders) {
		this.articleBizOrders = articleBizOrders;
	}
	public List<ArticleBizOrder> getArticleBizOrders( ) {
		return this.articleBizOrders;
	}

	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}
	public Long getTotalItem( ) {
		return this.totalItem;
	}
	


}
