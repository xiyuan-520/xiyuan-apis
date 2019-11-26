package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.ShopGetbytitleResponse;

/**
 * TOP API: taobao.shop.getbytitle request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class ShopGetbytitleRequest extends BaseTaobaoRequest<ShopGetbytitleResponse> {
	
	

	/** 
	* 代表需要获取的店铺信息：sid,cid,title,nick,desc,bulletin,pic_path,created,modified,shop_score
	 */
	private String fields;

	/** 
	* 店铺名称，必须严格匹配（不支持模糊查询）
	 */
	private String title;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "taobao.shop.getbytitle";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ShopGetbytitleResponse> getResponseClass() {
		return ShopGetbytitleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(title, "title");
	}
	

}