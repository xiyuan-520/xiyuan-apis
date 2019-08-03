package com.xiyuan.taobao.api.model;

import org.zhiqim.kernel.json.Jsons;
import org.zhiqim.kernel.util.Urls;
import org.zhiqim.kernel.util.Validates;

public class SessionToken
{
    private String token;
    private String userId;
    private String nick;
    private String sessionId;
    private int expiresIn;
    private int expiresInR1;
    private int expiresInR2;
    private int expiresInW1;
    private int expiresInW2;
    private String refreshToken;
    private int reExpiresIn;
    private String subNick;

    public static SessionToken parseSessionToken(String token)
    {
        token = Urls.decodeUTF8(token);
        token = Jsons.removeBlankSpace(token);
        SessionToken sessionToken = new SessionToken();
        sessionToken.token = token;
        sessionToken.userId = Jsons.getString(token, "taobao_user_id");
        sessionToken.nick = Jsons.getString(token, "taobao_user_nick");
        sessionToken.sessionId = Jsons.getString(token, "access_token");
        sessionToken.expiresIn = Jsons.getInt(token, "expires_in");
        sessionToken.expiresInR1 = Jsons.getInt(token, "r1_expires_in");
        sessionToken.expiresInR2 = Jsons.getInt(token, "r2_expires_in");
        sessionToken.expiresInW1 = Jsons.getInt(token, "w1_expires_in");
        sessionToken.expiresInW2 = Jsons.getInt(token, "w2_expires_in");
        sessionToken.refreshToken = Jsons.getString(token, "refresh_token");
        sessionToken.reExpiresIn = Jsons.getInt(token, "re_expires_in");
        sessionToken.subNick = Jsons.getString(token, "sub_taobao_user_nick");

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
        if ((!Validates.isEmpty(this.sessionId)) && (!Validates.isEmpty(this.refreshToken)) && (this.expiresIn != -1) && (this.expiresInR1 != -1))
        {
            if (this.expiresInW1 != -1)
            {
                if (this.reExpiresIn != -1)
                {
                    return false;
                }
            }
        }
        return

        true;
    }

    public boolean hasSubNick()
    {
        return Validates.isNotEmpty(this.subNick);
    }

    public String getNickLogined()
    {
        return hasSubNick() ? this.subNick : this.nick;
    }

    public String getToken()
    {
        return this.token;
    }

    public String getUserId()
    {
        return this.userId;
    }

    public String getNick()
    {
        return this.nick;
    }

    public String getSessionId()
    {
        return this.sessionId;
    }

    public int getExpiresIn()
    {
        return this.expiresIn;
    }

    public int getExpiresInR1()
    {
        return this.expiresInR1;
    }

    public int getExpiresInR2()
    {
        return this.expiresInR2;
    }

    public int getExpiresInW1()
    {
        return this.expiresInW1;
    }

    public int getExpiresInW2()
    {
        return this.expiresInW2;
    }

    public void setExpiresInW2(int expiresInW2)
    {
        this.expiresInW2 = expiresInW2;
    }

    public String getRefreshToken()
    {
        return this.refreshToken;
    }

    public int getReExpiresIn()
    {
        return this.reExpiresIn;
    }

    public String getSubNick()
    {
        return this.subNick;
    }
}
