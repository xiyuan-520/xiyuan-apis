package com.xiyuan.taobao.api.user;

import com.xiyuan.taobao.api.TaobaoRequest;
import com.xiyuan.taobao.api.constants.ApiConatants;

/**
 * https://open.taobao.com/api.htm?docId=21348&docType=2
 * @author lgz 2019年8月1日 新建与整理
 *
 */
public class UserBuyerGetRequest extends TaobaoRequest<UserBuyerGetRespnse>
{
    private String fields;
    
    public String getMethod()
    {
        return ApiConatants.TAOBAO_USER_BUYER_GET;
    }

    public String getFields()
    {
        return fields;
    }

    public void setFields(String fields)
    {
        this.fields = fields;
    }
    
    public UserBuyerGetRespnse getResponse()
    {
        return new UserBuyerGetRespnse();
    }

    public void buildSignBody()
    {
        addParam("nick", fields);
    }
}
