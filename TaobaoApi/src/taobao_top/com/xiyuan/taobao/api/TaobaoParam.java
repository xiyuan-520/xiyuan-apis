package com.xiyuan.taobao.api;

import org.zhiqim.kernel.json.Jsons;
import org.zhiqim.kernel.util.DateTimes;
import org.zhiqim.kernel.util.Validates;

public class TaobaoParam
{
    // 公共参数类型   参数名             是否必须                描述信息
    private String method;//                是                   API接口名称
    private String app_key;//               是                   TOP分配给应用的AppKey
    private String target_app_key;//                             被调用的目标AppKey，仅当被调用的API为第三方ISV提供时有效
    private String sign_method;//           是                   签名的摘要算法，可选值为：hmac，md5
    private String sign;//                  是                   API输入参数签名结果，签名算法介绍请 
    private String session;//                                    用户登录授权成功后，TOP颁发给应用的授权信息，详细介绍请点击这里。当此API的标签上注明：“需要授权”，则此参数必传；“不需要授权”，则此参数不需要传；“可选授权”，则此参数为可选
    private String timestamp;//             是                   时间戳，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8，例如：2015-01-01 12:00:00。淘宝API服务端允许客户端请求最大时间误差为10分钟
    private String format;//                                     响应格式。默认为xml格式，可选值：xml，json。
    private String v;//                     是                   API协议版本，可选值：2.0
    private String partner_id;//                                 合作伙伴身份标识
    private boolean simplify;//                                 是否采用精简JSON返回格式，仅当format=json时有效，默认值为：false
    public TaobaoParam(String method, String app_key, String sign)
    {
        super();
        this.method = method;
        this.app_key = app_key;
        this.sign_method = "md5";
        this.sign = sign;
        this.timestamp = DateTimes.getDateTimeString();
        this.format = "json";
        this.simplify = true;
        this.v = "2";
    }
    
    public boolean isValid()
    {
        if (Validates.isEmptyBlank(method))
            return false;
        
        if (Validates.isEmptyBlank(app_key))
            return false;
        
        if (Validates.isEmptyBlank(sign_method))
            return false;
        
        if (Validates.isEmptyBlank(sign))
            return false;
        if (Validates.isEmptyBlank(timestamp))
            return false;
        if (Validates.isEmptyBlank(v))
            return false;
        
        return true;
    }
    
    public String getMethod()
    {
        return method;
    }
    public void setMethod(String method)
    {
        this.method = method;
    }
    public String getApp_key()
    {
        return app_key;
    }
    public void setApp_key(String app_key)
    {
        this.app_key = app_key;
    }
    public String getTarget_app_key()
    {
        return target_app_key;
    }
    public void setTarget_app_key(String target_app_key)
    {
        this.target_app_key = target_app_key;
    }
    public String getSign_method()
    {
        return sign_method;
    }
    public void setSign_method(String sign_method)
    {
        this.sign_method = sign_method;
    }
    public String getSign()
    {
        return sign;
    }
    public void setSign(String sign)
    {
        this.sign = sign;
    }
    public String getSession()
    {
        return session;
    }
    public void setSession(String session)
    {
        this.session = session;
    }
    public String getTimestamp()
    {
        return timestamp;
    }
    public void setTimestamp(String timestamp)
    {
        this.timestamp = timestamp;
    }
    public String getFormat()
    {
        return format;
    }
    public void setFormat(String format)
    {
        this.format = format;
    }
    public String getV()
    {
        return v;
    }
    public void setV(String v)
    {
        this.v = v;
    }
    public String getPartner_id()
    {
        return partner_id;
    }
    public void setPartner_id(String partner_id)
    {
        this.partner_id = partner_id;
    }
    
    public boolean isSimplify()
    {
        return simplify;
    }

    public void setSimplify(boolean simplify)
    {
        this.simplify = simplify;
    }

    public String toString()
    {
        return Jsons.toString(this);
    }
}
