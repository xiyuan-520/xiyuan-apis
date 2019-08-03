package com.xiyuan.taobao.api;

import org.zhiqim.kernel.json.Jsons;
import org.zhiqim.kernel.util.Validates;

/***
 * 相应基类
 * 
 * @version v1.0.0 @author longguizhi 2018-12-2 新建与整理
 */

public abstract class TaobaoResponse
{
    private ErrorResponse error;
    private String responseText;

    /***留给子类实现**/
    protected abstract void buildResponse(String paramString);

    public void buildResponseError(int code, String msg, String subCode, String subMsg, String args)
    {
        this.error = new ErrorResponse(code, msg, subCode, subMsg, args);
    }

    public void buildResponseText(String responseText)
    {
        this.responseText = responseText;
        if (responseText.indexOf("error_response") != -1)
        {
            int code = Jsons.getInt(responseText, "code");
            String msg = Jsons.getString(responseText, "msg");
            String subCode = Jsons.getString(responseText, "sub_code");
            String subMsg = Jsons.getString(responseText, "sub_msg");
            String args = Jsons.getArray(responseText, "arg");

            this.error = new ErrorResponse(code, msg, subCode, subMsg, args);
        }
        else
        {
            buildResponse(responseText);
        }
    }

    public boolean isSuccess()
    {
        return this.error == null;
    }

    public int getErrorCode()
    {
        if (this.error == null)
        {
            return 0;
        }
        return this.error.getCode();
    }

    public String getSubCode()
    {
        if (this.error == null)
        {
            return "unknown";
        }
        return this.error.getSubCode();
    }

    public String getErrorMsg()
    {
        if (this.error == null)
        {
            return "unknown";
        }
        if (!Validates.isEmptyBlank(this.error.getSubMsg()))
        {
            return this.error.getSubMsg();
        }
        return this.error.getMsg();
    }

    public boolean isConnectionReset()
    {
        if (this.error == null)
        {
            return false;
        }
        return "Connection reset".equals(this.error.getMsg());
    }

    public boolean isBusinessRateFail()
    {
        if (this.error == null)
        {
            return false;
        }
        String subCode = this.error.getSubCode();
        if ("isv.rate-service-error:bussiness".equals(subCode))
        {
            return true;
        }
        return false;
    }

    public boolean isUserFail()
    {
        return this.error == null ? false : this.error.isUserFail();
    }

    public boolean isW2()
    {
        if (this.error == null)
        {
            return false;
        }
        String subCode = this.error.getSubCode();
        if ("isv.w2-security-authorize-invalid".equals(subCode))
        {
            return true;
        }
        return false;
    }

    public boolean isTaobaoFail()
    {
        return this.error == null ? false : this.error.isTaobaoFail();
    }

    public boolean isGetFail()
    {
        return this.error == null ? false : this.error.isGetFail();
    }

    public boolean isUpdateFail()
    {
        return this.error == null ? false : this.error.isUpdateFail();
    }

    public boolean hasNoPermission()
    {
        return this.error == null ? false : this.error.hasNoPermission();
    }

    public boolean isNotExist()
    {
        return this.error == null ? false : this.error.isNotExist();
    }

    public ErrorResponse getError()
    {
        return this.error;
    }

    public String toString()
    {
        if (this.error != null)
        {
            return this.error.toString();
        }
        return this.responseText;
    }
}