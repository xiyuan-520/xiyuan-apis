package com.xiyuan.taobao.api.user;

import org.zhiqim.kernel.extend.HashMapSS;
import org.zhiqim.kernel.json.Jsons;
import org.zhiqim.kernel.util.Ints;

import com.xiyuan.taobao.api.TaobaoResponse;
import com.xiyuan.taobao.api.TaobaoUtils;

public class AppstoreSubscribeGetRespnse extends TaobaoResponse
{
    private String startDate;
    private String endDate;
    private int userStatus;// 淘宝返回字段为String status.订购状况。应用订购者：subscribeUser;尚未订购：unsubscribeUser；非法用户：invalidateUser
    private int versionNo;

    protected void buildResponse(String json)
    {
        HashMapSS map = Jsons.toMapSS(Jsons.getString(json, "user_subscribe"));
        setStartDate(map.get("start_date"));
        setEndDate(map.get("end_date"));
        setVersionNo(Ints.toInt(map.get("version_no"), 0));
        setUserStatus(TaobaoUtils.parseUserStatus(map.get("status")));//将淘宝状态转化为自定义状态
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public int getUserStatus()
    {
        return userStatus;
    }

    public void setUserStatus(int userStatus)
    {
        this.userStatus = userStatus;
    }

    public int getVersionNo()
    {
        return versionNo;
    }

    public void setVersionNo(int versionNo)
    {
        this.versionNo = versionNo;
    }
}
