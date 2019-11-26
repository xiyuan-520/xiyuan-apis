package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.nbadd.appointdeliver.getconsigninfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoNbaddAppointdeliverGetconsigninfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6777926215129843544L;

	/** 
	 * 调用是否成功，正常情况下都会成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 发货信息
	 */
	@ApiField("result")
	private ConsignSupportInfoDTO result;

	/** 
	 * 错误编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 错误描述
	 */
	@ApiField("result_desc")
	private String resultDesc;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setResult(ConsignSupportInfoDTO result) {
		this.result = result;
	}
	public ConsignSupportInfoDTO getResult( ) {
		return this.result;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}
	
	/**
 * 发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ConsignSupportInfoDTO extends TaobaoObject {

	private static final long serialVersionUID = 2523435417534455995L;

	/**
		 * 支持CP的code列表
		 */
		@ApiListField("support_cp_list")
		@ApiField("string")
		private List<String> supportCpList;
	

	public List<String> getSupportCpList() {
			return this.supportCpList;
		}
		public void setSupportCpList(List<String> supportCpList) {
			this.supportCpList = supportCpList;
		}

}



}
