package com.xiyuan.taobao.api.request;

import java.util.Map;

import com.xiyuan.taobao.api.ApiRuleException;
import com.xiyuan.taobao.api.BaseTaobaoRequest;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

import com.xiyuan.taobao.api.response.WlbStoresBaseinfoGetResponse;

/**
 * TOP API: taobao.wlb.stores.baseinfo.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.26
 */
public class WlbStoresBaseinfoGetRequest extends BaseTaobaoRequest<WlbStoresBaseinfoGetResponse>
{
    
    /** 
    * 0.商家仓库.1.菜鸟仓库.2全部被划分的仓库
     */
    private Long type;
    
    public void setType(Long type)
    {
        this.type = type;
    }
    
    public Long getType()
    {
        return this.type;
    }
    
    public String getApiMethodName()
    {
        return "taobao.wlb.stores.baseinfo.get";
    }
    
    public Map<String, String> getTextParams()
    {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("type", this.type);
        if (this.udfParams != null)
        {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }
    
    public Class<WlbStoresBaseinfoGetResponse> getResponseClass()
    {
        return WlbStoresBaseinfoGetResponse.class;
    }
    
    public void check() throws ApiRuleException
    {
    }
    
}
