package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;
import com.xiyuan.taobao.api.domain.InvoiceResult;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.create.result.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceCreateResultGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1367229977847417132L;

	/** 
	 * 开票返回结果数据列表
	 */
	@ApiListField("invoice_result_list")
	@ApiField("invoice_result")
	private List<InvoiceResult> invoiceResultList;


	public void setInvoiceResultList(List<InvoiceResult> invoiceResultList) {
		this.invoiceResultList = invoiceResultList;
	}
	public List<InvoiceResult> getInvoiceResultList( ) {
		return this.invoiceResultList;
	}
	


}
