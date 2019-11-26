package com.xiyuan.taobao.api.domain;

import java.util.Date;

import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiField;

/**
 * 订单结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Order extends TaobaoObject
{
    
    private static final long serialVersionUID = 8419733683686659537L;
    
    /**
     * 手工调整金额.格式为:1.01;单位:元;精确到小数点后两位.
     */
    @ApiField("adjust_fee")
    private String adjustFee;
    
    /**
     * assemblyItem
     */
    @ApiField("assembly_item")
    private String assemblyItem;
    
    /**
     * 价格
     */
    @ApiField("assembly_price")
    private String assemblyPrice;
    
    /**
     * 主商品订单id
     */
    @ApiField("assembly_rela")
    private String assemblyRela;
    
    /**
     * 捆绑的子订单号，表示该子订单要和捆绑的子订单一起发货，用于卖家子订单捆绑发货
     */
    @ApiField("bind_oid")
    private Long bindOid;
    
    /**
     * bind_oid字段的升级，支持返回绑定的多个子订单，多个子订单以半角逗号分隔
     */
    @ApiField("bind_oids")
    private String bindOids;
    
    /**
     * bind_oids字段的升级，在交易成功和交易关闭状态下也能获取到，支持返回绑定的多个子订单，多个子订单以半角逗号分隔
     */
    @ApiField("bind_oids_all_status")
    private String bindOidsAllStatus;
    
    /**
     * 为tmall.daogoubao.cloudstore时表示云店链路
     */
    @ApiField("biz_code")
    private String bizCode;
    
    /**
     * 买家昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;
    
    /**
     * 买家是否已评价。可选值：true(已评价)，false(未评价)
     */
    @ApiField("buyer_rate")
    private Boolean buyerRate;
    
    /**
     * calPenalty
     */
    @ApiField("cal_penalty")
    private String calPenalty;
    
    /**
     * carStoreCode
     */
    @ApiField("car_store_code")
    private String carStoreCode;
    
    /**
     * carStoreName
     */
    @ApiField("car_store_name")
    private String carStoreName;
    
    /**
     * carTaker
     */
    @ApiField("car_taker")
    private String carTaker;
    
    /**
     * carTakerID
     */
    @ApiField("car_taker_id")
    private String carTakerId;
    
    /**
     * carTakerIDNum
     */
    @ApiField("car_taker_id_num")
    private String carTakerIdNum;
    
    /**
     * carTakerPhone
     */
    @ApiField("car_taker_phone")
    private String carTakerPhone;
    
    /**
     * 交易商品对应的类目ID
     */
    @ApiField("cid")
    private Long cid;
    
    /**
     * clCarTaker
     */
    @ApiField("cl_car_taker")
    private String clCarTaker;
    
    /**
     * clCarTakerIDNum
     */
    @ApiField("cl_car_taker_i_d_num")
    private String clCarTakerIDNum;
    
    /**
     * clCarTakerIDNum
     */
    @ApiField("cl_car_taker_id_num")
    private String clCarTakerIdNum;
    
    /**
     * clCarTakerPhone
     */
    @ApiField("cl_car_taker_phone")
    private String clCarTakerPhone;
    
    /**
     * clDownPayment
     */
    @ApiField("cl_down_payment")
    private String clDownPayment;
    
    /**
     * clDownPaymentRatio
     */
    @ApiField("cl_down_payment_ratio")
    private String clDownPaymentRatio;
    
    /**
     * clInstallmentNum
     */
    @ApiField("cl_installment_num")
    private String clInstallmentNum;
    
    /**
     * clMonthPayment
     */
    @ApiField("cl_month_payment")
    private String clMonthPayment;
    
    /**
     * clServiceFee
     */
    @ApiField("cl_service_fee")
    private String clServiceFee;
    
    /**
     * clTailPayment
     */
    @ApiField("cl_tail_payment")
    private String clTailPayment;
    
    /**
     * 为1，且bizCode不为tmall.daogoubao.cloudstore时，为旗舰店订单
     */
    @ApiField("cloud_store")
    private String cloudStore;
    
    /**
     * 云店pos单号
     */
    @ApiField("cloud_store_bind_pos")
    private String cloudStoreBindPos;
    
    /**
     * 云店改价用token
     */
    @ApiField("cloud_store_token")
    private String cloudStoreToken;
    
    /**
     * 天猫搭配宝
     */
    @ApiField("combo_id")
    private String comboId;
    
    /**
     * 子订单发货时间，当卖家对订单进行了多次发货，子订单的发货时间和主订单的发货时间可能不一样了，那么就需要以子订单的时间为准。（没有进行多次发货的订单，主订单的发货时间和子订单的发货时间都一样）
     */
    @ApiField("consign_time")
    private String consignTime;
    
    /**
     * 定制信息
     */
    @ApiField("customization")
    private String customization;
    
    /**
     * 子订单级订单优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiField("discount_fee")
    private String discountFee;
    
    /**
     * 分摊之后的实付金额
     */
    @ApiField("divide_order_fee")
    private String divideOrderFee;
    
    /**
     * downPayment
     */
    @ApiField("down_payment")
    private String downPayment;
    
    /**
     * downPaymentRatio
     */
    @ApiField("down_payment_ratio")
    private String downPaymentRatio;
    
    /**
     * 子订单的交易结束时间说明：子订单有单独的结束时间，与主订单的结束时间可能有所不同，在有退款发起的时候或者是主订单分阶段付款的时候，子订单的结束时间会早于主订单的结束时间，所以开放这个字段便于订单结束状态的判断
     */
    @ApiField("end_time")
    private Date endTime;
    
    /**
     * 子订单预计发货时间
     */
    @ApiField("estimate_con_time")
    private String estimateConTime;
    
    /**
     * 车牌号码
     */
    @ApiField("et_plate_number")
    private String etPlateNumber;
    
    /**
     * 天猫汽车服务预约时间
     */
    @ApiField("et_ser_time")
    private String etSerTime;
    
    /**
     * 电子凭证预约门店地址
     */
    @ApiField("et_shop_name")
    private String etShopName;
    
    /**
     * 电子凭证核销门店地址
     */
    @ApiField("et_verified_shop_name")
    private String etVerifiedShopName;
    
    /**
     * 订单履行状态，如喵鲜生极速达：分单完成
     */
    @ApiField("f_status")
    private String fStatus;
    
    /**
     * 单履行内容，如喵鲜生极速达：storeId,phone
     */
    @ApiField("f_term")
    private String fTerm;
    
    /**
     * 订单履行类型，如喵鲜生极速达（jsd）
     */
    @ApiField("f_type")
    private String fType;
    
    /**
     * 花呗分期期数
     */
    @ApiField("fqg_num")
    private Long fqgNum;
    
    /**
     * 云店是否扣拥
     */
    @ApiField("hj_settle_no_commission")
    private String hjSettleNoCommission;
    
    /**
     * 商品的字符串编号(注意：iid近期即将废弃，请用num_iid参数)
     */
    @ApiField("iid")
    private String iid;
    
    /**
     * installmentNum
     */
    @ApiField("installment_num")
    private String installmentNum;
    
    /**
     * 库存类型：6为在途
     */
    @ApiField("inv_type")
    private String invType;
    
    /**
     * 子订单所在包裹的运单号
     */
    @ApiField("invoice_no")
    private String invoiceNo;
    
    /**
     * 表示订单交易是否含有对应的代销采购单。如果该订单中存在一个对应的代销采购单，那么该值为true；反之，该值为false。
     */
    @ApiField("is_daixiao")
    private Boolean isDaixiao;
    
    /**
     * 是否商家承担手续费
     */
    @ApiField("is_fqg_s_fee")
    private Boolean isFqgSFee;
    
    /**
     * 是否超卖
     */
    @ApiField("is_oversold")
    private Boolean isOversold;
    
    /**
     * 是否是服务订单，是返回true，否返回false。
     */
    @ApiField("is_service_order")
    private Boolean isServiceOrder;
    
    /**
     * 是否发货
     */
    @ApiField("is_sh_ship")
    private Boolean isShShip;
    
    /**
     * 子订单是否是www订单
     */
    @ApiField("is_www")
    private Boolean isWww;
    
    /**
     * 套餐ID
     */
    @ApiField("item_meal_id")
    private Long itemMealId;
    
    /**
     * 套餐的值。如：M8原装电池:便携支架:M8专用座充:莫凡保护袋
     */
    @ApiField("item_meal_name")
    private String itemMealName;
    
    /**
     * 商品备注
     */
    @ApiField("item_memo")
    private String itemMemo;
    
    /**
     * 服务所属的交易订单号。如果服务为一年包换，则item_oid这笔订单享受改服务的保护
     */
    @ApiField("item_oid")
    private Long itemOid;
    
    /**
     * 子订单发货的快递公司名称
     */
    @ApiField("logistics_company")
    private String logisticsCompany;
    
    /**
     * 免单金额
     */
    @ApiField("md_fee")
    private String mdFee;
    
    /**
     * 免单资格属性
     */
    @ApiField("md_qualification")
    private String mdQualification;
    
    /**
     * 订单修改时间，目前只有taobao.trade.ordersku.update会返回此字段。
     */
    @ApiField("modified")
    private Date modified;
    
    /**
     * monthPayment
     */
    @ApiField("month_payment")
    private String monthPayment;
    
    /**
     * 新零售商家端商品唯一编号
     */
    @ApiField("nr_outer_iid")
    private String nrOuterIid;
    
    /**
     * nrReduceInvFail
     */
    @ApiField("nr_reduce_inv_fail")
    private String nrReduceInvFail;
    
    /**
     * 购买数量。取值范围:大于零的整数
     */
    @ApiField("num")
    private Long num;
    
    /**
     * 商品数字ID
     */
    @ApiField("num_iid")
    private Long numIid;
    
    /**
     * 
     */
    @ApiField("o2o_et_order_id")
    private String o2oEtOrderId;
    
    /**
     * 导购员ID
     */
    @ApiField("o2o_guide_id")
    private String o2oGuideId;
    
    /**
     * 导购员名称
     */
    @ApiField("o2o_guide_name")
    private String o2oGuideName;
    
    /**
     * 门店Id
     */
    @ApiField("o2o_shop_id")
    private String o2oShopId;
    
    /**
     * 门店名称
     */
    @ApiField("o2o_shop_name")
    private String o2oShopName;
    
    /**
     * 子订单编号
     */
    @ApiField("oid")
    private Long oid;
    
    /**
     * oidStr
     */
    @ApiField("oid_str")
    private String oidStr;
    
    /**
     * top动态字段
     */
    @ApiField("order_attr")
    private String orderAttr;
    
    /**
     * 子订单来源,如jhs(聚划算)、taobao(淘宝)、wap(无线)
     */
    @ApiField("order_from")
    private String orderFrom;
    
    /**
     * 云店接单标记
     */
    @ApiField("order_taking")
    private String orderTaking;
    
    /**
     * 天猫未来店外部 ERP 商品 ID
     */
    @ApiField("out_item_id")
    private String outItemId;
    
    /**
     * outUniqueId
     */
    @ApiField("out_unique_id")
    private String outUniqueId;
    
    /**
     * 商家外部编码(可与商家外部系统对接)。外部商家自己定义的商品Item的id，可以通过taobao.items.custom.get获取商品的Item的信息
     */
    @ApiField("outer_iid")
    private String outerIid;
    
    /**
     * 外部网店自己定义的Sku编号
     */
    @ApiField("outer_sku_id")
    private String outerSkuId;
    
    /**
     * 优惠分摊
     */
    @ApiField("part_mjz_discount")
    private String partMjzDiscount;
    
    /**
     * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。对于多子订单的交易，计算公式如下：payment = price * num + adjust_fee - discount_fee ；单子订单交易，payment与主订单的payment一致，对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。建议使用退款前的实付金额减去退款单中的实际退款金额计算。
     */
    @ApiField("payment")
    private String payment;
    
    /**
     * penalty
     */
    @ApiField("penalty")
    private String penalty;
    
    /**
     * 商品图片的绝对路径
     */
    @ApiField("pic_path")
    private String picPath;
    
    /**
     * platformSubsidyFee
     */
    @ApiField("platform_subsidy_fee")
    private String platformSubsidyFee;
    
    /**
     * 商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiField("price")
    private String price;
    
    /**
     * 个人充值红包金额
     */
    @ApiField("recharge_fee")
    private String rechargeFee;
    
    /**
     * 最近退款ID
     */
    @ApiField("refund_id")
    private String refundId;
    
    /**
     * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) CLOSED(退款关闭) SUCCESS(退款成功)
     */
    @ApiField("refund_status")
    private String refundStatus;
    
    /**
     * 天猫无人店线下店 ID
     */
    @ApiField("retail_store_id")
    private String retailStoreId;
    
    /**
     * 卖家昵称
     */
    @ApiField("seller_nick")
    private String sellerNick;
    
    /**
     * 卖家是否已评价。可选值：true(已评价)，false(未评价)
     */
    @ApiField("seller_rate")
    private Boolean sellerRate;
    
    /**
     * 卖家类型，可选值为：B（商城商家），C（普通卖家）
     */
    @ApiField("seller_type")
    private String sellerType;
    
    /**
     * 服务详情的URL地址
     */
    @ApiField("service_detail_url")
    private String serviceDetailUrl;
    
    /**
     * serviceFee
     */
    @ApiField("service_fee")
    private String serviceFee;
    
    /**
     * 服务数字id
     */
    @ApiField("service_id")
    private Long serviceId;
    
    /**
     * 仓储信息
     */
    @ApiField("shipper")
    private String shipper;
    
    /**
     * 子订单的运送方式（卖家对订单进行多次发货之后，一个主订单下的子订单的运送方式可能不同，用order.shipping_type来区分子订单的运送方式）
     */
    @ApiField("shipping_type")
    private String shippingType;
    
    /**
     * 商品的最小库存单位Sku的id.可以通过taobao.item.sku.get获取详细的Sku信息
     */
    @ApiField("sku_id")
    private String skuId;
    
    /**
     * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
     */
    @ApiField("sku_properties_name")
    private String skuPropertiesName;
    
    /**
     * 订单快照详细信息
     */
    @ApiField("snapshot")
    private String snapshot;
    
    /**
     * 订单快照URL
     */
    @ApiField("snapshot_url")
    private String snapshotUrl;
    
    /**
     * sortInfo
     */
    @ApiField("sort_info")
    private String sortInfo;
    
    /**
     * 订单状态（请关注此状态，如果为TRADE_CLOSED_BY_TAOBAO状态，则不要对此订单进行发货，切记啊！）。可选值: <ul><li>TRADE_NO_CREATE_PAY(没有创建支付宝交易) </li><li>WAIT_BUYER_PAY(等待买家付款) </li><li>WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) </li><li>WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) </li><li>TRADE_BUYER_SIGNED(买家已签收,货到付款专用) </li><li>TRADE_FINISHED(交易成功) </li><li>TRADE_CLOSED(付款以后用户退款成功，交易自动关闭) </li><li>TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易)</li><li>PAY_PENDING(国际信用卡支付付款确认中)</li></ul>
     */
    @ApiField("status")
    private String status;
    
    /**
     * 发货的仓库编码
     */
    @ApiField("store_code")
    private String storeCode;
    
    /**
     * 天猫国际官网直供子订单关税税费
     */
    @ApiField("sub_order_tax_fee")
    private String subOrderTaxFee;
    
    /**
     * 天猫国际子订单计税优惠金额
     */
    @ApiField("sub_order_tax_promotion_fee")
    private String subOrderTaxPromotionFee;
    
    /**
     * 天猫国际官网直供子订单关税税率
     */
    @ApiField("sub_order_tax_rate")
    private String subOrderTaxRate;
    
    /**
     * tailPayment
     */
    @ApiField("tail_payment")
    private String tailPayment;
    
    /**
     * 天猫国际订单包税金额
     */
    @ApiField("tax_coupon_discount")
    private String taxCouponDiscount;
    
    /**
     * 天猫国际订单是否包税
     */
    @ApiField("tax_free")
    private Boolean taxFree;
    
    /**
     * 门票有效期的key
     */
    @ApiField("ticket_expdate_key")
    private String ticketExpdateKey;
    
    /**
     * 对应门票有效期的外部id
     */
    @ApiField("ticket_outer_id")
    private String ticketOuterId;
    
    /**
     * 订单超时到期时间。格式:yyyy-MM-dd HH:mm:ss
     */
    @ApiField("timeout_action_time")
    private Date timeoutActionTime;
    
    /**
     * 商品标题
     */
    @ApiField("title")
    private String title;
    
    /**
     * 支持家装类物流的类型
     */
    @ApiField("tmser_spu_code")
    private String tmserSpuCode;
    
    /**
     * 应付金额（商品价格 * 商品数量 + 手工调整金额 - 子订单级订单优惠金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiField("total_fee")
    private String totalFee;
    
    /**
     * 交易类型
     */
    @ApiField("type")
    private String type;
    
    /**
     * wsBankApplyNo
     */
    @ApiField("ws_bank_apply_no")
    private String wsBankApplyNo;
    
    /**
     * xxx
     */
    @ApiField("xxx")
    private String xxx;
    
    /**
     * 征集预售订单征集状态：1（征集中），2（征集成功），3（征集失败）
     */
    @ApiField("zhengji_status")
    private String zhengjiStatus;
    
    public String getAdjustFee()
    {
        return this.adjustFee;
    }
    
    public void setAdjustFee(String adjustFee)
    {
        this.adjustFee = adjustFee;
    }
    
    public String getAssemblyItem()
    {
        return this.assemblyItem;
    }
    
    public void setAssemblyItem(String assemblyItem)
    {
        this.assemblyItem = assemblyItem;
    }
    
    public String getAssemblyPrice()
    {
        return this.assemblyPrice;
    }
    
    public void setAssemblyPrice(String assemblyPrice)
    {
        this.assemblyPrice = assemblyPrice;
    }
    
    public String getAssemblyRela()
    {
        return this.assemblyRela;
    }
    
    public void setAssemblyRela(String assemblyRela)
    {
        this.assemblyRela = assemblyRela;
    }
    
    public Long getBindOid()
    {
        return this.bindOid;
    }
    
    public void setBindOid(Long bindOid)
    {
        this.bindOid = bindOid;
    }
    
    public String getBindOids()
    {
        return this.bindOids;
    }
    
    public void setBindOids(String bindOids)
    {
        this.bindOids = bindOids;
    }
    
    public String getBindOidsAllStatus()
    {
        return this.bindOidsAllStatus;
    }
    
    public void setBindOidsAllStatus(String bindOidsAllStatus)
    {
        this.bindOidsAllStatus = bindOidsAllStatus;
    }
    
    public String getBizCode()
    {
        return this.bizCode;
    }
    
    public void setBizCode(String bizCode)
    {
        this.bizCode = bizCode;
    }
    
    public String getBuyerNick()
    {
        return this.buyerNick;
    }
    
    public void setBuyerNick(String buyerNick)
    {
        this.buyerNick = buyerNick;
    }
    
    public Boolean getBuyerRate()
    {
        return this.buyerRate;
    }
    
    public void setBuyerRate(Boolean buyerRate)
    {
        this.buyerRate = buyerRate;
    }
    
    public String getCalPenalty()
    {
        return this.calPenalty;
    }
    
    public void setCalPenalty(String calPenalty)
    {
        this.calPenalty = calPenalty;
    }
    
    public String getCarStoreCode()
    {
        return this.carStoreCode;
    }
    
    public void setCarStoreCode(String carStoreCode)
    {
        this.carStoreCode = carStoreCode;
    }
    
    public String getCarStoreName()
    {
        return this.carStoreName;
    }
    
    public void setCarStoreName(String carStoreName)
    {
        this.carStoreName = carStoreName;
    }
    
    public String getCarTaker()
    {
        return this.carTaker;
    }
    
    public void setCarTaker(String carTaker)
    {
        this.carTaker = carTaker;
    }
    
    public String getCarTakerId()
    {
        return this.carTakerId;
    }
    
    public void setCarTakerId(String carTakerId)
    {
        this.carTakerId = carTakerId;
    }
    
    public String getCarTakerIdNum()
    {
        return this.carTakerIdNum;
    }
    
    public void setCarTakerIdNum(String carTakerIdNum)
    {
        this.carTakerIdNum = carTakerIdNum;
    }
    
    public String getCarTakerPhone()
    {
        return this.carTakerPhone;
    }
    
    public void setCarTakerPhone(String carTakerPhone)
    {
        this.carTakerPhone = carTakerPhone;
    }
    
    public Long getCid()
    {
        return this.cid;
    }
    
    public void setCid(Long cid)
    {
        this.cid = cid;
    }
    
    public String getClCarTaker()
    {
        return this.clCarTaker;
    }
    
    public void setClCarTaker(String clCarTaker)
    {
        this.clCarTaker = clCarTaker;
    }
    
    public String getClCarTakerIDNum()
    {
        return this.clCarTakerIDNum;
    }
    
    public void setClCarTakerIDNum(String clCarTakerIDNum)
    {
        this.clCarTakerIDNum = clCarTakerIDNum;
    }
    
    public String getClCarTakerIdNum()
    {
        return this.clCarTakerIdNum;
    }
    
    public void setClCarTakerIdNum(String clCarTakerIdNum)
    {
        this.clCarTakerIdNum = clCarTakerIdNum;
    }
    
    public String getClCarTakerPhone()
    {
        return this.clCarTakerPhone;
    }
    
    public void setClCarTakerPhone(String clCarTakerPhone)
    {
        this.clCarTakerPhone = clCarTakerPhone;
    }
    
    public String getClDownPayment()
    {
        return this.clDownPayment;
    }
    
    public void setClDownPayment(String clDownPayment)
    {
        this.clDownPayment = clDownPayment;
    }
    
    public String getClDownPaymentRatio()
    {
        return this.clDownPaymentRatio;
    }
    
    public void setClDownPaymentRatio(String clDownPaymentRatio)
    {
        this.clDownPaymentRatio = clDownPaymentRatio;
    }
    
    public String getClInstallmentNum()
    {
        return this.clInstallmentNum;
    }
    
    public void setClInstallmentNum(String clInstallmentNum)
    {
        this.clInstallmentNum = clInstallmentNum;
    }
    
    public String getClMonthPayment()
    {
        return this.clMonthPayment;
    }
    
    public void setClMonthPayment(String clMonthPayment)
    {
        this.clMonthPayment = clMonthPayment;
    }
    
    public String getClServiceFee()
    {
        return this.clServiceFee;
    }
    
    public void setClServiceFee(String clServiceFee)
    {
        this.clServiceFee = clServiceFee;
    }
    
    public String getClTailPayment()
    {
        return this.clTailPayment;
    }
    
    public void setClTailPayment(String clTailPayment)
    {
        this.clTailPayment = clTailPayment;
    }
    
    public String getCloudStore()
    {
        return this.cloudStore;
    }
    
    public void setCloudStore(String cloudStore)
    {
        this.cloudStore = cloudStore;
    }
    
    public String getCloudStoreBindPos()
    {
        return this.cloudStoreBindPos;
    }
    
    public void setCloudStoreBindPos(String cloudStoreBindPos)
    {
        this.cloudStoreBindPos = cloudStoreBindPos;
    }
    
    public String getCloudStoreToken()
    {
        return this.cloudStoreToken;
    }
    
    public void setCloudStoreToken(String cloudStoreToken)
    {
        this.cloudStoreToken = cloudStoreToken;
    }
    
    public String getComboId()
    {
        return this.comboId;
    }
    
    public void setComboId(String comboId)
    {
        this.comboId = comboId;
    }
    
    public String getConsignTime()
    {
        return this.consignTime;
    }
    
    public void setConsignTime(String consignTime)
    {
        this.consignTime = consignTime;
    }
    
    public String getCustomization()
    {
        return this.customization;
    }
    
    public void setCustomization(String customization)
    {
        this.customization = customization;
    }
    
    public String getDiscountFee()
    {
        return this.discountFee;
    }
    
    public void setDiscountFee(String discountFee)
    {
        this.discountFee = discountFee;
    }
    
    public String getDivideOrderFee()
    {
        return this.divideOrderFee;
    }
    
    public void setDivideOrderFee(String divideOrderFee)
    {
        this.divideOrderFee = divideOrderFee;
    }
    
    public String getDownPayment()
    {
        return this.downPayment;
    }
    
    public void setDownPayment(String downPayment)
    {
        this.downPayment = downPayment;
    }
    
    public String getDownPaymentRatio()
    {
        return this.downPaymentRatio;
    }
    
    public void setDownPaymentRatio(String downPaymentRatio)
    {
        this.downPaymentRatio = downPaymentRatio;
    }
    
    public Date getEndTime()
    {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }
    
    public String getEstimateConTime()
    {
        return this.estimateConTime;
    }
    
    public void setEstimateConTime(String estimateConTime)
    {
        this.estimateConTime = estimateConTime;
    }
    
    public String getEtPlateNumber()
    {
        return this.etPlateNumber;
    }
    
    public void setEtPlateNumber(String etPlateNumber)
    {
        this.etPlateNumber = etPlateNumber;
    }
    
    public String getEtSerTime()
    {
        return this.etSerTime;
    }
    
    public void setEtSerTime(String etSerTime)
    {
        this.etSerTime = etSerTime;
    }
    
    public String getEtShopName()
    {
        return this.etShopName;
    }
    
    public void setEtShopName(String etShopName)
    {
        this.etShopName = etShopName;
    }
    
    public String getEtVerifiedShopName()
    {
        return this.etVerifiedShopName;
    }
    
    public void setEtVerifiedShopName(String etVerifiedShopName)
    {
        this.etVerifiedShopName = etVerifiedShopName;
    }
    
    public String getfStatus()
    {
        return this.fStatus;
    }
    
    public void setfStatus(String fStatus)
    {
        this.fStatus = fStatus;
    }
    
    public String getfTerm()
    {
        return this.fTerm;
    }
    
    public void setfTerm(String fTerm)
    {
        this.fTerm = fTerm;
    }
    
    public String getfType()
    {
        return this.fType;
    }
    
    public void setfType(String fType)
    {
        this.fType = fType;
    }
    
    public Long getFqgNum()
    {
        return this.fqgNum;
    }
    
    public void setFqgNum(Long fqgNum)
    {
        this.fqgNum = fqgNum;
    }
    
    public String getHjSettleNoCommission()
    {
        return this.hjSettleNoCommission;
    }
    
    public void setHjSettleNoCommission(String hjSettleNoCommission)
    {
        this.hjSettleNoCommission = hjSettleNoCommission;
    }
    
    public String getIid()
    {
        return this.iid;
    }
    
    public void setIid(String iid)
    {
        this.iid = iid;
    }
    
    public String getInstallmentNum()
    {
        return this.installmentNum;
    }
    
    public void setInstallmentNum(String installmentNum)
    {
        this.installmentNum = installmentNum;
    }
    
    public String getInvType()
    {
        return this.invType;
    }
    
    public void setInvType(String invType)
    {
        this.invType = invType;
    }
    
    public String getInvoiceNo()
    {
        return this.invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo)
    {
        this.invoiceNo = invoiceNo;
    }
    
    public Boolean getIsDaixiao()
    {
        return this.isDaixiao;
    }
    
    public void setIsDaixiao(Boolean isDaixiao)
    {
        this.isDaixiao = isDaixiao;
    }
    
    public Boolean getIsFqgSFee()
    {
        return this.isFqgSFee;
    }
    
    public void setIsFqgSFee(Boolean isFqgSFee)
    {
        this.isFqgSFee = isFqgSFee;
    }
    
    public Boolean getIsOversold()
    {
        return this.isOversold;
    }
    
    public void setIsOversold(Boolean isOversold)
    {
        this.isOversold = isOversold;
    }
    
    public Boolean getIsServiceOrder()
    {
        return this.isServiceOrder;
    }
    
    public void setIsServiceOrder(Boolean isServiceOrder)
    {
        this.isServiceOrder = isServiceOrder;
    }
    
    public Boolean getIsShShip()
    {
        return this.isShShip;
    }
    
    public void setIsShShip(Boolean isShShip)
    {
        this.isShShip = isShShip;
    }
    
    public Boolean getIsWww()
    {
        return this.isWww;
    }
    
    public void setIsWww(Boolean isWww)
    {
        this.isWww = isWww;
    }
    
    public Long getItemMealId()
    {
        return this.itemMealId;
    }
    
    public void setItemMealId(Long itemMealId)
    {
        this.itemMealId = itemMealId;
    }
    
    public String getItemMealName()
    {
        return this.itemMealName;
    }
    
    public void setItemMealName(String itemMealName)
    {
        this.itemMealName = itemMealName;
    }
    
    public String getItemMemo()
    {
        return this.itemMemo;
    }
    
    public void setItemMemo(String itemMemo)
    {
        this.itemMemo = itemMemo;
    }
    
    public Long getItemOid()
    {
        return this.itemOid;
    }
    
    public void setItemOid(Long itemOid)
    {
        this.itemOid = itemOid;
    }
    
    public String getLogisticsCompany()
    {
        return this.logisticsCompany;
    }
    
    public void setLogisticsCompany(String logisticsCompany)
    {
        this.logisticsCompany = logisticsCompany;
    }
    
    public String getMdFee()
    {
        return this.mdFee;
    }
    
    public void setMdFee(String mdFee)
    {
        this.mdFee = mdFee;
    }
    
    public String getMdQualification()
    {
        return this.mdQualification;
    }
    
    public void setMdQualification(String mdQualification)
    {
        this.mdQualification = mdQualification;
    }
    
    public Date getModified()
    {
        return this.modified;
    }
    
    public void setModified(Date modified)
    {
        this.modified = modified;
    }
    
    public String getMonthPayment()
    {
        return this.monthPayment;
    }
    
    public void setMonthPayment(String monthPayment)
    {
        this.monthPayment = monthPayment;
    }
    
    public String getNrOuterIid()
    {
        return this.nrOuterIid;
    }
    
    public void setNrOuterIid(String nrOuterIid)
    {
        this.nrOuterIid = nrOuterIid;
    }
    
    public String getNrReduceInvFail()
    {
        return this.nrReduceInvFail;
    }
    
    public void setNrReduceInvFail(String nrReduceInvFail)
    {
        this.nrReduceInvFail = nrReduceInvFail;
    }
    
    public Long getNum()
    {
        return this.num;
    }
    
    public void setNum(Long num)
    {
        this.num = num;
    }
    
    public Long getNumIid()
    {
        return this.numIid;
    }
    
    public void setNumIid(Long numIid)
    {
        this.numIid = numIid;
    }
    
    public String getO2oEtOrderId()
    {
        return this.o2oEtOrderId;
    }
    
    public void setO2oEtOrderId(String o2oEtOrderId)
    {
        this.o2oEtOrderId = o2oEtOrderId;
    }
    
    public String getO2oGuideId()
    {
        return this.o2oGuideId;
    }
    
    public void setO2oGuideId(String o2oGuideId)
    {
        this.o2oGuideId = o2oGuideId;
    }
    
    public String getO2oGuideName()
    {
        return this.o2oGuideName;
    }
    
    public void setO2oGuideName(String o2oGuideName)
    {
        this.o2oGuideName = o2oGuideName;
    }
    
    public String getO2oShopId()
    {
        return this.o2oShopId;
    }
    
    public void setO2oShopId(String o2oShopId)
    {
        this.o2oShopId = o2oShopId;
    }
    
    public String getO2oShopName()
    {
        return this.o2oShopName;
    }
    
    public void setO2oShopName(String o2oShopName)
    {
        this.o2oShopName = o2oShopName;
    }
    
    public Long getOid()
    {
        return this.oid;
    }
    
    public void setOid(Long oid)
    {
        this.oid = oid;
    }
    
    public String getOidStr()
    {
        return this.oidStr;
    }
    
    public void setOidStr(String oidStr)
    {
        this.oidStr = oidStr;
    }
    
    public String getOrderAttr()
    {
        return this.orderAttr;
    }
    
    public void setOrderAttr(String orderAttr)
    {
        this.orderAttr = orderAttr;
    }
    
    public void setOrderAttrString(String orderAttr)
    {
        this.orderAttr = orderAttr;
    }
    
    public String getOrderFrom()
    {
        return this.orderFrom;
    }
    
    public void setOrderFrom(String orderFrom)
    {
        this.orderFrom = orderFrom;
    }
    
    public String getOrderTaking()
    {
        return this.orderTaking;
    }
    
    public void setOrderTaking(String orderTaking)
    {
        this.orderTaking = orderTaking;
    }
    
    public String getOutItemId()
    {
        return this.outItemId;
    }
    
    public void setOutItemId(String outItemId)
    {
        this.outItemId = outItemId;
    }
    
    public String getOutUniqueId()
    {
        return this.outUniqueId;
    }
    
    public void setOutUniqueId(String outUniqueId)
    {
        this.outUniqueId = outUniqueId;
    }
    
    public String getOuterIid()
    {
        return this.outerIid;
    }
    
    public void setOuterIid(String outerIid)
    {
        this.outerIid = outerIid;
    }
    
    public String getOuterSkuId()
    {
        return this.outerSkuId;
    }
    
    public void setOuterSkuId(String outerSkuId)
    {
        this.outerSkuId = outerSkuId;
    }
    
    public String getPartMjzDiscount()
    {
        return this.partMjzDiscount;
    }
    
    public void setPartMjzDiscount(String partMjzDiscount)
    {
        this.partMjzDiscount = partMjzDiscount;
    }
    
    public String getPayment()
    {
        return this.payment;
    }
    
    public void setPayment(String payment)
    {
        this.payment = payment;
    }
    
    public String getPenalty()
    {
        return this.penalty;
    }
    
    public void setPenalty(String penalty)
    {
        this.penalty = penalty;
    }
    
    public String getPicPath()
    {
        return this.picPath;
    }
    
    public void setPicPath(String picPath)
    {
        this.picPath = picPath;
    }
    
    public String getPlatformSubsidyFee()
    {
        return this.platformSubsidyFee;
    }
    
    public void setPlatformSubsidyFee(String platformSubsidyFee)
    {
        this.platformSubsidyFee = platformSubsidyFee;
    }
    
    public String getPrice()
    {
        return this.price;
    }
    
    public void setPrice(String price)
    {
        this.price = price;
    }
    
    public String getRechargeFee()
    {
        return this.rechargeFee;
    }
    
    public void setRechargeFee(String rechargeFee)
    {
        this.rechargeFee = rechargeFee;
    }
    
    public String getRefundId()
    {
        return this.refundId;
    }
    
    public void setRefundId(String refundId)
    {
        this.refundId = refundId;
    }
    
    public String getRefundStatus()
    {
        return this.refundStatus;
    }
    
    public void setRefundStatus(String refundStatus)
    {
        this.refundStatus = refundStatus;
    }
    
    public String getRetailStoreId()
    {
        return this.retailStoreId;
    }
    
    public void setRetailStoreId(String retailStoreId)
    {
        this.retailStoreId = retailStoreId;
    }
    
    public String getSellerNick()
    {
        return this.sellerNick;
    }
    
    public void setSellerNick(String sellerNick)
    {
        this.sellerNick = sellerNick;
    }
    
    public Boolean getSellerRate()
    {
        return this.sellerRate;
    }
    
    public void setSellerRate(Boolean sellerRate)
    {
        this.sellerRate = sellerRate;
    }
    
    public String getSellerType()
    {
        return this.sellerType;
    }
    
    public void setSellerType(String sellerType)
    {
        this.sellerType = sellerType;
    }
    
    public String getServiceDetailUrl()
    {
        return this.serviceDetailUrl;
    }
    
    public void setServiceDetailUrl(String serviceDetailUrl)
    {
        this.serviceDetailUrl = serviceDetailUrl;
    }
    
    public String getServiceFee()
    {
        return this.serviceFee;
    }
    
    public void setServiceFee(String serviceFee)
    {
        this.serviceFee = serviceFee;
    }
    
    public Long getServiceId()
    {
        return this.serviceId;
    }
    
    public void setServiceId(Long serviceId)
    {
        this.serviceId = serviceId;
    }
    
    public String getShipper()
    {
        return this.shipper;
    }
    
    public void setShipper(String shipper)
    {
        this.shipper = shipper;
    }
    
    public String getShippingType()
    {
        return this.shippingType;
    }
    
    public void setShippingType(String shippingType)
    {
        this.shippingType = shippingType;
    }
    
    public String getSkuId()
    {
        return this.skuId;
    }
    
    public void setSkuId(String skuId)
    {
        this.skuId = skuId;
    }
    
    public String getSkuPropertiesName()
    {
        return this.skuPropertiesName;
    }
    
    public void setSkuPropertiesName(String skuPropertiesName)
    {
        this.skuPropertiesName = skuPropertiesName;
    }
    
    public String getSnapshot()
    {
        return this.snapshot;
    }
    
    public void setSnapshot(String snapshot)
    {
        this.snapshot = snapshot;
    }
    
    public String getSnapshotUrl()
    {
        return this.snapshotUrl;
    }
    
    public void setSnapshotUrl(String snapshotUrl)
    {
        this.snapshotUrl = snapshotUrl;
    }
    
    public String getSortInfo()
    {
        return this.sortInfo;
    }
    
    public void setSortInfo(String sortInfo)
    {
        this.sortInfo = sortInfo;
    }
    
    public void setSortInfoString(String sortInfo)
    {
        this.sortInfo = sortInfo;
    }
    
    public String getStatus()
    {
        return this.status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String getStoreCode()
    {
        return this.storeCode;
    }
    
    public void setStoreCode(String storeCode)
    {
        this.storeCode = storeCode;
    }
    
    public String getSubOrderTaxFee()
    {
        return this.subOrderTaxFee;
    }
    
    public void setSubOrderTaxFee(String subOrderTaxFee)
    {
        this.subOrderTaxFee = subOrderTaxFee;
    }
    
    public String getSubOrderTaxPromotionFee()
    {
        return this.subOrderTaxPromotionFee;
    }
    
    public void setSubOrderTaxPromotionFee(String subOrderTaxPromotionFee)
    {
        this.subOrderTaxPromotionFee = subOrderTaxPromotionFee;
    }
    
    public String getSubOrderTaxRate()
    {
        return this.subOrderTaxRate;
    }
    
    public void setSubOrderTaxRate(String subOrderTaxRate)
    {
        this.subOrderTaxRate = subOrderTaxRate;
    }
    
    public String getTailPayment()
    {
        return this.tailPayment;
    }
    
    public void setTailPayment(String tailPayment)
    {
        this.tailPayment = tailPayment;
    }
    
    public String getTaxCouponDiscount()
    {
        return this.taxCouponDiscount;
    }
    
    public void setTaxCouponDiscount(String taxCouponDiscount)
    {
        this.taxCouponDiscount = taxCouponDiscount;
    }
    
    public Boolean getTaxFree()
    {
        return this.taxFree;
    }
    
    public void setTaxFree(Boolean taxFree)
    {
        this.taxFree = taxFree;
    }
    
    public String getTicketExpdateKey()
    {
        return this.ticketExpdateKey;
    }
    
    public void setTicketExpdateKey(String ticketExpdateKey)
    {
        this.ticketExpdateKey = ticketExpdateKey;
    }
    
    public String getTicketOuterId()
    {
        return this.ticketOuterId;
    }
    
    public void setTicketOuterId(String ticketOuterId)
    {
        this.ticketOuterId = ticketOuterId;
    }
    
    public Date getTimeoutActionTime()
    {
        return this.timeoutActionTime;
    }
    
    public void setTimeoutActionTime(Date timeoutActionTime)
    {
        this.timeoutActionTime = timeoutActionTime;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTmserSpuCode()
    {
        return this.tmserSpuCode;
    }
    
    public void setTmserSpuCode(String tmserSpuCode)
    {
        this.tmserSpuCode = tmserSpuCode;
    }
    
    public String getTotalFee()
    {
        return this.totalFee;
    }
    
    public void setTotalFee(String totalFee)
    {
        this.totalFee = totalFee;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getWsBankApplyNo()
    {
        return this.wsBankApplyNo;
    }
    
    public void setWsBankApplyNo(String wsBankApplyNo)
    {
        this.wsBankApplyNo = wsBankApplyNo;
    }
    
    public String getXxx()
    {
        return this.xxx;
    }
    
    public void setXxx(String xxx)
    {
        this.xxx = xxx;
    }
    
    public String getZhengjiStatus()
    {
        return this.zhengjiStatus;
    }
    
    public void setZhengjiStatus(String zhengjiStatus)
    {
        this.zhengjiStatus = zhengjiStatus;
    }
    
}
