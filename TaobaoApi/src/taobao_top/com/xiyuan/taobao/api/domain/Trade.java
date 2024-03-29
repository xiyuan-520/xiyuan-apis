package com.xiyuan.taobao.api.domain;

import com.xiyuan.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.List;
import java.util.Date;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiListField;


/**
 * 交易详细信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Trade extends TaobaoObject {

	private static final long serialVersionUID = 7476823262295399335L;

	/**
	 * Acookie订单唯一ID。
	 */
	@ApiField("acookie_id")
	private String acookieId;

	/**
	 * 卖家手工调整金额，精确到2位小数，单位：元。如：200.07，表示：200元7分。来源于订单价格修改，如果有多笔子订单的时候，这个为0，单笔的话则跟[order].adjust_fee一样
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * 买家的支付宝id号，在UIC中有记录，买家支付宝的唯一标示，不因为买家更换Email账号而改变。
	 */
	@ApiField("alipay_id")
	private Long alipayId;

	/**
	 * 支付宝交易号，如：2009112081173831
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 付款时使用的支付宝积分的额度,单位分，比如返回1，则为1分钱
	 */
	@ApiField("alipay_point")
	private Long alipayPoint;

	/**
	 * 创建交易接口成功后，返回的支付url
	 */
	@ApiField("alipay_url")
	private String alipayUrl;

	/**
	 * 淘宝下单成功了,但由于某种错误支付宝订单没有创建时返回的信息。taobao.trade.add接口专用
	 */
	@ApiField("alipay_warn_msg")
	private String alipayWarnMsg;

	/**
	 * appkey用作推送
	 */
	@ApiField("allow_appkeys")
	private String allowAppkeys;

	/**
	 * 区域id，代表订单下单的区位码，区位码是通过省市区转换而来，通过区位码能精确到区内的划分，比如310012是杭州市西湖区华星路
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 物流到货时效截单时间，格式 HH:mm
	 */
	@ApiField("arrive_cut_time")
	private String arriveCutTime;

	/**
	 * 物流到货时效，单位天
	 */
	@ApiField("arrive_interval")
	private Long arriveInterval;

	/**
	 * 组合商品
	 */
	@ApiField("assembly")
	private String assembly;

	/**
	 * 同步到卖家库的时间，taobao.trades.sold.incrementv.get接口返回此字段
	 */
	@ApiField("async_modified")
	private Date asyncModified;

	/**
	 * 交易中剩余的确认收货金额（这个金额会随着子订单确认收货而不断减少，交易成功后会变为零）。精确到2位小数;单位:元。如:200.07，表示:200 元7分
	 */
	@ApiField("available_confirm_fee")
	private String availableConfirmFee;

	/**
	 * 为tmall.daogoubao.cloudstore时表示云店链路
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 买家支付宝账号
	 */
	@ApiField("buyer_alipay_no")
	private String buyerAlipayNo;

	/**
	 * 买家下单的地区
	 */
	@ApiField("buyer_area")
	private String buyerArea;

	/**
	 * 买家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
	 */
	@ApiField("buyer_cod_fee")
	private String buyerCodFee;

	/**
	 * 买家邮件地址
	 */
	@ApiField("buyer_email")
	private String buyerEmail;

	/**
	 * 买家备注旗帜（与淘宝网上订单的买家备注旗帜对应，只有买家才能查看该字段）红、黄、绿、蓝、紫 分别对应 1、2、3、4、5
	 */
	@ApiField("buyer_flag")
	private Long buyerFlag;

	/**
	 * 买家下单的IP信息，仅供taobao.trade.fullinfo.get查询返回。需要对返回结果进行Base64解码。
	 */
	@ApiField("buyer_ip")
	private String buyerIp;

	/**
	 * 买家备注（与淘宝网上订单的买家备注对应，只有买家才能查看该字段）
	 */
	@ApiField("buyer_memo")
	private String buyerMemo;

	/**
	 * 买家留言
	 */
	@ApiField("buyer_message")
	private String buyerMessage;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 买家获得积分,返点的积分。格式:100;单位:个。返点的积分要交易成功之后才能获得。
	 */
	@ApiField("buyer_obtain_point_fee")
	private Long buyerObtainPointFee;

	/**
	 * 买家OpenUid
	 */
	@ApiField("buyer_open_uid")
	private String buyerOpenUid;

	/**
	 * 买家是否已评价。可选值:true(已评价),false(未评价)。如买家只评价未打分，此字段仍返回false
	 */
	@ApiField("buyer_rate")
	private Boolean buyerRate;

	/**
	 * 买家可以通过此字段查询是否当前交易可以评论，can_rate=true可以评价，false则不能评价。
	 */
	@ApiField("can_rate")
	private Boolean canRate;

	/**
	 * 值为1，且bizCode不为tmall.daogoubao.cloudstore时，为旗舰店订单
	 */
	@ApiField("cloud_store")
	private String cloudStore;

	/**
	 * 天猫直送服务
	 */
	@ApiField("cn_service")
	private String cnService;

	/**
	 * 货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分。
	 */
	@ApiField("cod_fee")
	private String codFee;

	/**
	 * 货到付款物流状态。初始状态 NEW_CREATED,接单成功 ACCEPTED_BY_COMPANY,接单失败 REJECTED_BY_COMPANY,接单超时 RECIEVE_TIMEOUT,揽收成功 TAKEN_IN_SUCCESS,揽收失败 TAKEN_IN_FAILED,揽收超时 TAKEN_TIMEOUT,签收成功 SIGN_IN,签收失败 REJECTED_BY_OTHER_SIDE,订单等待发送给物流公司 WAITING_TO_BE_SENT,用户取消物流订单 CANCELED
	 */
	@ApiField("cod_status")
	private String codStatus;

	/**
	 * 揽收时间
	 */
	@ApiField("collect_time")
	private String collectTime;

	/**
	 * 交易佣金。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("commission_fee")
	private String commissionFee;

	/**
	 * 物流发货时效，单位小时
	 */
	@ApiField("consign_interval")
	private Long consignInterval;

	/**
	 * 卖家发货时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consign_time")
	private Date consignTime;

	/**
	 * 订单中使用红包付款的金额
	 */
	@ApiField("coupon_fee")
	private Long couponFee;

	/**
	 * 交易创建时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 使用信用卡支付金额数
	 */
	@ApiField("credit_card_fee")
	private String creditCardFee;

	/**
	 * 跨境订单
	 */
	@ApiField("cross_bonded_declare")
	private Boolean crossBondedDeclare;

	/**
	 * 截单时间
	 */
	@ApiField("cutoff_minutes")
	private String cutoffMinutes;

	/**
	 * 聚划算火拼标记
	 */
	@ApiField("delay_create_delivery")
	private Long delayCreateDelivery;

	/**
	 * 派送CP
	 */
	@ApiField("delivery_cps")
	private String deliveryCps;

	/**
	 * 发货时间
	 */
	@ApiField("delivery_time")
	private String deliveryTime;

	/**
	 * 可以使用trade.promotion_details查询系统优惠系统优惠金额（如打折，VIP，满就送等），精确到2位小数，单位：元。如：200.07，表示：200元7分
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 派送时间
	 */
	@ApiField("dispatch_time")
	private String dispatchTime;

	/**
	 * doneeNick
	 */
	@ApiField("donee_nick")
	private String doneeNick;

	/**
	 * doneeUid
	 */
	@ApiField("donee_open_uid")
	private String doneeOpenUid;

	/**
	 * (encrypt)买家的支付宝id号，在UIC中有记录，买家支付宝的唯一标示，不因为买家更换Email账号而改变。
	 */
	@ApiField("encrypt_alipay_id")
	private String encryptAlipayId;

	/**
	 * 交易结束时间。交易成功时间(更新交易状态为成功的同时更新)/确认收货时间或者交易关闭时间 。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 时间
	 */
	@ApiField("es_date")
	private String esDate;

	/**
	 * 时间段
	 */
	@ApiField("es_range")
	private String esRange;

	/**
	 * 时效：天
	 */
	@ApiField("es_time")
	private String esTime;

	/**
	 * 商家的预计发货时间
	 */
	@ApiField("est_con_time")
	private String estConTime;

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
	 * 扫码购关联门店
	 */
	@ApiField("et_shop_id")
	private Long etShopId;

	/**
	 * 电子凭证预约门店地址
	 */
	@ApiField("et_shop_name")
	private String etShopName;

	/**
	 * 电子凭证扫码购-扫码支付订单type
	 */
	@ApiField("et_type")
	private String etType;

	/**
	 * 电子凭证核销门店地址
	 */
	@ApiField("et_verified_shop_name")
	private String etVerifiedShopName;

	/**
	 * 电子凭证的垂直信息
	 */
	@ApiField("eticket_ext")
	private String eticketExt;

	/**
	 * 天猫电子凭证家装
	 */
	@ApiField("eticket_service_addr")
	private String eticketServiceAddr;

	/**
	 * 快递代收款。精确到2位小数;单位:元。如:212.07，表示:212元7分
	 */
	@ApiField("express_agency_fee")
	private String expressAgencyFee;

	/**
	 * 聚划算一起买字段
	 */
	@ApiField("forbid_consign")
	private Long forbidConsign;

	/**
	 * 判断订单是否有买家留言，有买家留言返回true，否则返回false
	 */
	@ApiField("has_buyer_message")
	private Boolean hasBuyerMessage;

	/**
	 * 是否包含邮费。与available_confirm_fee同时使用。可选值:true(包含),false(不包含)
	 */
	@ApiField("has_post_fee")
	private Boolean hasPostFee;

	/**
	 * 订单中是否包含运费险订单，如果包含运费险订单返回true，不包含运费险订单，返回false
	 */
	@ApiField("has_yfx")
	private Boolean hasYfx;

	/**
	 * 出生日期
	 */
	@ApiField("hk_birthday")
	private String hkBirthday;

	/**
	 * 证件号码
	 */
	@ApiField("hk_card_code")
	private String hkCardCode;

	/**
	 * 证件类型001代表港澳通行证类型、002代表入台证003代表护照
	 */
	@ApiField("hk_card_type")
	private String hkCardType;

	/**
	 * 中文名
	 */
	@ApiField("hk_china_name")
	private String hkChinaName;

	/**
	 * 拼音名
	 */
	@ApiField("hk_en_name")
	private String hkEnName;

	/**
	 * 航班飞行时间
	 */
	@ApiField("hk_flight_date")
	private String hkFlightDate;

	/**
	 * 航班号
	 */
	@ApiField("hk_flight_no")
	private String hkFlightNo;

	/**
	 * 性别M: 男性，F: 女性
	 */
	@ApiField("hk_gender")
	private String hkGender;

	/**
	 * 提货地点
	 */
	@ApiField("hk_pickup")
	private String hkPickup;

	/**
	 * 提货地点id
	 */
	@ApiField("hk_pickup_id")
	private String hkPickupId;

	/**
	 * 采购订单标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 商品字符串编号(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 发票类型（ 1 电子发票 2  纸质发票 ）
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_name")
	private String invoiceName;

	/**
	 * 发票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 是否3D交易
	 */
	@ApiField("is_3D")
	private Boolean is3D;

	/**
	 * 表示是否是品牌特卖（常规特卖，不包括特卖惠和特实惠）订单，如果是返回true，如果不是返回false。当此字段与is_force_wlb均为true时，订单强制物流宝发货。
	 */
	@ApiField("is_brand_sale")
	private Boolean isBrandSale;

	/**
	 * 表示订单交易是否含有对应的代销采购单。如果该订单中存在一个对应的代销采购单，那么该值为true；反之，该值为false。
	 */
	@ApiField("is_daixiao")
	private Boolean isDaixiao;

	/**
	 * 订单是否强制使用物流宝发货。当此字段与is_brand_sale均为true时，订单强制物流宝发货。此字段为false时，该订单根据流转规则设置可以使用物流宝或者常规方式发货
	 */
	@ApiField("is_force_wlb")
	private Boolean isForceWlb;

	/**
	 * isGifit
	 */
	@ApiField("is_gifit")
	private Boolean isGifit;

	/**
	 * isGift
	 */
	@ApiField("is_gift")
	private Boolean isGift;

	/**
	 * isIstore
	 */
	@ApiField("is_istore")
	private Boolean isIstore;

	/**
	 * 是否保障速递，如果为true，则为保障速递订单，使用线下联系发货接口发货，如果未false，则该订单非保障速递，根据卖家设置的订单流转规则可使用物流宝或者常规物流发货。
	 */
	@ApiField("is_lgtype")
	private Boolean isLgtype;

	/**
	 * 是否是智慧门店订单，只有true，或者 null 两种情况
	 */
	@ApiField("is_o2o_passport")
	private Boolean isO2oPassport;

	/**
	 * 是否是多次发货的订单如果卖家对订单进行多次发货，则为true否则为false
	 */
	@ApiField("is_part_consign")
	private Boolean isPartConsign;

	/**
	 * 是否屏蔽发货
	 */
	@ApiField("is_sh_ship")
	private Boolean isShShip;

	/**
	 * 表示订单交易是否网厅订单。 如果该订单是网厅订单，那么该值为true；反之，该值为false。
	 */
	@ApiField("is_wt")
	private Boolean isWt;

	/**
	 * 次日达订单送达时间
	 */
	@ApiField("lg_aging")
	private String lgAging;

	/**
	 * 次日达，三日达等送达类型
	 */
	@ApiField("lg_aging_type")
	private String lgAgingType;

	/**
	 * linkedmall透传参数
	 */
	@ApiField("linkedmall_ext_info")
	private String linkedmallExtInfo;

	/**
	 * logisticsInfos
	 */
	@ApiListField("logistics_infos")
	@ApiField("logistics_info")
	private List<LogisticsInfo> logisticsInfos;

	/**
	 * 订单出现异常问题的时候，给予用户的描述,没有异常的时候，此值为空
	 */
	@ApiField("mark_desc")
	private String markDesc;

	/**
	 * 垂直市场
	 */
	@ApiField("market")
	private String market;

	/**
	 * 交易修改时间(用户对订单的任何修改都会更新此字段)。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 预售单为true，否则false
	 */
	@ApiField("new_presell")
	private Boolean newPresell;

	/**
	 * 一小时达不处理订单
	 */
	@ApiField("nr_no_handle")
	private String nrNoHandle;

	/**
	 * nrOffline
	 */
	@ApiField("nr_offline")
	private String nrOffline;

	/**
	 * 导购员ID
	 */
	@ApiField("nr_shop_guide_id")
	private String nrShopGuideId;

	/**
	 * 导购员名称
	 */
	@ApiField("nr_shop_guide_name")
	private String nrShopGuideName;

	/**
	 * 门店 ID
	 */
	@ApiField("nr_shop_id")
	private String nrShopId;

	/**
	 * 门店名称
	 */
	@ApiField("nr_shop_name")
	private String nrShopName;

	/**
	 * nrStoreOrderId
	 */
	@ApiField("nr_store_order_id")
	private String nrStoreOrderId;

	/**
	 * 商品购买数量。取值范围：大于零的整数,对于一个trade对应多个order的时候（一笔主订单，对应多笔子订单），num=0，num是一个跟商品关联的属性，一笔订单对应多比子订单的时候，主订单上的num无意义。
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品数字编号
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 卡易售垂直表信息，去除下单ip之后的结果
	 */
	@ApiField("nut_feature")
	private String nutFeature;

	/**
	 * 导购宝=crm
	 */
	@ApiField("o2o")
	private String o2o;

	/**
	 * o2oContract
	 */
	@ApiField("o2o_contract")
	private String o2oContract;

	/**
	 * 导购宝提货方式，inshop：店内提货，online：线上发货
	 */
	@ApiField("o2o_delivery")
	private String o2oDelivery;

	/**
	 * 分阶段交易的特权定金订单ID
	 */
	@ApiField("o2o_et_order_id")
	private String o2oEtOrderId;

	/**
	 * 导购员id
	 */
	@ApiField("o2o_guide_id")
	private String o2oGuideId;

	/**
	 * 导购员名称
	 */
	@ApiField("o2o_guide_name")
	private String o2oGuideName;

	/**
	 * 外部订单号
	 */
	@ApiField("o2o_out_trade_id")
	private String o2oOutTradeId;

	/**
	 * o2oServiceAddress
	 */
	@ApiField("o2o_service_address")
	private String o2oServiceAddress;

	/**
	 * o2oServiceCity
	 */
	@ApiField("o2o_service_city")
	private String o2oServiceCity;

	/**
	 * o2oServiceDistrict
	 */
	@ApiField("o2o_service_district")
	private String o2oServiceDistrict;

	/**
	 * o2oServiceMobile
	 */
	@ApiField("o2o_service_mobile")
	private String o2oServiceMobile;

	/**
	 * o2oServiceName
	 */
	@ApiField("o2o_service_name")
	private String o2oServiceName;

	/**
	 * o2oServiceState
	 */
	@ApiField("o2o_service_state")
	private String o2oServiceState;

	/**
	 * o2oServiceTown
	 */
	@ApiField("o2o_service_town")
	private String o2oServiceTown;

	/**
	 * 导购员门店id
	 */
	@ApiField("o2o_shop_id")
	private String o2oShopId;

	/**
	 * 导购门店名称
	 */
	@ApiField("o2o_shop_name")
	private String o2oShopName;

	/**
	 * 抢单状态0,未处理待分发;1,抢单中;2,已抢单;3,已发货;-1,超时;-2,处理异常;-3,匹配失败;-4,取消抢单;-5,退款取消;-9,逻辑删除
	 */
	@ApiField("o2o_snatch_status")
	private String o2oSnatchStatus;

	/**
	 * 特权定金订单的尾款订单ID
	 */
	@ApiField("o2o_step_order_id")
	private String o2oStepOrderId;

	/**
	 * 组装O2O多阶段尾款订单的明细数据 总阶段数，当前阶数，阶段金额（单位：分），支付状态，例如 3_1_100_paid ; 3_2_2000_nopaid
	 */
	@ApiField("o2o_step_trade_detail")
	private String o2oStepTradeDetail;

	/**
	 * o2oStepTradeDetailNew
	 */
	@ApiField("o2o_step_trade_detail_new")
	private String o2oStepTradeDetailNew;

	/**
	 * 分阶段订单的特权定金抵扣金额，单位：分
	 */
	@ApiField("o2o_voucher_price")
	private String o2oVoucherPrice;

	/**
	 * o2oXiaopiao
	 */
	@ApiField("o2o_xiaopiao")
	private String o2oXiaopiao;

	/**
	 * 门店预约自提订单标
	 */
	@ApiField("obs")
	private String obs;

	/**
	 * 天猫国际拦截
	 */
	@ApiField("ofp_hold")
	private Long ofpHold;

	/**
	 * 星盘标识字段
	 */
	@ApiField("omni_attr")
	private String omniAttr;

	/**
	 * 星盘业务字段
	 */
	@ApiField("omni_param")
	private String omniParam;

	/**
	 * 全渠道商品通相关字段
	 */
	@ApiField("omnichannel_param")
	private String omnichannelParam;

	/**
	 * 天猫国际官网直供主订单关税税费
	 */
	@ApiField("order_tax_fee")
	private String orderTaxFee;

	/**
	 * 天猫国际计税优惠金额
	 */
	@ApiField("order_tax_promotion_fee")
	private String orderTaxPromotionFee;

	/**
	 * 订单列表
	 */
	@ApiListField("orders")
	@ApiField("order")
	private List<Order> orders;

	/**
	 * 时间
	 */
	@ApiField("os_date")
	private String osDate;

	/**
	 * 时间段
	 */
	@ApiField("os_range")
	private String osRange;

	/**
	 * 满返红包的金额；如果没有满返红包，则值为 0.00
	 */
	@ApiField("paid_coupon_fee")
	private String paidCouponFee;

	/**
	 * 付款时间。格式:yyyy-MM-dd HH:mm:ss。订单的付款时间即为物流订单的创建时间。
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 天猫点券卡实付款金额,单位分
	 */
	@ApiField("pcc_af")
	private Long pccAf;

	/**
	 * 商品图片绝对途径
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * platformSubsidyFee
	 */
	@ApiField("platform_subsidy_fee")
	private String platformSubsidyFee;

	/**
	 * 买家使用积分,下单时生成，且一直不变。格式:100;单位:个.
	 */
	@ApiField("point_fee")
	private Long pointFee;

	/**
	 * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * 邮关订单
	 */
	@ApiField("post_gate_declare")
	private Boolean postGateDeclare;

	/**
	 * 商品价格。精确到2位小数；单位：元。如：200.07，表示：200元7分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 交易促销详细信息
	 */
	@ApiField("promotion")
	private String promotion;

	/**
	 * 优惠详情
	 */
	@ApiListField("promotion_details")
	@ApiField("promotion_detail")
	private List<PromotionDetail> promotionDetails;

	/**
	 * 买家实际使用积分（扣除部分退款使用的积分），交易完成后生成（交易成功或关闭），交易未完成时该字段值为0。格式:100;单位:个
	 */
	@ApiField("real_point_fee")
	private Long realPointFee;

	/**
	 * 卖家实际收到的支付宝打款金额（由于子订单可以部分确认收货，这个金额会随着子订单的确认收货而不断增加，交易成功后等于买家实付款减去退款金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("received_payment")
	private String receivedPayment;

	/**
	 * 收货人的详细地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收货人的所在城市<br/>注：因为国家对于城市和地区的划分的有：省直辖市和省直辖县级行政区（区级别的）划分的，淘宝这边根据这个差异保存在不同字段里面比如：广东广州：广州属于一个直辖市是放在的receiver_city的字段里面；而河南济源：济源属于省直辖县级行政区划分，是区级别的，放在了receiver_district里面<br/>建议：程序依赖于城市字段做物流等判断的操作，最好加一个判断逻辑：如果返回值里面只有receiver_district参数，该参数作为城市
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * 收货人国籍
	 */
	@ApiField("receiver_country")
	private String receiverCountry;

	/**
	 * 收货人的所在地区<br/>注：因为国家对于城市和地区的划分的有：省直辖市和省直辖县级行政区（区级别的）划分的，淘宝这边根据这个差异保存在不同字段里面比如：广东广州：广州属于一个直辖市是放在的receiver_city的字段里面；而河南济源：济源属于省直辖县级行政区划分，是区级别的，放在了receiver_district里面<br/>建议：程序依赖于城市字段做物流等判断的操作，最好加一个判断逻辑：如果返回值里面只有receiver_district参数，该参数作为城市
	 */
	@ApiField("receiver_district")
	private String receiverDistrict;

	/**
	 * 收货人的手机号码
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收货人的姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人的电话号码
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 收货人的所在省份
	 */
	@ApiField("receiver_state")
	private String receiverState;

	/**
	 * 收货人街道地址
	 */
	@ApiField("receiver_town")
	private String receiverTown;

	/**
	 * 收货人的邮编
	 */
	@ApiField("receiver_zip")
	private String receiverZip;

	/**
	 * rechargeFee
	 */
	@ApiField("recharge_fee")
	private String rechargeFee;

	/**
	 * 门店端设备id
	 */
	@ApiField("retail_device_id")
	private String retailDeviceId;

	/**
	 * 门店导购员id
	 */
	@ApiField("retail_guide_id")
	private String retailGuideId;

	/**
	 * 新零售线下订单id
	 */
	@ApiField("retail_out_order_id")
	private String retailOutOrderId;

	/**
	 * 新零售门店编码
	 */
	@ApiField("retail_store_code")
	private String retailStoreCode;

	/**
	 * retailStoreId
	 */
	@ApiField("retail_store_id")
	private String retailStoreId;

	/**
	 * 处方药未审核状态
	 */
	@ApiField("rx_audit_status")
	private String rxAuditStatus;

	/**
	 * 卖家支付宝账号
	 */
	@ApiField("seller_alipay_no")
	private String sellerAlipayNo;

	/**
	 * 卖家是否可以对订单进行评价
	 */
	@ApiField("seller_can_rate")
	private Boolean sellerCanRate;

	/**
	 * 卖家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分。卖家不承担服务费的订单：未发货的订单获取服务费为0，发货后就能获取到正确值。
	 */
	@ApiField("seller_cod_fee")
	private String sellerCodFee;

	/**
	 * 卖家邮件地址
	 */
	@ApiField("seller_email")
	private String sellerEmail;

	/**
	 * 卖家备注旗帜（与淘宝网上订单的卖家备注旗帜对应，只有卖家才能查看该字段）红、黄、绿、蓝、紫 分别对应 1、2、3、4、5
	 */
	@ApiField("seller_flag")
	private Long sellerFlag;

	/**
	 * 卖家备注（与淘宝网上订单的卖家备注对应，只有卖家才能查看该字段）
	 */
	@ApiField("seller_memo")
	private String sellerMemo;

	/**
	 * 卖家手机
	 */
	@ApiField("seller_mobile")
	private String sellerMobile;

	/**
	 * 卖家姓名
	 */
	@ApiField("seller_name")
	private String sellerName;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 卖家电话
	 */
	@ApiField("seller_phone")
	private String sellerPhone;

	/**
	 * 卖家是否已评价。可选值:true(已评价),false(未评价)
	 */
	@ApiField("seller_rate")
	private Boolean sellerRate;

	/**
	 * 订单将在此时间前发出，主要用于预售订单
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 服务子订单列表
	 */
	@ApiListField("service_orders")
	@ApiField("service_order")
	private List<ServiceOrder> serviceOrders;

	/**
	 * 物流标签
	 */
	@ApiListField("service_tags")
	@ApiField("logistics_tag")
	private List<LogisticsTag> serviceTags;

	/**
	 * serviceType
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * shareGroupHold
	 */
	@ApiField("share_group_hold")
	private Long shareGroupHold;

	/**
	 * 创建交易时的物流方式（交易完成前，物流方式有可能改变，但系统里的这个字段一直不变）。可选值：free(卖家包邮),post(平邮),express(快递),ems(EMS),virtual(虚拟发货)，25(次日必达)，26(预约配送)。
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * 线下自提门店编码
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 门店自提，总店发货，分店取货的门店自提订单标识
	 */
	@ApiField("shop_pick")
	private String shopPick;

	/**
	 * 物流运单号
	 */
	@ApiField("sid")
	private String sid;

	/**
	 * 签收时间
	 */
	@ApiField("sign_time")
	private String signTime;

	/**
	 * 交易快照详细信息
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 交易快照地址
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * sortInfo
	 */
	@ApiField("sort_info")
	private String sortInfo;

	/**
	 * 1已排序 2不排序
	 */
	@ApiField("sorted")
	private Long sorted;

	/**
	 * 交易状态。可选值: * TRADE_NO_CREATE_PAY(没有创建支付宝交易) * WAIT_BUYER_PAY(等待买家付款) * SELLER_CONSIGNED_PART(卖家部分发货) * WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) * WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) * TRADE_BUYER_SIGNED(买家已签收,货到付款专用) * TRADE_FINISHED(交易成功) * TRADE_CLOSED(付款以后用户退款成功，交易自动关闭) * TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易) * PAY_PENDING(国际信用卡支付付款确认中) * WAIT_PRE_AUTH_CONFIRM(0元购合约中)	* PAID_FORBID_CONSIGN(拼团中订单或者发货强管控的订单，已付款但禁止发货)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 分阶段付款的已付金额（万人团订单已付金额）
	 */
	@ApiField("step_paid_fee")
	private String stepPaidFee;

	/**
	 * 分阶段付款的订单状态（例如万人团订单等），目前有三返回状态FRONT_NOPAID_FINAL_NOPAID(定金未付尾款未付)，FRONT_PAID_FINAL_NOPAID(定金已付尾款未付)，FRONT_PAID_FINAL_PAID(定金和尾款都付)
	 */
	@ApiField("step_trade_status")
	private String stepTradeStatus;

	/**
	 * suningShopCode
	 */
	@ApiField("suning_shop_code")
	private String suningShopCode;

	/**
	 * suningShopValid
	 */
	@ApiField("suning_shop_valid")
	private Long suningShopValid;

	/**
	 * 天猫拼团拦截标示
	 */
	@ApiField("team_buy_hold")
	private Long teamBuyHold;

	/**
	 * threeplTiming
	 */
	@ApiField("threepl_timing")
	private Boolean threeplTiming;

	/**
	 * 交易编号 (父订单的交易编号)
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 同tid
	 */
	@ApiField("tid_str")
	private String tidStr;

	/**
	 * 超时到期时间。格式:yyyy-MM-dd HH:mm:ss。业务规则：前提条件：只有在买家已付款，卖家已发货的情况下才有效如果申请了退款，那么超时会落在子订单上；比如说3笔ABC，A申请了，那么返回的是BC的列表, 主定单不存在如果没有申请过退款，那么超时会挂在主定单上；比如ABC，返回主定单，ABC的超时和主定单相同
	 */
	@ApiField("timeout_action_time")
	private Date timeoutActionTime;

	/**
	 * 交易标题，以店铺名作为此标题的值。注:taobao.trades.get接口返回的Trade中的title是商品名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * tmallDelivery
	 */
	@ApiField("tmall_delivery")
	private Boolean tmallDelivery;

	/**
	 * TOP拦截标识，0不拦截，1拦截
	 */
	@ApiField("top_hold")
	private Long topHold;

	/**
	 * top定义订单类型
	 */
	@ApiField("toptype")
	private Long toptype;

	/**
	 * 商品金额（商品价格乘以数量的总金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * top动态字段
	 */
	@ApiField("trade_attr")
	private String tradeAttr;

	/**
	 * 交易扩展表信息
	 */
	@ApiField("trade_ext")
	private TradeExt tradeExt;

	/**
	 * 交易内部来源。WAP(手机);HITAO(嗨淘);TOP(TOP平台);TAOBAO(普通淘宝);JHS(聚划算)一笔订单可能同时有以上多个标记，则以逗号分隔
	 */
	@ApiField("trade_from")
	private String tradeFrom;

	/**
	 * 交易备注。
	 */
	@ApiField("trade_memo")
	private String tradeMemo;

	/**
	 * 交易外部来源：ownshop(商家官网)
	 */
	@ApiField("trade_source")
	private String tradeSource;

	/**
	 * 交易类型列表，同时查询多种交易类型可用逗号分隔。默认同时查询guarantee_trade, auto_delivery, ec, cod的4种交易类型的数据 可选值 fixed(一口价) auction(拍卖) guarantee_trade(一口价、拍卖) auto_delivery(自动发货) independent_simple_trade(旺店入门版交易) independent_shop_trade(旺店标准版交易) ec(直冲) cod(货到付款) fenxiao(分销) game_equipment(游戏装备) shopex_trade(ShopEX交易) netcn_trade(万网交易) external_trade(统一外部交易)o2o_offlinetrade（O2O交易）step (万人团)nopaid(无付款订单)pre_auth_type(预授权0元购机交易)
	 */
	@ApiField("type")
	private String type;

	/**
	 * ua
	 */
	@ApiField("ua")
	private String ua;

	/**
	 * 网厅订单垂直表信息
	 */
	@ApiField("wtt_param")
	private String wttParam;

	/**
	 * 订单的运费险，单位为元
	 */
	@ApiField("yfx_fee")
	private String yfxFee;

	/**
	 * 运费险支付号
	 */
	@ApiField("yfx_id")
	private String yfxId;

	/**
	 * 运费险类型
	 */
	@ApiField("yfx_type")
	private String yfxType;

	/**
	 * 优享购为true，否则false
	 */
	@ApiField("you_xiang")
	private Boolean youXiang;

	/**
	 * 在返回的trade对象上专门增加一个字段zero_purchase来区分，这个为true的就是0元购机预授权交易
	 */
	@ApiField("zero_purchase")
	private Boolean zeroPurchase;


	public String getAcookieId() {
		return this.acookieId;
	}
	public void setAcookieId(String acookieId) {
		this.acookieId = acookieId;
	}

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public Long getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(Long alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public Long getAlipayPoint() {
		return this.alipayPoint;
	}
	public void setAlipayPoint(Long alipayPoint) {
		this.alipayPoint = alipayPoint;
	}

	public String getAlipayUrl() {
		return this.alipayUrl;
	}
	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public String getAlipayWarnMsg() {
		return this.alipayWarnMsg;
	}
	public void setAlipayWarnMsg(String alipayWarnMsg) {
		this.alipayWarnMsg = alipayWarnMsg;
	}

	public String getAllowAppkeys() {
		return this.allowAppkeys;
	}
	public void setAllowAppkeys(String allowAppkeys) {
		this.allowAppkeys = allowAppkeys;
	}

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getArriveCutTime() {
		return this.arriveCutTime;
	}
	public void setArriveCutTime(String arriveCutTime) {
		this.arriveCutTime = arriveCutTime;
	}

	public Long getArriveInterval() {
		return this.arriveInterval;
	}
	public void setArriveInterval(Long arriveInterval) {
		this.arriveInterval = arriveInterval;
	}

	public String getAssembly() {
		return this.assembly;
	}
	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public Date getAsyncModified() {
		return this.asyncModified;
	}
	public void setAsyncModified(Date asyncModified) {
		this.asyncModified = asyncModified;
	}

	public String getAvailableConfirmFee() {
		return this.availableConfirmFee;
	}
	public void setAvailableConfirmFee(String availableConfirmFee) {
		this.availableConfirmFee = availableConfirmFee;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBuyerAlipayNo() {
		return this.buyerAlipayNo;
	}
	public void setBuyerAlipayNo(String buyerAlipayNo) {
		this.buyerAlipayNo = buyerAlipayNo;
	}

	public String getBuyerArea() {
		return this.buyerArea;
	}
	public void setBuyerArea(String buyerArea) {
		this.buyerArea = buyerArea;
	}

	public String getBuyerCodFee() {
		return this.buyerCodFee;
	}
	public void setBuyerCodFee(String buyerCodFee) {
		this.buyerCodFee = buyerCodFee;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public Long getBuyerFlag() {
		return this.buyerFlag;
	}
	public void setBuyerFlag(Long buyerFlag) {
		this.buyerFlag = buyerFlag;
	}

	public String getBuyerIp() {
		return this.buyerIp;
	}
	public void setBuyerIp(String buyerIp) {
		this.buyerIp = buyerIp;
	}

	public String getBuyerMemo() {
		return this.buyerMemo;
	}
	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}
	public void setBuyerObtainPointFee(Long buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public String getBuyerOpenUid() {
		return this.buyerOpenUid;
	}
	public void setBuyerOpenUid(String buyerOpenUid) {
		this.buyerOpenUid = buyerOpenUid;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public Boolean getCanRate() {
		return this.canRate;
	}
	public void setCanRate(Boolean canRate) {
		this.canRate = canRate;
	}

	public String getCloudStore() {
		return this.cloudStore;
	}
	public void setCloudStore(String cloudStore) {
		this.cloudStore = cloudStore;
	}

	public String getCnService() {
		return this.cnService;
	}
	public void setCnService(String cnService) {
		this.cnService = cnService;
	}

	public String getCodFee() {
		return this.codFee;
	}
	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getCodStatus() {
		return this.codStatus;
	}
	public void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}

	public String getCollectTime() {
		return this.collectTime;
	}
	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}
	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}

	public Long getConsignInterval() {
		return this.consignInterval;
	}
	public void setConsignInterval(Long consignInterval) {
		this.consignInterval = consignInterval;
	}

	public Date getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Long getCouponFee() {
		return this.couponFee;
	}
	public void setCouponFee(Long couponFee) {
		this.couponFee = couponFee;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreditCardFee() {
		return this.creditCardFee;
	}
	public void setCreditCardFee(String creditCardFee) {
		this.creditCardFee = creditCardFee;
	}

	public Boolean getCrossBondedDeclare() {
		return this.crossBondedDeclare;
	}
	public void setCrossBondedDeclare(Boolean crossBondedDeclare) {
		this.crossBondedDeclare = crossBondedDeclare;
	}

	public String getCutoffMinutes() {
		return this.cutoffMinutes;
	}
	public void setCutoffMinutes(String cutoffMinutes) {
		this.cutoffMinutes = cutoffMinutes;
	}

	public Long getDelayCreateDelivery() {
		return this.delayCreateDelivery;
	}
	public void setDelayCreateDelivery(Long delayCreateDelivery) {
		this.delayCreateDelivery = delayCreateDelivery;
	}

	public String getDeliveryCps() {
		return this.deliveryCps;
	}
	public void setDeliveryCps(String deliveryCps) {
		this.deliveryCps = deliveryCps;
	}

	public String getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getDispatchTime() {
		return this.dispatchTime;
	}
	public void setDispatchTime(String dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public String getDoneeNick() {
		return this.doneeNick;
	}
	public void setDoneeNick(String doneeNick) {
		this.doneeNick = doneeNick;
	}

	public String getDoneeOpenUid() {
		return this.doneeOpenUid;
	}
	public void setDoneeOpenUid(String doneeOpenUid) {
		this.doneeOpenUid = doneeOpenUid;
	}

	public String getEncryptAlipayId() {
		return this.encryptAlipayId;
	}
	public void setEncryptAlipayId(String encryptAlipayId) {
		this.encryptAlipayId = encryptAlipayId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEsDate() {
		return this.esDate;
	}
	public void setEsDate(String esDate) {
		this.esDate = esDate;
	}

	public String getEsRange() {
		return this.esRange;
	}
	public void setEsRange(String esRange) {
		this.esRange = esRange;
	}

	public String getEsTime() {
		return this.esTime;
	}
	public void setEsTime(String esTime) {
		this.esTime = esTime;
	}

	public String getEstConTime() {
		return this.estConTime;
	}
	public void setEstConTime(String estConTime) {
		this.estConTime = estConTime;
	}

	public String getEtPlateNumber() {
		return this.etPlateNumber;
	}
	public void setEtPlateNumber(String etPlateNumber) {
		this.etPlateNumber = etPlateNumber;
	}

	public String getEtSerTime() {
		return this.etSerTime;
	}
	public void setEtSerTime(String etSerTime) {
		this.etSerTime = etSerTime;
	}

	public Long getEtShopId() {
		return this.etShopId;
	}
	public void setEtShopId(Long etShopId) {
		this.etShopId = etShopId;
	}

	public String getEtShopName() {
		return this.etShopName;
	}
	public void setEtShopName(String etShopName) {
		this.etShopName = etShopName;
	}

	public String getEtType() {
		return this.etType;
	}
	public void setEtType(String etType) {
		this.etType = etType;
	}

	public String getEtVerifiedShopName() {
		return this.etVerifiedShopName;
	}
	public void setEtVerifiedShopName(String etVerifiedShopName) {
		this.etVerifiedShopName = etVerifiedShopName;
	}

	public String getEticketExt() {
		return this.eticketExt;
	}
	public void setEticketExt(String eticketExt) {
		this.eticketExt = eticketExt;
	}

	public String getEticketServiceAddr() {
		return this.eticketServiceAddr;
	}
	public void setEticketServiceAddr(String eticketServiceAddr) {
		this.eticketServiceAddr = eticketServiceAddr;
	}

	public String getExpressAgencyFee() {
		return this.expressAgencyFee;
	}
	public void setExpressAgencyFee(String expressAgencyFee) {
		this.expressAgencyFee = expressAgencyFee;
	}

	public Long getForbidConsign() {
		return this.forbidConsign;
	}
	public void setForbidConsign(Long forbidConsign) {
		this.forbidConsign = forbidConsign;
	}

	public Boolean getHasBuyerMessage() {
		return this.hasBuyerMessage;
	}
	public void setHasBuyerMessage(Boolean hasBuyerMessage) {
		this.hasBuyerMessage = hasBuyerMessage;
	}

	public Boolean getHasPostFee() {
		return this.hasPostFee;
	}
	public void setHasPostFee(Boolean hasPostFee) {
		this.hasPostFee = hasPostFee;
	}

	public Boolean getHasYfx() {
		return this.hasYfx;
	}
	public void setHasYfx(Boolean hasYfx) {
		this.hasYfx = hasYfx;
	}

	public String getHkBirthday() {
		return this.hkBirthday;
	}
	public void setHkBirthday(String hkBirthday) {
		this.hkBirthday = hkBirthday;
	}

	public String getHkCardCode() {
		return this.hkCardCode;
	}
	public void setHkCardCode(String hkCardCode) {
		this.hkCardCode = hkCardCode;
	}

	public String getHkCardType() {
		return this.hkCardType;
	}
	public void setHkCardType(String hkCardType) {
		this.hkCardType = hkCardType;
	}

	public String getHkChinaName() {
		return this.hkChinaName;
	}
	public void setHkChinaName(String hkChinaName) {
		this.hkChinaName = hkChinaName;
	}

	public String getHkEnName() {
		return this.hkEnName;
	}
	public void setHkEnName(String hkEnName) {
		this.hkEnName = hkEnName;
	}

	public String getHkFlightDate() {
		return this.hkFlightDate;
	}
	public void setHkFlightDate(String hkFlightDate) {
		this.hkFlightDate = hkFlightDate;
	}

	public String getHkFlightNo() {
		return this.hkFlightNo;
	}
	public void setHkFlightNo(String hkFlightNo) {
		this.hkFlightNo = hkFlightNo;
	}

	public String getHkGender() {
		return this.hkGender;
	}
	public void setHkGender(String hkGender) {
		this.hkGender = hkGender;
	}

	public String getHkPickup() {
		return this.hkPickup;
	}
	public void setHkPickup(String hkPickup) {
		this.hkPickup = hkPickup;
	}

	public String getHkPickupId() {
		return this.hkPickupId;
	}
	public void setHkPickupId(String hkPickupId) {
		this.hkPickupId = hkPickupId;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceName() {
		return this.invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public Boolean getIsBrandSale() {
		return this.isBrandSale;
	}
	public void setIsBrandSale(Boolean isBrandSale) {
		this.isBrandSale = isBrandSale;
	}

	public Boolean getIsDaixiao() {
		return this.isDaixiao;
	}
	public void setIsDaixiao(Boolean isDaixiao) {
		this.isDaixiao = isDaixiao;
	}

	public Boolean getIsForceWlb() {
		return this.isForceWlb;
	}
	public void setIsForceWlb(Boolean isForceWlb) {
		this.isForceWlb = isForceWlb;
	}

	public Boolean getIsGifit() {
		return this.isGifit;
	}
	public void setIsGifit(Boolean isGifit) {
		this.isGifit = isGifit;
	}

	public Boolean getIsGift() {
		return this.isGift;
	}
	public void setIsGift(Boolean isGift) {
		this.isGift = isGift;
	}

	public Boolean getIsIstore() {
		return this.isIstore;
	}
	public void setIsIstore(Boolean isIstore) {
		this.isIstore = isIstore;
	}

	public Boolean getIsLgtype() {
		return this.isLgtype;
	}
	public void setIsLgtype(Boolean isLgtype) {
		this.isLgtype = isLgtype;
	}

	public Boolean getIsO2oPassport() {
		return this.isO2oPassport;
	}
	public void setIsO2oPassport(Boolean isO2oPassport) {
		this.isO2oPassport = isO2oPassport;
	}

	public Boolean getIsPartConsign() {
		return this.isPartConsign;
	}
	public void setIsPartConsign(Boolean isPartConsign) {
		this.isPartConsign = isPartConsign;
	}

	public Boolean getIsShShip() {
		return this.isShShip;
	}
	public void setIsShShip(Boolean isShShip) {
		this.isShShip = isShShip;
	}

	public Boolean getIsWt() {
		return this.isWt;
	}
	public void setIsWt(Boolean isWt) {
		this.isWt = isWt;
	}

	public String getLgAging() {
		return this.lgAging;
	}
	public void setLgAging(String lgAging) {
		this.lgAging = lgAging;
	}

	public String getLgAgingType() {
		return this.lgAgingType;
	}
	public void setLgAgingType(String lgAgingType) {
		this.lgAgingType = lgAgingType;
	}

	public String getLinkedmallExtInfo() {
		return this.linkedmallExtInfo;
	}
	public void setLinkedmallExtInfo(String linkedmallExtInfo) {
		this.linkedmallExtInfo = linkedmallExtInfo;
	}

	public List<LogisticsInfo> getLogisticsInfos() {
		return this.logisticsInfos;
	}
	public void setLogisticsInfos(List<LogisticsInfo> logisticsInfos) {
		this.logisticsInfos = logisticsInfos;
	}

	public String getMarkDesc() {
		return this.markDesc;
	}
	public void setMarkDesc(String markDesc) {
		this.markDesc = markDesc;
	}

	public String getMarket() {
		return this.market;
	}
	public void setMarket(String market) {
		this.market = market;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Boolean getNewPresell() {
		return this.newPresell;
	}
	public void setNewPresell(Boolean newPresell) {
		this.newPresell = newPresell;
	}

	public String getNrNoHandle() {
		return this.nrNoHandle;
	}
	public void setNrNoHandle(String nrNoHandle) {
		this.nrNoHandle = nrNoHandle;
	}

	public String getNrOffline() {
		return this.nrOffline;
	}
	public void setNrOffline(String nrOffline) {
		this.nrOffline = nrOffline;
	}

	public String getNrShopGuideId() {
		return this.nrShopGuideId;
	}
	public void setNrShopGuideId(String nrShopGuideId) {
		this.nrShopGuideId = nrShopGuideId;
	}

	public String getNrShopGuideName() {
		return this.nrShopGuideName;
	}
	public void setNrShopGuideName(String nrShopGuideName) {
		this.nrShopGuideName = nrShopGuideName;
	}

	public String getNrShopId() {
		return this.nrShopId;
	}
	public void setNrShopId(String nrShopId) {
		this.nrShopId = nrShopId;
	}

	public String getNrShopName() {
		return this.nrShopName;
	}
	public void setNrShopName(String nrShopName) {
		this.nrShopName = nrShopName;
	}

	public String getNrStoreOrderId() {
		return this.nrStoreOrderId;
	}
	public void setNrStoreOrderId(String nrStoreOrderId) {
		this.nrStoreOrderId = nrStoreOrderId;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getNutFeature() {
		return this.nutFeature;
	}
	public void setNutFeature(String nutFeature) {
		this.nutFeature = nutFeature;
	}

	public String getO2o() {
		return this.o2o;
	}
	public void setO2o(String o2o) {
		this.o2o = o2o;
	}

	public String getO2oContract() {
		return this.o2oContract;
	}
	public void setO2oContract(String o2oContract) {
		this.o2oContract = o2oContract;
	}

	public String getO2oDelivery() {
		return this.o2oDelivery;
	}
	public void setO2oDelivery(String o2oDelivery) {
		this.o2oDelivery = o2oDelivery;
	}

	public String getO2oEtOrderId() {
		return this.o2oEtOrderId;
	}
	public void setO2oEtOrderId(String o2oEtOrderId) {
		this.o2oEtOrderId = o2oEtOrderId;
	}

	public String getO2oGuideId() {
		return this.o2oGuideId;
	}
	public void setO2oGuideId(String o2oGuideId) {
		this.o2oGuideId = o2oGuideId;
	}

	public String getO2oGuideName() {
		return this.o2oGuideName;
	}
	public void setO2oGuideName(String o2oGuideName) {
		this.o2oGuideName = o2oGuideName;
	}

	public String getO2oOutTradeId() {
		return this.o2oOutTradeId;
	}
	public void setO2oOutTradeId(String o2oOutTradeId) {
		this.o2oOutTradeId = o2oOutTradeId;
	}

	public String getO2oServiceAddress() {
		return this.o2oServiceAddress;
	}
	public void setO2oServiceAddress(String o2oServiceAddress) {
		this.o2oServiceAddress = o2oServiceAddress;
	}

	public String getO2oServiceCity() {
		return this.o2oServiceCity;
	}
	public void setO2oServiceCity(String o2oServiceCity) {
		this.o2oServiceCity = o2oServiceCity;
	}

	public String getO2oServiceDistrict() {
		return this.o2oServiceDistrict;
	}
	public void setO2oServiceDistrict(String o2oServiceDistrict) {
		this.o2oServiceDistrict = o2oServiceDistrict;
	}

	public String getO2oServiceMobile() {
		return this.o2oServiceMobile;
	}
	public void setO2oServiceMobile(String o2oServiceMobile) {
		this.o2oServiceMobile = o2oServiceMobile;
	}

	public String getO2oServiceName() {
		return this.o2oServiceName;
	}
	public void setO2oServiceName(String o2oServiceName) {
		this.o2oServiceName = o2oServiceName;
	}

	public String getO2oServiceState() {
		return this.o2oServiceState;
	}
	public void setO2oServiceState(String o2oServiceState) {
		this.o2oServiceState = o2oServiceState;
	}

	public String getO2oServiceTown() {
		return this.o2oServiceTown;
	}
	public void setO2oServiceTown(String o2oServiceTown) {
		this.o2oServiceTown = o2oServiceTown;
	}

	public String getO2oShopId() {
		return this.o2oShopId;
	}
	public void setO2oShopId(String o2oShopId) {
		this.o2oShopId = o2oShopId;
	}

	public String getO2oShopName() {
		return this.o2oShopName;
	}
	public void setO2oShopName(String o2oShopName) {
		this.o2oShopName = o2oShopName;
	}

	public String getO2oSnatchStatus() {
		return this.o2oSnatchStatus;
	}
	public void setO2oSnatchStatus(String o2oSnatchStatus) {
		this.o2oSnatchStatus = o2oSnatchStatus;
	}

	public String getO2oStepOrderId() {
		return this.o2oStepOrderId;
	}
	public void setO2oStepOrderId(String o2oStepOrderId) {
		this.o2oStepOrderId = o2oStepOrderId;
	}

	public String getO2oStepTradeDetail() {
		return this.o2oStepTradeDetail;
	}
	public void setO2oStepTradeDetail(String o2oStepTradeDetail) {
		this.o2oStepTradeDetail = o2oStepTradeDetail;
	}

	public String getO2oStepTradeDetailNew() {
		return this.o2oStepTradeDetailNew;
	}
	public void setO2oStepTradeDetailNew(String o2oStepTradeDetailNew) {
		this.o2oStepTradeDetailNew = o2oStepTradeDetailNew;
	}

	public String getO2oVoucherPrice() {
		return this.o2oVoucherPrice;
	}
	public void setO2oVoucherPrice(String o2oVoucherPrice) {
		this.o2oVoucherPrice = o2oVoucherPrice;
	}

	public String getO2oXiaopiao() {
		return this.o2oXiaopiao;
	}
	public void setO2oXiaopiao(String o2oXiaopiao) {
		this.o2oXiaopiao = o2oXiaopiao;
	}

	public String getObs() {
		return this.obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}

	public Long getOfpHold() {
		return this.ofpHold;
	}
	public void setOfpHold(Long ofpHold) {
		this.ofpHold = ofpHold;
	}

	public String getOmniAttr() {
		return this.omniAttr;
	}
	public void setOmniAttr(String omniAttr) {
		this.omniAttr = omniAttr;
	}

	public String getOmniParam() {
		return this.omniParam;
	}
	public void setOmniParam(String omniParam) {
		this.omniParam = omniParam;
	}

	public String getOmnichannelParam() {
		return this.omnichannelParam;
	}
	public void setOmnichannelParam(String omnichannelParam) {
		this.omnichannelParam = omnichannelParam;
	}

	public String getOrderTaxFee() {
		return this.orderTaxFee;
	}
	public void setOrderTaxFee(String orderTaxFee) {
		this.orderTaxFee = orderTaxFee;
	}

	public String getOrderTaxPromotionFee() {
		return this.orderTaxPromotionFee;
	}
	public void setOrderTaxPromotionFee(String orderTaxPromotionFee) {
		this.orderTaxPromotionFee = orderTaxPromotionFee;
	}

	public List<Order> getOrders() {
		return this.orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getOsDate() {
		return this.osDate;
	}
	public void setOsDate(String osDate) {
		this.osDate = osDate;
	}

	public String getOsRange() {
		return this.osRange;
	}
	public void setOsRange(String osRange) {
		this.osRange = osRange;
	}

	public String getPaidCouponFee() {
		return this.paidCouponFee;
	}
	public void setPaidCouponFee(String paidCouponFee) {
		this.paidCouponFee = paidCouponFee;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Long getPccAf() {
		return this.pccAf;
	}
	public void setPccAf(Long pccAf) {
		this.pccAf = pccAf;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPlatformSubsidyFee() {
		return this.platformSubsidyFee;
	}
	public void setPlatformSubsidyFee(String platformSubsidyFee) {
		this.platformSubsidyFee = platformSubsidyFee;
	}

	public Long getPointFee() {
		return this.pointFee;
	}
	public void setPointFee(Long pointFee) {
		this.pointFee = pointFee;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Boolean getPostGateDeclare() {
		return this.postGateDeclare;
	}
	public void setPostGateDeclare(Boolean postGateDeclare) {
		this.postGateDeclare = postGateDeclare;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPromotion() {
		return this.promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public List<PromotionDetail> getPromotionDetails() {
		return this.promotionDetails;
	}
	public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public Long getRealPointFee() {
		return this.realPointFee;
	}
	public void setRealPointFee(Long realPointFee) {
		this.realPointFee = realPointFee;
	}

	public String getReceivedPayment() {
		return this.receivedPayment;
	}
	public void setReceivedPayment(String receivedPayment) {
		this.receivedPayment = receivedPayment;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverCountry() {
		return this.receiverCountry;
	}
	public void setReceiverCountry(String receiverCountry) {
		this.receiverCountry = receiverCountry;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverState() {
		return this.receiverState;
	}
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getReceiverTown() {
		return this.receiverTown;
	}
	public void setReceiverTown(String receiverTown) {
		this.receiverTown = receiverTown;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getRechargeFee() {
		return this.rechargeFee;
	}
	public void setRechargeFee(String rechargeFee) {
		this.rechargeFee = rechargeFee;
	}

	public String getRetailDeviceId() {
		return this.retailDeviceId;
	}
	public void setRetailDeviceId(String retailDeviceId) {
		this.retailDeviceId = retailDeviceId;
	}

	public String getRetailGuideId() {
		return this.retailGuideId;
	}
	public void setRetailGuideId(String retailGuideId) {
		this.retailGuideId = retailGuideId;
	}

	public String getRetailOutOrderId() {
		return this.retailOutOrderId;
	}
	public void setRetailOutOrderId(String retailOutOrderId) {
		this.retailOutOrderId = retailOutOrderId;
	}

	public String getRetailStoreCode() {
		return this.retailStoreCode;
	}
	public void setRetailStoreCode(String retailStoreCode) {
		this.retailStoreCode = retailStoreCode;
	}

	public String getRetailStoreId() {
		return this.retailStoreId;
	}
	public void setRetailStoreId(String retailStoreId) {
		this.retailStoreId = retailStoreId;
	}

	public String getRxAuditStatus() {
		return this.rxAuditStatus;
	}
	public void setRxAuditStatus(String rxAuditStatus) {
		this.rxAuditStatus = rxAuditStatus;
	}

	public String getSellerAlipayNo() {
		return this.sellerAlipayNo;
	}
	public void setSellerAlipayNo(String sellerAlipayNo) {
		this.sellerAlipayNo = sellerAlipayNo;
	}

	public Boolean getSellerCanRate() {
		return this.sellerCanRate;
	}
	public void setSellerCanRate(Boolean sellerCanRate) {
		this.sellerCanRate = sellerCanRate;
	}

	public String getSellerCodFee() {
		return this.sellerCodFee;
	}
	public void setSellerCodFee(String sellerCodFee) {
		this.sellerCodFee = sellerCodFee;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public Long getSellerFlag() {
		return this.sellerFlag;
	}
	public void setSellerFlag(Long sellerFlag) {
		this.sellerFlag = sellerFlag;
	}

	public String getSellerMemo() {
		return this.sellerMemo;
	}
	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
	}

	public String getSellerMobile() {
		return this.sellerMobile;
	}
	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public List<ServiceOrder> getServiceOrders() {
		return this.serviceOrders;
	}
	public void setServiceOrders(List<ServiceOrder> serviceOrders) {
		this.serviceOrders = serviceOrders;
	}

	public List<LogisticsTag> getServiceTags() {
		return this.serviceTags;
	}
	public void setServiceTags(List<LogisticsTag> serviceTags) {
		this.serviceTags = serviceTags;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Long getShareGroupHold() {
		return this.shareGroupHold;
	}
	public void setShareGroupHold(Long shareGroupHold) {
		this.shareGroupHold = shareGroupHold;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getShopPick() {
		return this.shopPick;
	}
	public void setShopPick(String shopPick) {
		this.shopPick = shopPick;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getSortInfo() {
		return this.sortInfo;
	}
	public void setSortInfo(String sortInfo) {
		this.sortInfo = sortInfo;
	}
	public void setSortInfoString(String sortInfo) {
		this.sortInfo = sortInfo;
	}
	

	public Long getSorted() {
		return this.sorted;
	}
	public void setSorted(Long sorted) {
		this.sorted = sorted;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStepPaidFee() {
		return this.stepPaidFee;
	}
	public void setStepPaidFee(String stepPaidFee) {
		this.stepPaidFee = stepPaidFee;
	}

	public String getStepTradeStatus() {
		return this.stepTradeStatus;
	}
	public void setStepTradeStatus(String stepTradeStatus) {
		this.stepTradeStatus = stepTradeStatus;
	}

	public String getSuningShopCode() {
		return this.suningShopCode;
	}
	public void setSuningShopCode(String suningShopCode) {
		this.suningShopCode = suningShopCode;
	}

	public Long getSuningShopValid() {
		return this.suningShopValid;
	}
	public void setSuningShopValid(Long suningShopValid) {
		this.suningShopValid = suningShopValid;
	}

	public Long getTeamBuyHold() {
		return this.teamBuyHold;
	}
	public void setTeamBuyHold(Long teamBuyHold) {
		this.teamBuyHold = teamBuyHold;
	}

	public Boolean getThreeplTiming() {
		return this.threeplTiming;
	}
	public void setThreeplTiming(Boolean threeplTiming) {
		this.threeplTiming = threeplTiming;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTidStr() {
		return this.tidStr;
	}
	public void setTidStr(String tidStr) {
		this.tidStr = tidStr;
	}

	public Date getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(Date timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getTmallDelivery() {
		return this.tmallDelivery;
	}
	public void setTmallDelivery(Boolean tmallDelivery) {
		this.tmallDelivery = tmallDelivery;
	}

	public Long getTopHold() {
		return this.topHold;
	}
	public void setTopHold(Long topHold) {
		this.topHold = topHold;
	}

	public Long getToptype() {
		return this.toptype;
	}
	public void setToptype(Long toptype) {
		this.toptype = toptype;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeAttr() {
		return this.tradeAttr;
	}
	public void setTradeAttr(String tradeAttr) {
		this.tradeAttr = tradeAttr;
	}
	public void setTradeAttrString(String tradeAttr) {
		this.tradeAttr = tradeAttr;
	}
	

	public TradeExt getTradeExt() {
		return this.tradeExt;
	}
	public void setTradeExt(TradeExt tradeExt) {
		this.tradeExt = tradeExt;
	}

	public String getTradeFrom() {
		return this.tradeFrom;
	}
	public void setTradeFrom(String tradeFrom) {
		this.tradeFrom = tradeFrom;
	}

	public String getTradeMemo() {
		return this.tradeMemo;
	}
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String getTradeSource() {
		return this.tradeSource;
	}
	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUa() {
		return this.ua;
	}
	public void setUa(String ua) {
		this.ua = ua;
	}

	public String getWttParam() {
		return this.wttParam;
	}
	public void setWttParam(String wttParam) {
		this.wttParam = wttParam;
	}

	public String getYfxFee() {
		return this.yfxFee;
	}
	public void setYfxFee(String yfxFee) {
		this.yfxFee = yfxFee;
	}

	public String getYfxId() {
		return this.yfxId;
	}
	public void setYfxId(String yfxId) {
		this.yfxId = yfxId;
	}

	public String getYfxType() {
		return this.yfxType;
	}
	public void setYfxType(String yfxType) {
		this.yfxType = yfxType;
	}

	public Boolean getYouXiang() {
		return this.youXiang;
	}
	public void setYouXiang(Boolean youXiang) {
		this.youXiang = youXiang;
	}

	public Boolean getZeroPurchase() {
		return this.zeroPurchase;
	}
	public void setZeroPurchase(Boolean zeroPurchase) {
		this.zeroPurchase = zeroPurchase;
	}

}
