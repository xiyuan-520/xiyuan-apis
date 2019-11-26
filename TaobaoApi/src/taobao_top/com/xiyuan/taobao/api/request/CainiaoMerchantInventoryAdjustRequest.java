package com.xiyuan.taobao.api.request;

import java.util.List;
import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.TaobaoObject;
import com.xiyuan.taobao.api.internal.mapping.ApiField;
import com.xiyuan.taobao.api.internal.util.RequestCheckUtils;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;
import com.xiyuan.taobao.api.internal.util.json.JSONWriter;
import com.xiyuan.taobao.api.response.CainiaoMerchantInventoryAdjustResponse;

/**
 * TOP API: cainiao.merchant.inventory.adjust request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.15
 */
public class CainiaoMerchantInventoryAdjustRequest extends BaseTaobaoRequest<CainiaoMerchantInventoryAdjustResponse>
{
    
    /** 
    * 商家仓编辑库存
     */
    private String adjustRequest;
    
    /** 
    * 调用方应用名
     */
    private String appName;
    
    /** 
    * 操作
     */
    private String operation;
    
    public void setAdjustRequest(String adjustRequest)
    {
        this.adjustRequest = adjustRequest;
    }
    
    public void setAdjustRequest(List<MerStoreInvAdjustDto> adjustRequest)
    {
        this.adjustRequest = new JSONWriter(false, true).write(adjustRequest);
    }
    
    public String getAdjustRequest()
    {
        return this.adjustRequest;
    }
    
    public void setAppName(String appName)
    {
        this.appName = appName;
    }
    
    public String getAppName()
    {
        return this.appName;
    }
    
    public void setOperation(String operation)
    {
        this.operation = operation;
    }
    
    public String getOperation()
    {
        return this.operation;
    }
    
    public String getApiMethodName()
    {
        return "cainiao.merchant.inventory.adjust";
    }
    
    public Map<String, String> getTextParams()
    {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adjust_request", this.adjustRequest);
        txtParams.put("app_name", this.appName);
        txtParams.put("operation", this.operation);
        if (this.udfParams != null)
        {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }
    
    public Class<CainiaoMerchantInventoryAdjustResponse> getResponseClass()
    {
        return CainiaoMerchantInventoryAdjustResponse.class;
    }
    
    public void check() throws ApiRuleException
    {
        RequestCheckUtils.checkObjectMaxListSize(adjustRequest, 20, "adjustRequest");
        RequestCheckUtils.checkNotEmpty(appName, "appName");
    }
    
    /**
    * 商家仓编辑库存
    *
    * @author top auto create
    * @since 1.0, null
    */
    public static class MerStoreInvAdjustDto extends TaobaoObject
    {
        
        private static final long serialVersionUID = 3336139595355784872L;
        
        /**
        	 * 扩展属性
        	 */
        @ApiField("attribute")
        private String attribute;
        /**
         * 库存类型
         */
        @ApiField("inventory_type")
        private Long inventoryType;
        /**
         * 外部操作唯一编码
         */
        @ApiField("out_biz_code")
        private String outBizCode;
        /**
         * 数量
         */
        @ApiField("quantity")
        private Long quantity;
        /**
         * 货品id
         */
        @ApiField("sc_item_id")
        private Long scItemId;
        /**
         * 仓库编码
         */
        @ApiField("store_code")
        private String storeCode;
        
        public String getAttribute()
        {
            return this.attribute;
        }
        
        public void setAttribute(String attribute)
        {
            this.attribute = attribute;
        }
        
        public void setAttributeString(String attribute)
        {
            this.attribute = attribute;
        }
        
        public Long getInventoryType()
        {
            return this.inventoryType;
        }
        
        public void setInventoryType(Long inventoryType)
        {
            this.inventoryType = inventoryType;
        }
        
        public String getOutBizCode()
        {
            return this.outBizCode;
        }
        
        public void setOutBizCode(String outBizCode)
        {
            this.outBizCode = outBizCode;
        }
        
        public Long getQuantity()
        {
            return this.quantity;
        }
        
        public void setQuantity(Long quantity)
        {
            this.quantity = quantity;
        }
        
        public Long getScItemId()
        {
            return this.scItemId;
        }
        
        public void setScItemId(Long scItemId)
        {
            this.scItemId = scItemId;
        }
        
        public String getStoreCode()
        {
            return this.storeCode;
        }
        
        public void setStoreCode(String storeCode)
        {
            this.storeCode = storeCode;
        }
        
    }
    
}
