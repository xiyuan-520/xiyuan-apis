package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.domain.TmcProduceResult;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.messages.produce response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessagesProduceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3331163666138799174L;

	/** 
	 * 是否全部成功
	 */
	@ApiField("is_all_success")
	private Boolean isAllSuccess;

	/** 
	 * 发送结果，与发送时的参数顺序一致。如果is_all_success为true时，不用校验result是否成功
	 */
	@ApiListField("results")
	@ApiField("tmc_produce_result")
	private List<TmcProduceResult> results;


	public void setIsAllSuccess(Boolean isAllSuccess) {
		this.isAllSuccess = isAllSuccess;
	}
	public Boolean getIsAllSuccess( ) {
		return this.isAllSuccess;
	}

	public void setResults(List<TmcProduceResult> results) {
		this.results = results;
	}
	public List<TmcProduceResult> getResults( ) {
		return this.results;
	}
	


}
