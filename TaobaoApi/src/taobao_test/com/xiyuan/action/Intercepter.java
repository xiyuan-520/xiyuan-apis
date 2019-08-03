package com.xiyuan.action;

import org.zhiqim.httpd.HttpRequest;
import org.zhiqim.httpd.context.core.Interceptor;
import org.zhiqim.kernel.util.Urls;

import com.xiyuan.taobao.api.TaobaoServer;
import com.xiyuan.taobao.api.model.SessionToken;

public class Intercepter implements Interceptor
{
    public String getAccreditUrl(String state)
    {
        
        String url = TaobaoServer.getServer().getAppAuthorizeUrl();
        url = Urls.add(url, "response_type", "code");
        url = Urls.add(url, "state", "state");
        url = Urls.add(url, "view", "web");
        url = Urls.add(url, "client_id", TaobaoServer.getServer().getAppKey());
        url = Urls.add(url, "redirect_uri", TaobaoServer.getServer().getAppRedirectUrl());
        
        return url;
    }

    public void intercept(HttpRequest request) throws Exception
    {
        String uri = request.getRequestURL();
        System.out.println(uri);
        Object sessionToken = request.getAttribute("sessionToken");
        if (sessionToken == null || !(sessionToken instanceof SessionToken))
        {
            request.setRedirectTop(getAccreditUrl(null));
            return;
        }
    }

}
