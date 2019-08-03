package com.xiyuan.taobao.api;

import org.zhiqim.kernel.util.Validates;

/*****
 * 公用错误响应
 * 
 * @author lgz 2019年7月31日 新建与整理
 */

public class ErrorResponse
{
    private int code;
    private String msg;
    private String subCode;
    private String subMsg;
    private String args;

    public ErrorResponse()
    {
    }

    public ErrorResponse(int code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public ErrorResponse(int code, String msg, String subCode, String subMsg, String args)
    {
        this.code = code;
        this.msg = msg;
        this.subCode = subCode;
        this.subMsg = subMsg;
        this.args = args;
    }

    public int getCode()
    {
        return this.code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return this.msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public String getSubCode()
    {
        return this.subCode;
    }

    public void setSubCode(String subCode)
    {
        this.subCode = subCode;
    }

    public String getSubMsg()
    {
        return this.subMsg;
    }

    public void setSubMsg(String subMsg)
    {
        this.subMsg = subMsg;
    }

    public String getArgs()
    {
        return this.args;
    }

    public void setArgs(String args)
    {
        this.args = args;
    }

    public boolean isUserFail()
    {
        if ("session-expired".equals(this.subCode))
        {
            return true;
        }
        if ("invalid-sessionkey".equals(this.subCode))
        {
            return true;
        }
        if ("session-not-exist".equals(this.subCode))
        {
            return true;
        }
        if ("isv.shop-not-exist".equals(this.subCode))
        {
            return true;
        }
        return false;
    }

    public boolean isTaobaoFail()
    {
        if ("isp.item-update-service-error:GENERIC_FAILURE".equals(this.subCode))
        {
            return true;
        }
        if ("accesscontrol.limited-by-api-access-count".equals(this.subCode))
        {
            return true;
        }
        if ("accesscontrol.limited-by-dynamic-access-count".equals(this.subCode))
        {
            return true;
        }
        if ("isp.top-remote-connection-timeout-tmall".equals(this.subCode))
        {
            return true;
        }
        if ("isp.top-remote-connection-timeout".equals(this.subCode))
        {
            return true;
        }
        if ("isp.top-remote-service-unavailable".equals(this.subCode))
        {
            return true;
        }
        if ("isp.remote-service-error".equals(this.subCode))
        {
            return true;
        }
        if ("isp.remote-service-timeout".equals(this.subCode))
        {
            return true;
        }
        if ("isp.remote-connection-error".equals(this.subCode))
        {
            return true;
        }
        if ("isp.null-pointer-exception".equals(this.subCode))
        {
            return true;
        }
        if ("isp.top-remote-connection-error".equals(this.subCode))
        {
            return true;
        }
        if ("isp.unknown-error".equals(this.subCode))
        {
            return true;
        }
        if (!Validates.isEmpty(this.subMsg))
        {
            if ((this.subMsg.indexOf("系统错误，请稍后再试") != -1) || (this.subMsg.indexOf("系统繁忙，请稍候再次尝试") != -1))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isGetFail()
    {
        if (isNotExist())
        {
            return true;
        }
        if ("isv.item-is-delete:invalid-numIid-or-iid".equals(this.subCode))
        {
            return true;
        }
        if ("isv.item-is-delete:invalid-numIid-or-iid-tmall".equals(this.subCode))
        {
            return true;
        }
        if ("isv.pictureServiceClient-service-error:PICTURE_QUERY_PICTURE_FAILED".equals(this.subCode))
        {
            return true;
        }
        if ((Validates.isNotEmpty(this.subCode)) && (this.subCode.contains("ITEM_NOT_FOUND")))
        {
            return true;
        }
        if ("isv.invalid-parameters:item_delete".equals(this.subCode))
        {
            return true;
        }
        return false;
    }

    public boolean hasNoPermission()
    {
        if ((Validates.isNotEmpty(this.subCode)) && (this.subCode.contains("has-no-permission")))
        {
            return true;
        }
        return false;
    }

    public boolean isUpdateFail()
    {
        if ("isv.item-update-service-error:IC_LIMIT_FOR_DPC".equals(this.subCode))
        {
            return true;
        }
        if ("isv.item-update-service-error:ITEM_PROPERTIES_ERROR".equals(this.subCode))
        {
            return true;
        }
        if ("isv.item-update-service-error:IC_CHECKSTEP_SKU_PROP_NOT_FOUND_IN_ITEM".equals(this.subCode))
        {
            return true;
        }
        if ("isv.item-update-service-error:IC_PERMISSION_FOR_TBCP_ONLY".equals(this.subCode))
        {
            return true;
        }
        if ("isv.antisteal-service-error".equals(this.subCode))
        {
            return true;
        }
        if ("isv.error-food-security-required".equals(this.subCode))
        {
            return true;
        }
        return false;
    }

    public boolean isNotExist()
    {
        if (Validates.isEmpty(this.subCode))
        {
            return false;
        }
        if (this.subCode.contains("not-exist"))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "{error_response:{\"code\":" + this.code + ", \"msg\":\"" + this.msg + "\",\"subcode\":" + this.subCode + ", \"submsg\":\"" + this.subMsg + "\", \"args\":" + this.args + "}}";
    }
}
