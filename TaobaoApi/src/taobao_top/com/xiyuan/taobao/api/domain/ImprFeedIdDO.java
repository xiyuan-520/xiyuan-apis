package com.xiyuan.taobao.api.domain;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;


/**
 * 单条交易子订单语义标签对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ImprFeedIdDO extends TaobaoObject {

	private static final long serialVersionUID = 6384797425816244247L;

	/**
	 * 存放主评和追评的评价标签信息
biz_type(1:主评 2:追评)
	 */
	@ApiListField("feed_info_list")
	@ApiField("impr_feed_info_d_o")
	private List<ImprFeedInfoDO> feedInfoList;

	/**
	 * 被评价者昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 评价结果（1好评 0中评 -1差评）
	 */
	@ApiField("rate")
	private Long rate;


	public List<ImprFeedInfoDO> getFeedInfoList() {
		return this.feedInfoList;
	}
	public void setFeedInfoList(List<ImprFeedInfoDO> feedInfoList) {
		this.feedInfoList = feedInfoList;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getRate() {
		return this.rate;
	}
	public void setRate(Long rate) {
		this.rate = rate;
	}

}
