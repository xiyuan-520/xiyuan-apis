package com.xiyuan.taobao.api.user;

import com.xiyuan.taobao.api.TaobaoRequest;
import com.xiyuan.taobao.api.constants.ApiConatants;

/**
 * 参考文档 https://open.taobao.com/api.htm?docId=285&docType=2
 * 
 * @author lgz 2019年8月1日 新建与整理
 *
 */
public class AppstoreSubscribeGetRequest extends TaobaoRequest<AppstoreSubscribeGetRespnse>
{
    private String nick;
    private long leaseId;

    public String getMethod()
    {
        return ApiConatants.TAOBAO_APPSTORE_SUBSCRIBE_GET;
    }

    public String getNick()
    {
        return nick;
    }

    public void setNick(String nick)
    {
        this.nick = nick;
    }

    public long getLeaseId()
    {
        return leaseId;
    }

    public void setLeaseId(long leaseId)
    {
        this.leaseId = leaseId;
    }

    public AppstoreSubscribeGetRespnse getResponse()
    {
        return new AppstoreSubscribeGetRespnse();
    }

    public void buildSignBody()
    {
        addParam("nick", nick);
        if (this.leaseId > 0)
            addParam("leaseId", leaseId);
    }
}
