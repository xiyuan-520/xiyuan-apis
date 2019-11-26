package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.StoreInfo;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.stores.baseinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbStoresBaseinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1469514899591968785L;

	/** 
	 * 仓库列表
	 */
	@ApiListField("store_info_list")
	@ApiField("store_info")
	private List<StoreInfo> storeInfoList;

	/** 
	 * 返回的总数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setStoreInfoList(List<StoreInfo> storeInfoList) {
		this.storeInfoList = storeInfoList;
	}
	public List<StoreInfo> getStoreInfoList( ) {
		return this.storeInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}
