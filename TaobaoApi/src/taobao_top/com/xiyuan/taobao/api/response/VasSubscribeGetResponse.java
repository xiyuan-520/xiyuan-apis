package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.ArticleUserSubscribe;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.subscribe.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class VasSubscribeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4375457266485279227L;

	/** 
	 * 用户订购信息
	 */
	@ApiListField("article_user_subscribes")
	@ApiField("article_user_subscribe")
	private List<ArticleUserSubscribe> articleUserSubscribes;


	public void setArticleUserSubscribes(List<ArticleUserSubscribe> articleUserSubscribes) {
		this.articleUserSubscribes = articleUserSubscribes;
	}
	public List<ArticleUserSubscribe> getArticleUserSubscribes( ) {
		return this.articleUserSubscribes;
	}
	


}
