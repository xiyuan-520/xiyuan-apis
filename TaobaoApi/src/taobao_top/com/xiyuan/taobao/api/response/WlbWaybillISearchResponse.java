package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.WaybillApplySubscriptionInfo;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillISearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5417485875299336428L;

	/** 
	 * 订购关系
	 */
	@ApiListField("subscribtions")
	@ApiField("waybill_apply_subscription_info")
	private List<WaybillApplySubscriptionInfo> subscribtions;


	public void setSubscribtions(List<WaybillApplySubscriptionInfo> subscribtions) {
		this.subscribtions = subscribtions;
	}
	public List<WaybillApplySubscriptionInfo> getSubscribtions( ) {
		return this.subscribtions;
	}
	


}
