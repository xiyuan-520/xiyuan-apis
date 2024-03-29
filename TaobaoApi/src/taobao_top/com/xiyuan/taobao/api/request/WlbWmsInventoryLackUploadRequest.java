package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.domain.WlbWmsInventoryLackUpload;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.WlbWmsInventoryLackUploadResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.lack.upload request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WlbWmsInventoryLackUploadRequest extends BaseTaobaoRequest<WlbWmsInventoryLackUploadResponse> {
	
	

	/** 
	* 缺货通知信息
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(WlbWmsInventoryLackUpload content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.inventory.lack.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsInventoryLackUploadResponse> getResponseClass() {
		return WlbWmsInventoryLackUploadResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}