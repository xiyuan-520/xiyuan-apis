package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.AlibabaEinvoicePaperPrintResponse;

/**
 * TOP API: alibaba.einvoice.paper.print request
 * 
 * @author top auto create
 * @since 1.0, 2018.10.08
 */
public class AlibabaEinvoicePaperPrintRequest extends BaseTaobaoRequest<AlibabaEinvoicePaperPrintResponse> {
	
	

	/** 
	* 打印框设置，0=不弹打印设置框，1=弹出打印设置框
	 */
	private Long dialogSettingFlag;

	/** 
	* 是否强制打印，一般发票只能打印一次，但是因为打印机发票号码与待打印发票号码不一致，导致打印错误，需要重新打印
	 */
	private Boolean forcePrint;

	/** 
	* 销售方纳税人识别号
	 */
	private String payeeRegisterNo;

	/** 
	* 打印标记，0=打印发票；1=打印清单。发票明细超过8行时会生成清单页，需要打印清单。
	 */
	private Long printFlag;

	/** 
	* 开票流水号
	 */
	private String serialNo;

	public void setDialogSettingFlag(Long dialogSettingFlag) {
		this.dialogSettingFlag = dialogSettingFlag;
	}

	public Long getDialogSettingFlag() {
		return this.dialogSettingFlag;
	}

	public void setForcePrint(Boolean forcePrint) {
		this.forcePrint = forcePrint;
	}

	public Boolean getForcePrint() {
		return this.forcePrint;
	}

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}

	public void setPrintFlag(Long printFlag) {
		this.printFlag = printFlag;
	}

	public Long getPrintFlag() {
		return this.printFlag;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public String getApiMethodName() {
		return "alibaba.einvoice.paper.print";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dialog_setting_flag", this.dialogSettingFlag);
		txtParams.put("force_print", this.forcePrint);
		txtParams.put("payee_register_no", this.payeeRegisterNo);
		txtParams.put("print_flag", this.printFlag);
		txtParams.put("serial_no", this.serialNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoicePaperPrintResponse> getResponseClass() {
		return AlibabaEinvoicePaperPrintResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dialogSettingFlag, "dialogSettingFlag");
		RequestCheckUtils.checkNotEmpty(forcePrint, "forcePrint");
		RequestCheckUtils.checkNotEmpty(payeeRegisterNo, "payeeRegisterNo");
		RequestCheckUtils.checkNotEmpty(printFlag, "printFlag");
		RequestCheckUtils.checkNotEmpty(serialNo, "serialNo");
	}
	

}