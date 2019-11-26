package com.xiyuan.taobao.api.response;

import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.KfcSearchResult;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.kfc.keyword.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class KfcKeywordSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7434511271218954333L;

	/** 
	 * KFC 关键词过滤匹配结果
	 */
	@ApiField("kfc_search_result")
	private KfcSearchResult kfcSearchResult;


	public void setKfcSearchResult(KfcSearchResult kfcSearchResult) {
		this.kfcSearchResult = kfcSearchResult;
	}
	public KfcSearchResult getKfcSearchResult( ) {
		return this.kfcSearchResult;
	}
	


}
