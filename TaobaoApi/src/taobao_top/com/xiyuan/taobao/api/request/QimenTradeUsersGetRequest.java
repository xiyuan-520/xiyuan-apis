package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.QimenTradeUsersGetResponse;

/**
 * TOP API: taobao.qimen.trade.users.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class QimenTradeUsersGetRequest extends BaseTaobaoRequest<QimenTradeUsersGetResponse> {
	
	

	/** 
	* 每页的数量
	 */
	private Long pageIndex;

	/** 
	* 页数
	 */
	private Long pageSize;

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "taobao.qimen.trade.users.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page_index", this.pageIndex);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<QimenTradeUsersGetResponse> getResponseClass() {
		return QimenTradeUsersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pageIndex, "pageIndex");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}