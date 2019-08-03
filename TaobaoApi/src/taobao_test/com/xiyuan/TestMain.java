package com.xiyuan;

import org.zhiqim.kernel.Global;
import org.zhiqim.kernel.Servicer;
import org.zhiqim.kernel.config.Config;
import org.zhiqim.kernel.config.Group;

import com.xiyuan.taobao.api.TaobaoClient;
import com.xiyuan.taobao.api.TaobaoResponse;
import com.xiyuan.taobao.api.TaobaoServer;
import com.xiyuan.taobao.api.user.AppstoreSubscribeGetRequest;
import com.xiyuan.taobao.api.user.UserBuyerGetRequest;
import com.xiyuan.taobao.api.user.UserBuyerGetRespnse;

public class TestMain
{
    // <group id = "tmc"desc="JDP数据服务"><item key="tmcDb"value="orm"type="protected"desc="tmc数据库id配置"/>
    // <item key="tradeThread"value="1"type="protected"desc="jdpTrade处理线程数"/></group>
    //
    // <group id="jdp"desc="JDP数据服务">
    // <item key="jdpNameDbs"value="ins_0654d2w4_1"type="protected"desc="jdp实例名及对应的数据库连接索引,ins_0654d2w4_1"/>
    // <item key="tradeThread"value="1"type="protected"desc="jdpTrade处理线程数"/></group>
    //
    // <group id="taobao"desc="淘宝TOP相关配置">
    // <item key="appApiUrl"value="http://gw.api.taobao.com/router/rest"type="protected"desc="应用API调用地址"/>
    // <item key="appTokenUrl"value="https://oauth.taobao.com/token"type="protected"desc="应用登录认证和刷新授权调用地址"/>
    // <item key="appAuthorizeUrl"value="https://oauth.taobao.com/authorize"type="protected"desc="应用登录授权地址"/>
    // <item key="appRedirectUrl"value="http://test.redxyz.com/login.htm"type="protected"desc="应用授权回调地址"/>
    // <item key="appKey"value="12644408"type="protected"desc="应用编码"/>
    // <item key="appSecret"value="ea781bb6f9742239b7e0726fdd22df13"type="protected"desc="应用密钥"/>
    // <item key="appInvokeNum"value="3000000"type="protected"desc="应用每天调用量"/>
    // <item key="articleCode"value="ts-29914-3"type="protected"desc="收费代码,测试环境填空"/>
    //
    // <item key="secretServerUrl"value="https://eco.taobao.com/router/rest"type="protected"desc="获取解密秘钥地址"/>
    // <item key="randomNumber"value="ioSP1a0n16aRAEUBHVaHWcCXPqRk+A2n1NrdCSzW9xU="type="protected"desc="存储加密安全码"/>
    // <item key="secretForwardUrl"value="http://order.redxyz.com/topSecretForward.htm"type="protected"desc="存储加密TOP透传URL"/>
    //
    // <item key="forwardUrl"value="http://order.redxyz.com/topForward.htm"type="protected"desc="TOP透传URL"/></group>
    static Servicer service;

    private static void doInitServer() throws Exception
    {
        String groupId = "taobao";
        Group group = new Group(groupId);
        Config config = new Config("project");
        config.addGroup(group);
        Global.addConfig(config);

        group.add("appApiUrl", "http://gw.api.taobao.com/router/rest");
        group.add("appTokenUrl", "https://oauth.taobao.com/token");
        group.add("appAuthorizeUrl", "https://oauth.taobao.com/authorize");
        group.add("appRedirectUrl", "http://test.redxyz.com/login.htm");
        group.add("appKey", "12644408");
        group.add("appSecret", "ea781bb6f9742239b7e0726fdd22df13");
        group.add("appInvokeNum", "3000000");
        group.add("forwardUrl", "http://order.redxyz.com/topForward.htm");

        service = new TaobaoServer();
        service.setId(groupId);
        service.create();
    }

    private static void doDistoryServer() throws Exception
    {

        service.destroy();
    }

    public static void main(String[] args) throws Exception
    {
        doInitServer();
        doStart();
        doDistoryServer();
    }

    public static void doStart()
    {
        UserBuyerGetRequest req = new UserBuyerGetRequest();
        req.setFields("nick,sex");
//        req.setSession("6201009f5f4214985ZZ679ZZ6a4e00a4974ce917bc7fce93349213359");
        req.setSession("6200a096135623b30ZZd89gib03f43c5b44d621774e6adc3349213359");
        TaobaoClient client = new TaobaoClient();
        TaobaoResponse resp = client.execute(req);
        System.out.println(resp.isSuccess());
        System.out.println(resp);
    }
}
