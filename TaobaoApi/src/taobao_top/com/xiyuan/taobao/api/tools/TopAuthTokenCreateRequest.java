package com.xiyuan.taobao.api.tools;

import org.zhiqim.kernel.util.Asserts;

import com.xiyuan.taobao.api.TaobaoRequest;
import com.xiyuan.taobao.api.constants.ApiConatants;

/**
 * 参考文档：https://open.taobao.com/api.htm?spm=a219a.7386797.0.0.7181669axpg05w&source=search&docId=25388&docType=2
 * @author lgz 2019年8月1日 新建与整理
 *
 */
public class TopAuthTokenCreateRequest  extends TaobaoRequest<TopAuthTokenCreateResponse >
{   
    private String code;
    private String uuid;
    public String getMethod()
    {
        return ApiConatants.TAOBAO_TOP_AUTH_TOKEN_CREATE;
    }
    
    public TopAuthTokenCreateResponse getResponse()
    {
        return new TopAuthTokenCreateResponse();
    }

    public void buildSignBody()
    {
        addParam("code", code);
        addParam("uuid", uuid);
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }
}
