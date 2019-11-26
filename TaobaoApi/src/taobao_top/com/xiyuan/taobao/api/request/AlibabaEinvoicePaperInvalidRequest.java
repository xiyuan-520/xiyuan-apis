package com.xiyuan.taobao.api.request;

import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.AlibabaEinvoicePaperInvalidResponse;

/**
 * TOP API: alibaba.einvoice.paper.invalid request
 * 
 * @author top auto create
 * @since 1.0, 2018.10.23
 */
public class AlibabaEinvoicePaperInvalidRequest extends BaseTaobaoRequest<AlibabaEinvoicePaperInvalidResponse> {
	
	

	/** 
	* 作废操作人
	 */
	private String invalidOperator;

	/** 
	* 作废类型, 0=空白发票(有残缺 的纸张发票，不能做为有效报销)作废, 1=已开发票作废
	 */
	private Long invalidType;

	/** 
	* 发票代码，空白作废时必填
	 */
	private String invoiceCode;

	/** 
	* 发票号码，空白作废时必填
	 */
	private String invoiceNo;

	/** 
	* 销售方纳税人识别号
	 */
	private String payeeRegisterNo;

	/** 
	* 开票流水号
	 */
	private String serialNo;

	public void setInvalidOperator(String invalidOperator) {
		this.invalidOperator = invalidOperator;
	}

	public String getInvalidOperator() {
		return this.invalidOperator;
	}

	public void setInvalidType(Long invalidType) {
		this.invalidType = invalidType;
	}

	public Long getInvalidType() {
		return this.invalidType;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public String getApiMethodName() {
		return "alibaba.einvoice.paper.invalid";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("invalid_operator", this.invalidOperator);
		txtParams.put("invalid_type", this.invalidType);
		txtParams.put("invoice_code", this.invoiceCode);
		txtParams.put("invoice_no", this.invoiceNo);
		txtParams.put("payee_register_no", this.payeeRegisterNo);
		txtParams.put("serial_no", this.serialNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaEinvoicePaperInvalidResponse> getResponseClass() {
		return AlibabaEinvoicePaperInvalidResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(invalidOperator, "invalidOperator");
		RequestCheckUtils.checkNotEmpty(invalidType, "invalidType");
		RequestCheckUtils.checkNotEmpty(payeeRegisterNo, "payeeRegisterNo");
		RequestCheckUtils.checkNotEmpty(serialNo, "serialNo");
	}
	

}