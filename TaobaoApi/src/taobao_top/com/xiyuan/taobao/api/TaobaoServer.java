package com.xiyuan.taobao.api;

import org.zhiqim.kernel.Global;
import org.zhiqim.kernel.Servicer;
import org.zhiqim.kernel.config.Group;
import org.zhiqim.kernel.logging.Log;
import org.zhiqim.kernel.logging.LogFactory;
import org.zhiqim.kernel.util.Strings;
import org.zhiqim.kernel.util.Validates;

public class TaobaoServer extends Servicer
{
    @SuppressWarnings("unused")
    private static final Log log = LogFactory.getLog(TaobaoServer.class);
    private static TaobaoServer server;
    // private static Map<String, V>
    private String appApiUrl = "http://gw.api.taobao.com/router/rest";
    private String appTokenUrl = "https://oauth.taobao.com/token";
    private String appAuthorizeUrl = "https://oauth.taobao.com/authorize";

    private String appRedirectUrl;
    private String pcRedirectUrl;
    private String mobileRedirectUrl;
    private String secretServerUrl;
    private String randomNumber;

    private String appKey;
    private String appSecret;
    private String appScope;

    private int appInvokeNum = 5000;
    private int appConnectTimeout = 10;
    private int appReadTimeout = 30;

    private String forwardUrl;// 透传地址
    private String secretForwardUrl;
    private String topUmpUrl;
    private String itemsgetUrl;
    private String taobaoPageGetUrl;
    private long itemToolId;
    private long orderAmountId;
    private long orderCountId;
    private long limitToolId;

    public static TaobaoServer getServer()
    {
        if (server == null)
            throw new RuntimeException("淘宝服务尚未初始化， 不允许调用");

        return server;
    }

    public boolean create() throws Exception
    {
        Group group = Global.getGroup(this.id);

        this.appAuthorizeUrl = group.getString("appAuthorizeUrl");
        this.appTokenUrl = group.getString("appTokenUrl");
        this.appApiUrl = group.getString("appApiUrl");
        this.appRedirectUrl = group.getString("appRedirectUrl");

        this.pcRedirectUrl = group.getString("pcRedirectUrl", this.appRedirectUrl);
        this.mobileRedirectUrl = group.getString("mobileRedirectUrl", this.appRedirectUrl);
        this.secretServerUrl = group.getString("secretServerUrl", "https://eco.taobao.com/router/rest");
        this.randomNumber = group.getString("randomNumber");
        this.appScope = group.getString("appScope");
        if (this.appScope == null)
            this.appScope = "item,promotion,usergrade";

        this.appKey = group.getString("appKey");
        this.appSecret = group.getString("appSecret");
        if (Validates.isEmptyBlank(appKey))
        {
            log.error("淘宝服务[appKey][%s]参数未配置", appKey);
            return false;
        }
        
        if (Validates.isEmptyBlank(appKey))
        {
            log.error("淘宝服务[appKey][%s]参数未配置", appSecret);
            return false;
        }

        this.appConnectTimeout = group.getInt("appConnectTimeout", 10);
        this.appReadTimeout = group.getInt("appReadTimeout", 30);
        this.appInvokeNum = group.getInt("appInvokeNum", 5000);

        this.forwardUrl = group.getString("forwardUrl");
        this.secretForwardUrl = group.getString("secretForwardUrl");
        this.topUmpUrl = group.getString("topUmpUrl");
        this.itemsgetUrl = group.getString("itemsgetUrl");
        this.taobaoPageGetUrl = group.getString("taobaoPageGetUrl");

        this.limitToolId = group.getLong("limitToolId");
        this.itemToolId = group.getLong("itemToolId");
        this.orderAmountId = group.getLong("orderAmountId");
        this.orderCountId = group.getLong("orderCountId");

        String controller = Strings.trim(group.getString("controller"));
        if (Validates.isNotEmptyBlank(controller))
        {
            Group group2 = Global.getGroup(this.id);
            if (group2 == null)
            {

            }
        }
        // 注册全局服务
        TaobaoServer.server = this;
        log.info("淘宝服务初始化完成");
        return true;
    }

    public boolean isValid()
    {
        if ((Validates.isEmptyBlank(this.appRedirectUrl)) || (Validates.isEmptyBlank(this.appKey)) || (Validates.isEmptyBlank(this.appSecret)))
        {
            return false;
        }
        return true;
    }

    public String getCurrentApiPath()
    {
        if (Validates.isEmpty(this.forwardUrl))
        {
            return this.appApiUrl;
        }
        return this.forwardUrl;
    }

    public String getCurrentSecretApiPath()
    {
        if (Validates.isEmpty(this.secretForwardUrl))
        {
            return this.secretServerUrl;
        }
        return this.secretForwardUrl;
    }

    public boolean isTaobaoPageForward()
    {
        return Validates.isNotEmpty(this.taobaoPageGetUrl);
    }

    public boolean isForward()
    {
        return Validates.isNotEmpty(this.forwardUrl);
    }

    public boolean isSecretForward()
    {
        return Validates.isNotEmpty(this.secretForwardUrl);
    }

    public String getAppRedirectUrl()
    {
        return this.appRedirectUrl;
    }

    public String getPcRedirectUrl()
    {
        return this.pcRedirectUrl;
    }

    public String getMobileRedirectUrl()
    {
        return this.mobileRedirectUrl;
    }

    public String getAppTokenUrl()
    {
        return this.appTokenUrl;
    }

    public String getAppAuthorizeUrl()
    {
        return this.appAuthorizeUrl;
    }

    public String getAppApiUrl()
    {
        return this.appApiUrl;
    }

    public String getSecretServerUrl()
    {
        return this.secretServerUrl;
    }

    public String getRandomNumber()
    {
        return this.randomNumber;
    }

    public String getAppKey()
    {
        return this.appKey;
    }

    public String getAppSecret()
    {
        return this.appSecret;
    }

    public String getAppScope()
    {
        return this.appScope;
    }

    public int getAppConnectTimeout()
    {
        return this.appConnectTimeout;
    }

    public int getAppReadTimeout()
    {
        return this.appReadTimeout;
    }

    public int getAppInvokeNum()
    {
        return this.appInvokeNum;
    }

    public String getForwardUrl()
    {
        return this.forwardUrl;
    }

    public String getSecretForwardUrl()
    {
        return this.secretForwardUrl;
    }

    public String getTopUmpUrl()
    {
        return this.topUmpUrl;
    }

    public String getTaobaoPageGetUrl()
    {
        return this.taobaoPageGetUrl;
    }

    public String getItemsgetUrl()
    {
        return this.itemsgetUrl;
    }

    public void setAppTokenUrl(String appTokenUrl)
    {
        if (Validates.isEmptyBlank(appTokenUrl))
        {
            return;
        }
        this.appTokenUrl = appTokenUrl;
    }

    public void setAppApiUrl(String appApiUrl)
    {
        if (Validates.isEmptyBlank(appApiUrl))
        {
            return;
        }
        this.appApiUrl = appApiUrl;
    }

    public void setAppAuthorizeUrl(String appAuthorizeUrl)
    {
        if (Validates.isEmptyBlank(appAuthorizeUrl))
        {
            return;
        }
        this.appAuthorizeUrl = appAuthorizeUrl;
    }

    public void setAppRedirectUrl(String appRedirectUrl)
    {
        if (Validates.isEmptyBlank(this.appApiUrl))
        {
            return;
        }
        this.appRedirectUrl = appRedirectUrl;
    }

    public void setPcRedirectUrl(String pcRedirectUrl)
    {
        if (Validates.isEmptyBlank(this.appApiUrl))
        {
            return;
        }
        this.pcRedirectUrl = pcRedirectUrl;
    }

    public void setMobileRedirectUrl(String mobileRedirectUrl)
    {
        if (Validates.isEmptyBlank(this.appApiUrl))
        {
            return;
        }
        this.mobileRedirectUrl = mobileRedirectUrl;
    }

    public void setSecretServerUrl(String secretServerUrl)
    {
        if (Validates.isEmptyBlank(this.appApiUrl))
        {
            return;
        }
        this.secretServerUrl = secretServerUrl;
    }

    public void setRandomNumber(String randomNumber)
    {
        if (Validates.isEmptyBlank(this.appApiUrl))
        {
            return;
        }
        this.randomNumber = randomNumber;
    }

    public void setAppKey(String appKey)
    {
        this.appKey = appKey;
    }

    public void setAppSecret(String appSecret)
    {
        this.appSecret = appSecret;
    }

    public void setAppScope(String appScope)
    {
        this.appScope = appScope;
    }

    public void setAppConnectTimeout(int appConnectTimeout)
    {
        if ((appConnectTimeout < 10) || (appConnectTimeout > 60))
        {
            return;
        }
        this.appConnectTimeout = appConnectTimeout;
    }

    public void setAppReadTimeout(int appReadTimeout)
    {
        if ((appReadTimeout < 10) || (appReadTimeout > 180))
        {
            return;
        }
        this.appReadTimeout = appReadTimeout;
    }

    public void setAppInvokeNum(int appInvokeNum)
    {
        if (appInvokeNum < 5000)
        {
            return;
        }
        this.appInvokeNum = appInvokeNum;
    }

    public void setForwardUrl(String forwardUrl)
    {
        this.forwardUrl = forwardUrl;
    }

    public void setSecretForwardUrl(String secretForwardUrl)
    {
        this.secretForwardUrl = secretForwardUrl;
    }

    public void setTaobaoPageGetUrl(String taobaoPageGetUrl)
    {
        this.taobaoPageGetUrl = taobaoPageGetUrl;
    }

    public void setItemsgetUrl(String itemsgetUrl)
    {
        this.itemsgetUrl = itemsgetUrl;
    }

    public void setTopUmpUrl(String topUmpUrl)
    {
        this.topUmpUrl = topUmpUrl;
    }

    public boolean isDiscountToolId(long toolId)
    {
        return (toolId == this.limitToolId) || (toolId == this.itemToolId);
    }

    public long getItemToolId()
    {
        return this.itemToolId;
    }

    public void setItemToolId(long itemToolId)
    {
        this.itemToolId = itemToolId;
    }

    public long getOrderAmountId()
    {
        return this.orderAmountId;
    }

    public void setOrderAmountId(long orderAmountId)
    {
        this.orderAmountId = orderAmountId;
    }

    public long getOrderCountId()
    {
        return this.orderCountId;
    }

    public void setOrderCountId(long orderCountId)
    {
        this.orderCountId = orderCountId;
    }

    public long getLimitToolId()
    {
        return this.limitToolId;
    }

    public void setLimitToolId(long limitToolId)
    {
        this.limitToolId = limitToolId;
    }
}