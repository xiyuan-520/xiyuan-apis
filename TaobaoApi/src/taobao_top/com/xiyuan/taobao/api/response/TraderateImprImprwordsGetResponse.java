package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderate.impr.imprwords.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderateImprImprwordsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6651724679414289163L;

	/** 
	 * 返回类目下所有大家印象的标签
	 */
	@ApiListField("impr_words")
	@ApiField("string")
	private List<String> imprWords;


	public void setImprWords(List<String> imprWords) {
		this.imprWords = imprWords;
	}
	public List<String> getImprWords( ) {
		return this.imprWords;
	}
	


}
