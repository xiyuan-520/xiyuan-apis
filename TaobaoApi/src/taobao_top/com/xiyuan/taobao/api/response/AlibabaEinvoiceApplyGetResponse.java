package com.xiyuan.taobao.api.response;

import java.util.List;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;

import com.xiyuan.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.einvoice.apply.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaEinvoiceApplyGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2355782543292776295L;

	/** 
	 * 开票明细
	 */
	@ApiListField("apply_list")
	@ApiField("apply")
	private List<Apply> applyList;

	/** 
	 * success
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setApplyList(List<Apply> applyList) {
		this.applyList = applyList;
	}
	public List<Apply> getApplyList( ) {
		return this.applyList;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	
	/**
 * 发票明细
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InvoiceItem extends TaobaoObject {

	private static final long serialVersionUID = 4298391672277892667L;

	/**
		 * 价税合计。(等于sumPrice和tax之和)
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 淘宝子订单号
		 */
		@ApiField("biz_order_id")
		private String bizOrderId;
		/**
		 * 是否运费行标识，true:运费行，false:非运费行
		 */
		@ApiField("is_post_fee_row")
		private Boolean isPostFeeRow;
		/**
		 * 发票项目名称（或商品名称）
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 单价，格式：100.00(不含税)
		 */
		@ApiField("price")
		private String price;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
		 */
		@ApiField("row_type")
		private String rowType;
		/**
		 * 规格型号,可选
		 */
		@ApiField("specification")
		private String specification;
		/**
		 * 总价，格式：100.00(不含税)
		 */
		@ApiField("sum_price")
		private String sumPrice;
		/**
		 * 税额
		 */
		@ApiField("tax")
		private String tax;
		/**
		 * 税率。税率只能为0或0.03或0.04或0.06或0.11或0.13或0.17
		 */
		@ApiField("tax_rate")
		private String taxRate;
		/**
		 * 单位
		 */
		@ApiField("unit")
		private String unit;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getBizOrderId() {
			return this.bizOrderId;
		}
		public void setBizOrderId(String bizOrderId) {
			this.bizOrderId = bizOrderId;
		}
		public Boolean getIsPostFeeRow() {
			return this.isPostFeeRow;
		}
		public void setIsPostFeeRow(Boolean isPostFeeRow) {
			this.isPostFeeRow = isPostFeeRow;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getRowType() {
			return this.rowType;
		}
		public void setRowType(String rowType) {
			this.rowType = rowType;
		}
		public String getSpecification() {
			return this.specification;
		}
		public void setSpecification(String specification) {
			this.specification = specification;
		}
		public String getSumPrice() {
			return this.sumPrice;
		}
		public void setSumPrice(String sumPrice) {
			this.sumPrice = sumPrice;
		}
		public String getTax() {
			return this.tax;
		}
		public void setTax(String tax) {
			this.tax = tax;
		}
		public String getTaxRate() {
			return this.taxRate;
		}
		public void setTaxRate(String taxRate) {
			this.taxRate = taxRate;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}

}

	/**
 * 开票明细
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Apply extends TaobaoObject {

	private static final long serialVersionUID = 5624584759347456288L;

	/**
		 * 抬头类型，0=个人，1=企业
		 */
		@ApiField("business_type")
		private Long businessType;
		/**
		 * 扩展属性
		 */
		@ApiField("extend_props")
		private String extendProps;
		/**
		 * 发票申请修改时间
		 */
		@ApiField("gmt_modified_str")
		private String gmtModifiedStr;
		/**
		 * 开票金额
		 */
		@ApiField("invoice_amount")
		private String invoiceAmount;
		/**
		 * 发票明细
		 */
		@ApiListField("invoice_items")
		@ApiField("invoice_item")
		private List<InvoiceItem> invoiceItems;
		/**
		 * 发票种类，0=电子发票，1=纸质发票，2=专票，现在默认是0
		 */
		@ApiField("invoice_kind")
		private Long invoiceKind;
		/**
		 * 发票(开票)类型，蓝票blue,红票red，默认blue
		 */
		@ApiField("invoice_type")
		private String invoiceType;
		/**
		 * 买家备注
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 购买方地址
		 */
		@ApiField("payer_address")
		private String payerAddress;
		/**
		 * 购买方开户银行
		 */
		@ApiField("payer_bank")
		private String payerBank;
		/**
		 * 购买方开户行账号
		 */
		@ApiField("payer_bankaccount")
		private String payerBankaccount;
		/**
		 * 买家抬头
		 */
		@ApiField("payer_name")
		private String payerName;
		/**
		 * 购买方联系电话
		 */
		@ApiField("payer_phone")
		private String payerPhone;
		/**
		 * 买家税号
		 */
		@ApiField("payer_register_no")
		private String payerRegisterNo;
		/**
		 * 电商平台代码,TB,TM,ALIPAY,JD
		 */
		@ApiField("platform_code")
		private String platformCode;
		/**
		 * 电商平台对应的订单号
		 */
		@ApiField("platform_tid")
		private String platformTid;
		/**
		 * 开票申请状态，0=已拒绝，1=申请中，2=已同意
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 不含税总金额
		 */
		@ApiField("sum_price")
		private String sumPrice;
		/**
		 * 总税额
		 */
		@ApiField("sum_tax")
		private String sumTax;
		/**
		 * 开票申请的触发类型，buyer_payed=卖家已付款，sent_goods=卖家已发货，buyer_confirm=买家确认收货，refund_seller_confirm=卖家同意退款，invoice_supply=买家申请补开发票，invoice_change=买家申请改抬头，change_paper=电换纸
		 */
		@ApiField("trigger_status")
		private String triggerStatus;
	

	public Long getBusinessType() {
			return this.businessType;
		}
		public void setBusinessType(Long businessType) {
			this.businessType = businessType;
		}
		public String getExtendProps() {
			return this.extendProps;
		}
		public void setExtendProps(String extendProps) {
			this.extendProps = extendProps;
		}
		public String getGmtModifiedStr() {
			return this.gmtModifiedStr;
		}
		public void setGmtModifiedStr(String gmtModifiedStr) {
			this.gmtModifiedStr = gmtModifiedStr;
		}
		public String getInvoiceAmount() {
			return this.invoiceAmount;
		}
		public void setInvoiceAmount(String invoiceAmount) {
			this.invoiceAmount = invoiceAmount;
		}
		public List<InvoiceItem> getInvoiceItems() {
			return this.invoiceItems;
		}
		public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
			this.invoiceItems = invoiceItems;
		}
		public Long getInvoiceKind() {
			return this.invoiceKind;
		}
		public void setInvoiceKind(Long invoiceKind) {
			this.invoiceKind = invoiceKind;
		}
		public String getInvoiceType() {
			return this.invoiceType;
		}
		public void setInvoiceType(String invoiceType) {
			this.invoiceType = invoiceType;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getPayerAddress() {
			return this.payerAddress;
		}
		public void setPayerAddress(String payerAddress) {
			this.payerAddress = payerAddress;
		}
		public String getPayerBank() {
			return this.payerBank;
		}
		public void setPayerBank(String payerBank) {
			this.payerBank = payerBank;
		}
		public String getPayerBankaccount() {
			return this.payerBankaccount;
		}
		public void setPayerBankaccount(String payerBankaccount) {
			this.payerBankaccount = payerBankaccount;
		}
		public String getPayerName() {
			return this.payerName;
		}
		public void setPayerName(String payerName) {
			this.payerName = payerName;
		}
		public String getPayerPhone() {
			return this.payerPhone;
		}
		public void setPayerPhone(String payerPhone) {
			this.payerPhone = payerPhone;
		}
		public String getPayerRegisterNo() {
			return this.payerRegisterNo;
		}
		public void setPayerRegisterNo(String payerRegisterNo) {
			this.payerRegisterNo = payerRegisterNo;
		}
		public String getPlatformCode() {
			return this.platformCode;
		}
		public void setPlatformCode(String platformCode) {
			this.platformCode = platformCode;
		}
		public String getPlatformTid() {
			return this.platformTid;
		}
		public void setPlatformTid(String platformTid) {
			this.platformTid = platformTid;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getSumPrice() {
			return this.sumPrice;
		}
		public void setSumPrice(String sumPrice) {
			this.sumPrice = sumPrice;
		}
		public String getSumTax() {
			return this.sumTax;
		}
		public void setSumTax(String sumTax) {
			this.sumTax = sumTax;
		}
		public String getTriggerStatus() {
			return this.triggerStatus;
		}
		public void setTriggerStatus(String triggerStatus) {
			this.triggerStatus = triggerStatus;
		}

}



}
