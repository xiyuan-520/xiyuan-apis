package com.xiyuan.taobao.api.tools;

import org.zhiqim.kernel.json.Jsons;

import com.xiyuan.taobao.api.TaobaoResponse;

public class TopAuthTokenCreateResponse extends TaobaoResponse
{
    private String token_result;
    protected void buildResponse(String json)
    {
        setToken_result(Jsons.getString(json, "token_result"));
    }
    public String getToken_result()
    {
        return token_result;
    }
    public void setToken_result(String token_result)
    {
        this.token_result = token_result;
    }
}
