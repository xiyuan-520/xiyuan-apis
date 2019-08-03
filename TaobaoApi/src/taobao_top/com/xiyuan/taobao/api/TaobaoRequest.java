/*
 * 版权所有 (C) 2018 知启蒙(ZHIQIM) 保留所有权利。
 * 
 * 欢迎到知启蒙网站（https://www.zhiqim.com）购买正版软件，知启蒙还提供许多开源框架和软件。
 * 
 * 1、本软件产品所有源代码受《中华人民共和国著作权法》和其他有关法律、法规的保护，其所有知识产权归湖南知启蒙科技有限公司所有； 2、禁止复制和修改。不得复制修改、翻译或改编本软件所有源代码，或者基于本软件产品创作衍生作品； 3、禁止进行逆向工程。不得对本软件的源代码进行逆向工程、反编译或试图以其他方式发现软件的源代码；
 * 4、个别授权：如需进行商业性的销售、复制、分发，包括但不限于软件销售、预装、捆绑等，必须获得知启蒙的书面授权和许可； 5、保留权利：本注释未明示授权的其他一切权利仍归知启蒙所有，任何人使用其他权利时必须获得知启蒙的书面同意。
 */
package com.xiyuan.taobao.api;

import java.util.Map.Entry;
import java.util.TreeMap;

import org.zhiqim.kernel.json.Jsons;
import org.zhiqim.kernel.util.DateTimes;
import org.zhiqim.kernel.util.Urls;
import org.zhiqim.kernel.util.Validates;
import org.zhiqim.kernel.util.codes.MD5;

public abstract class TaobaoRequest<T extends TaobaoResponse>
{
    private String method;
    private String session;
    private String timestamp;
    private String format;
    private String v;
    private String sign;
    private String signMethod;
    private TreeMap<String, String> paramMap = new TreeMap<String, String>();
    private int connectResetTimes = 0;
    
    public TaobaoRequest()
    {
        this.timestamp = DateTimes.getDateTimeString();
        this.format = "json";
        this.v = "2.0";
        this.signMethod = "md5";
        this.method = getMethod();
    }

    public abstract String getMethod();
    public abstract T getResponse();
    public abstract void buildSignBody();
    
    /**接口参数外，另行添加 int参数 **/
    public void addApiOtherParam(String key, int value)
    {
        if (value == 0)
        {
            return;
        }
        this.paramMap.put(key, String.valueOf(value));
    }
    /**接口参数外，另行添加long参数 **/
    public void addApiOtherParam(String key, long value)
    {
        if (value == 0L)
            return;
        this.paramMap.put(key, String.valueOf(value));
    }
    /**接口参数外，另行添加boolean参数 **/
    public void addApiOtherParam(String key, boolean value)
    {
        this.paramMap.put(key, String.valueOf(value));
    }
    /**接口参数外，另行添加double参数 **/
    public void addApiOtherParam(String key, double value)
    {
        this.paramMap.put(key, String.valueOf(value));
    }
    /**接口参数外，另行添加byte[]参数 **/
    public void addApiOtherParam(String key, byte[] value)
    {
        if (value.length == 0)
        {
            return;
        }
        this.paramMap.put(key, value.toString());
    }
    /**接口参数外，另行添加Object参数 **/
    public void addApiOtherParam(String key, Object value)
    {
        if (value == null)
        {
            return;
        }
        this.paramMap.put(key, Jsons.toString(value));
    }
    /**接口参数外，另行添加String参数 **/
    public void addApiOtherParam(String key, String value)
    {
        if (Validates.isEmpty(value))
        {
            return;
        }
        this.paramMap.put(key, value);
    }
    
    protected void addParam(String key, int value)
    {
        if (value == 0)
        {
            return;
        }
        this.paramMap.put(key, String.valueOf(value));
    }
    protected void addParam(String key, long value)
    {
        if (value == 0L)
            return;
        this.paramMap.put(key, String.valueOf(value));
    }
    protected void addParam(String key, boolean value)
    {
        this.paramMap.put(key, String.valueOf(value));
    }
    protected void addParam(String key, double value)
    {
        this.paramMap.put(key, String.valueOf(value));
    }
    protected void addParam(String key, byte[] value)
    {
        if (value.length == 0)
        {
            return;
        }
        this.paramMap.put(key, value.toString());
    }
    protected void addParam(String key, Object value)
    {
        if (value == null)
        {
            return;
        }
        this.paramMap.put(key, Jsons.toString(value));
    }
    protected void addParam(String key, String value)
    {
        if (Validates.isEmpty(value))
        {
            return;
        }
        this.paramMap.put(key, value);
    }
    
    public void buildSign(String appKey, String appSecret)
    {
        addParam("method", this.method);
        addParam("session", this.session);
        addParam("timestamp", this.timestamp);
        addParam("format", this.format);
        addParam("app_key", appKey);
        addParam("v", this.v);
        addParam("sign_method", this.signMethod);

        buildSignBody();

        StringBuffer strb = new StringBuffer(appSecret);
        for (Entry<String, String> entry : this.paramMap.entrySet())
            strb.append((String) entry.getKey()).append((String) entry.getValue());

        strb.append(appSecret);

        this.sign = MD5.encodeUTF8(strb.toString()).toUpperCase();
    }

    public String buildQueryString()
    {
        StringBuffer strb = new StringBuffer("sign=").append(this.sign);
        for (Entry<String, String> entry : this.paramMap.entrySet())
        {
            String value = Urls.encodeUTF8(entry.getValue());
            strb.append("&").append((String) entry.getKey()).append("=").append(value);
        }
        return strb.toString();
    }

    public String getSession()
    {
        return this.session;
    }

    public void setSession(String session)
    {
        this.session = session;
    }

    public String getTimestamp()
    {
        return this.timestamp;
    }

    public String getFormat()
    {
        return this.format;
    }

    public String getV()
    {
        return this.v;
    }

    public String getSign()
    {
        return this.sign;
    }

    public boolean isOverConnectionTimes()
    {
        if (++this.connectResetTimes > 3)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return Jsons.toString(this);
    }
}
