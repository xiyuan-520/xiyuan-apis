package com.xiyuan.taobao.api.request;

import java.util.List;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.domain.ConfirmConsignGoodsDto;
import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.LogisticsConsignTcConfirmResponse;

/**
 * TOP API: taobao.logistics.consign.tc.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class LogisticsConsignTcConfirmRequest extends BaseTaobaoRequest<LogisticsConsignTcConfirmResponse>
{
    
    /** 
    * ERP的名称
     */
    private String appName;
    
    /** 
    * 扩展字段 K:V;
     */
    private String extendFields;
    
    /** 
    * 发货的包裹
     */
    private String goodsList;
    
    /** 
    * 已发货的外部订单号
     */
    private String outTradeNo;
    
    /** 
    * 货主id
     */
    private Long providerId;
    
    /** 
    * 卖家id
     */
    private Long sellerId;
    
    /** 
    * 待发货的淘宝主交易号
     */
    private Long tradeId;
    
    public void setAppName(String appName)
    {
        this.appName = appName;
    }
    
    public String getAppName()
    {
        return this.appName;
    }
    
    public void setExtendFields(String extendFields)
    {
        this.extendFields = extendFields;
    }
    
    public void setExtendFieldsString(String extendFields)
    {
        this.extendFields = extendFields;
    }
    
    public String getExtendFields()
    {
        return this.extendFields;
    }
    
    public void setGoodsList(String goodsList)
    {
        this.goodsList = goodsList;
    }
    
    public void setGoodsList(List<ConfirmConsignGoodsDto> goodsList)
    {
        this.goodsList = new JSONWriter(false, true).write(goodsList);
    }
    
    public String getGoodsList()
    {
        return this.goodsList;
    }
    
    public void setOutTradeNo(String outTradeNo)
    {
        this.outTradeNo = outTradeNo;
    }
    
    public String getOutTradeNo()
    {
        return this.outTradeNo;
    }
    
    public void setProviderId(Long providerId)
    {
        this.providerId = providerId;
    }
    
    public Long getProviderId()
    {
        return this.providerId;
    }
    
    public void setSellerId(Long sellerId)
    {
        this.sellerId = sellerId;
    }
    
    public Long getSellerId()
    {
        return this.sellerId;
    }
    
    public void setTradeId(Long tradeId)
    {
        this.tradeId = tradeId;
    }
    
    public Long getTradeId()
    {
        return this.tradeId;
    }
    
    public String getApiMethodName()
    {
        return "taobao.logistics.consign.tc.confirm";
    }
    
    public Map<String, String> getTextParams()
    {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("app_name", this.appName);
        txtParams.put("extend_fields", this.extendFields);
        txtParams.put("goods_list", this.goodsList);
        txtParams.put("out_trade_no", this.outTradeNo);
        txtParams.put("provider_id", this.providerId);
        txtParams.put("seller_id", this.sellerId);
        txtParams.put("trade_id", this.tradeId);
        if (this.udfParams != null)
        {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }
    
    public Class<LogisticsConsignTcConfirmResponse> getResponseClass()
    {
        return LogisticsConsignTcConfirmResponse.class;
    }
    
    public void check() throws ApiRuleException
    {
        RequestCheckUtils.checkNotEmpty(appName, "appName");
        RequestCheckUtils.checkObjectMaxListSize(goodsList, 20, "goodsList");
        RequestCheckUtils.checkNotEmpty(outTradeNo, "outTradeNo");
        RequestCheckUtils.checkNotEmpty(providerId, "providerId");
        RequestCheckUtils.checkNotEmpty(sellerId, "sellerId");
        RequestCheckUtils.checkNotEmpty(tradeId, "tradeId");
    }
    
}
