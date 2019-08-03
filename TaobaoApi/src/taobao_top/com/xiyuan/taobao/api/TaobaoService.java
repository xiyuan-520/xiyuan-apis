package com.xiyuan.taobao.api;

import java.util.TreeMap;

import org.zhiqim.kernel.Global;
import org.zhiqim.kernel.extend.HashMapSO;
import org.zhiqim.kernel.httpclient.HttpPost;
import org.zhiqim.kernel.httpclient.HttpResult;
import org.zhiqim.kernel.util.Asserts;
import org.zhiqim.kernel.util.Urls;
import org.zhiqim.kernel.util.Validates;

public class TaobaoService
{
    public static HttpResult invokeTaobaoService(String queryString)
    {
        
        return null;
    }

    public static HttpResult invokeToken(String queryString)
    {
        Asserts.assertNotNull(TaobaoServer.getServer(), "淘宝服务尚未初始化不允许调用");
        HttpPost conn = new HttpPost(TaobaoServer.getServer().getAppTokenUrl());

        conn.setConnectionClose();
        conn.setConnectTimeout(TaobaoServer.getServer().getAppConnectTimeout());
        conn.setReadTimeout(TaobaoServer.getServer().getAppReadTimeout());
        conn.setQueryString(queryString, "UTF-8");
        conn.execute();
        
        return  conn.getResult();
    }

    public static HttpResult authorizationCode(String code, String state)
    {
        Asserts.assertNotNull(TaobaoServer.getServer(), "淘宝服务尚未初始化不允许调用");
        TreeMap<String, Object> paramMap = new TreeMap<String, Object>();
        paramMap.put("client_id", TaobaoServer.getServer().getAppKey());
        paramMap.put("client_secret", TaobaoServer.getServer().getAppSecret());
        paramMap.put("grant_type", "authorization_code");
        paramMap.put("code", code);
        paramMap.put("redirect_uri", TaobaoServer.getServer().getAppRedirectUrl());
        paramMap.put("state", state);
        paramMap.put("view", "web");
        
        //业务参数
        if (!Validates.isEmpty(TaobaoServer.getServer().getAppScope()))
            paramMap.put("scope", TaobaoServer.getServer().getAppScope());

        String queryString = Urls.toSignString(paramMap);
        return invokeToken(queryString);
    }

    public static <T extends TaobaoResponse> T invokeTaobaoService(TaobaoRequest<T> request)
    {
        return new TaobaoClient().execute(request);
    }

    public static <T extends TaobaoResponse> T invokeTaobaoSecretService(TaobaoRequest<T> request)
    {
        return new TaobaoClient().execute(request);
    }

    public static String invokeTaobaoPageGet(HashMapSO paramHashMapSO)
    {
        return null;
    }

    public static String invokeTaobaoSecretService(String queryString)
    {
        return null;
    }

}
