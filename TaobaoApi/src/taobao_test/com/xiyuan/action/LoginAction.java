package com.xiyuan.action;

import org.zhiqim.httpd.HttpRequest;
import org.zhiqim.httpd.context.core.Action;
import org.zhiqim.kernel.httpclient.HttpResult;
import org.zhiqim.kernel.logging.Log;
import org.zhiqim.kernel.logging.LogFactory;
import org.zhiqim.kernel.util.Asserts;
import org.zhiqim.kernel.util.Validates;

import com.xiyuan.taobao.api.TaobaoServer;
import com.xiyuan.taobao.api.TaobaoService;
import com.xiyuan.taobao.api.model.SessionToken;
import com.xiyuan.taobao.api.tools.TopAuthTokenCreateRequest;
import com.xiyuan.taobao.api.tools.TopAuthTokenCreateResponse;

public class LoginAction implements Action
{
    protected static final Log log = LogFactory.getLog(LoginAction.class);

    public void execute(HttpRequest request) throws Exception
    {
        Asserts.assertNotNull(TaobaoServer.getServer(), "淘宝服务尚未初始化");
        String errorUrl = "/error.htm";// 跳转订购页面
        String state = request.getParameter("state");
        String code = request.getParameter("code");
        String redirectUrl = "/index.htm";

        System.out.println("\r\n======================================================");
        System.out.println("授权登录 state:" + state);
        System.out.println("授权登录 code:" + code);
        if (Validates.isUrl(state))
            redirectUrl = state;
        System.out.println("======================================================\r\n");
        
        
       
        // 淘宝认证
        HttpResult result = TaobaoService.authorizationCode(code, state);
        System.out.println("淘宝登录认证结果：" + result.isSuccess());
        System.out.println("======================================================\r\n");
        if (!result.isSuccess())
        {
            log.error("读取OAuth时失败:[responseState=" + result.getResponseStatus() + "]");
            request.setRedirectTop(errorUrl);
            return;
        }

        String token = result.getResponseText();
        if (Validates.isEmpty(token))
        {
            log.error("读取OAuth时失败:token=" + token);
            request.setRedirectTop(errorUrl);
            return;
        }
        
        //解析 
        SessionToken sessionToken = SessionToken.parseSessionToken(token);
        if (sessionToken.isInValid())
        {
            log.error("解析淘宝参数时未找到用户编号或用户昵称");
            request.setRedirectTop(errorUrl);
            return;
        }
        
        System.out.println(sessionToken);
        String nick = sessionToken.getNick();
        if (sessionToken.isInValidParam())
        {
            log.error("解析淘宝参数时未找到accessToken或refreshToken数据:[%s]", nick);
            request.setRedirectTop(errorUrl);
            return;
        }
        request.setRedirectTop(redirectUrl);
    }

}
