package com.xiyuan.taobao.api.model;

import org.zhiqim.kernel.extend.HashMapSS;
import org.zhiqim.kernel.json.Jsons;
import org.zhiqim.kernel.util.Ints;
import org.zhiqim.kernel.util.Urls;
import org.zhiqim.kernel.util.Validates;

public class SessionToken
{

    private String token;
    private String accessToken;// Access token
    private String tokenType;// Access token
    private int expiresIn;// Access token过期时间 单位秒
    private String refreshToken;// Refresh token，可用来刷新access_token
    private int reExpiresIn;// Refresh token过期时间
    private int r1ExpiresIn;// r1级别API或字段的访问过期时间；
    private int r2ExpiresIn;// r2级别API或字段的访问过期时间；
    private int w1ExpiresIn;// w1级别API或字段的访问过期时间；
    private int w2ExpiresIn;// w2级别API或字段的访问过期时间；
    private String nick;// 淘宝账号,主账号；
    private String userId;// 淘宝帐号对应id
    private String subUserId;// 淘宝子账号对应id
    private String subNick;// 淘宝子账号

    public static SessionToken parseSessionToken(String token)
    {
        token = Urls.decodeUTF8(token);
        token = Jsons.removeBlankSpace(token);

        HashMapSS map = Jsons.toMapSS(token);
        SessionToken sessionToken = new SessionToken();
        sessionToken.token = token;
        sessionToken.tokenType = map.get("token_type");
        sessionToken.accessToken = map.get("access_token");
        sessionToken.expiresIn = Ints.toInt(map.get("expires_in"), 0);
        sessionToken.refreshToken = map.get("refresh_token");
        sessionToken.reExpiresIn = Ints.toInt(map.get("re_expires_in"), 0);
        sessionToken.r1ExpiresIn = Ints.toInt(map.get("r1_expires_in"), 0);
        sessionToken.r2ExpiresIn = Ints.toInt(map.get("r2_expires_in"), 0);
        sessionToken.w1ExpiresIn = Ints.toInt(map.get("w1_expires_in"), 0);
        sessionToken.w2ExpiresIn = Ints.toInt(map.get("w2_expires_in"), 0);
        sessionToken.nick = map.get("taobao_user_nick");
        sessionToken.userId = map.get("taobao_user_id");
        sessionToken.subUserId = map.get("sub_taobao_user_id");
        sessionToken.subNick = map.get("sub_taobao_user_nick");

        return sessionToken;
    }

    public String toString()
    {
        return this.token;
    }

    public boolean isInValid()
    {
        return (Validates.isEmpty(this.userId)) || (Validates.isEmpty(this.nick));
    }

    public boolean isInValidParam()
    {

        if ((!Validates.isEmpty(this.getSessionId())) && (!Validates.isEmpty(this.refreshToken)) && (this.expiresIn != 0) && (this.r1ExpiresIn != 0))
        {
            if (this.w1ExpiresIn != 0 && this.reExpiresIn != 0)
                return false;
        }
        return true;
    }

    public boolean hasSubNick()
    {
        return Validates.isNotEmpty(this.subNick);
    }

    public String getSessionId()
    {
        return this.accessToken;
    }

    public String getNickLogined()
    {
        return hasSubNick() ? this.subNick : this.nick;
    }

    public String getToken()
    {
        return token;
    }

    public String getAccessToken()
    {
        return accessToken;
    }

    public String getTokenType()
    {
        return tokenType;
    }

    public int getExpiresIn()
    {
        return expiresIn;
    }

    public String getRefreshToken()
    {
        return refreshToken;
    }

    public int getReExpiresIn()
    {
        return reExpiresIn;
    }

    public int getR1ExpiresIn()
    {
        return r1ExpiresIn;
    }

    public int getR2ExpiresIn()
    {
        return r2ExpiresIn;
    }

    public int getW1ExpiresIn()
    {
        return w1ExpiresIn;
    }

    public int getW2ExpiresIn()
    {
        return w2ExpiresIn;
    }

    public String getNick()
    {
        return nick;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getSubUserId()
    {
        return subUserId;
    }

    public String getSubNick()
    {
        return subNick;
    }

}
