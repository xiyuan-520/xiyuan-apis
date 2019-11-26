package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.TmallRateTagDetail;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.traderate.itemtags.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallTraderateItemtagsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7197643158539529925L;

	/** 
	 * 标签列表
	 */
	@ApiListField("tags")
	@ApiField("tmall_rate_tag_detail")
	private List<TmallRateTagDetail> tags;


	public void setTags(List<TmallRateTagDetail> tags) {
		this.tags = tags;
	}
	public List<TmallRateTagDetail> getTags( ) {
		return this.tags;
	}
	


}
