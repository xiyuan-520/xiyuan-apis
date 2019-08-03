package com.xiyuan.taobao.api.user;

import org.zhiqim.kernel.extend.HashMapSS;
import org.zhiqim.kernel.json.Jsons;
import org.zhiqim.kernel.util.Strings;

import com.xiyuan.taobao.api.TaobaoResponse;

public class UserBuyerGetRespnse extends TaobaoResponse
{
    private String nick;
    private int sex;// 性别。可选值:m(男),f(女) 对应 对应 m=0, f=1
    private String avatar;//用户头像地址
    private String openUid;//对应账号的OpenUID

    protected void buildResponse(String json)
    {
        HashMapSS map = Jsons.toMapSS(Jsons.getString(json, "user"));
        setNick(map.get("nick"));
        setSex("m".equalsIgnoreCase(map.get("sex")) ? 0 : 1);
        setAvatar(Strings.trim(map.get("avatar")));
        setOpenUid(map.get("open_uid"));
    }

    public String getNick()
    {
        return nick;
    }

    public void setNick(String nick)
    {
        this.nick = nick;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }

    public String getOpenUid()
    {
        return openUid;
    }

    public void setOpenUid(String openUid)
    {
        this.openUid = openUid;
    }
}
