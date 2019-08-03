package com.xiyuan.taobao.api.data.user;

import org.zhiqim.kernel.annotation.AnAlias;
import org.zhiqim.kernel.json.Jsons;

/** 用户订购信息 **/
public class UserSubscribe
{

    private String status;// 订购状况。应用订购者：subscribeUser;尚未订购：unsubscribeUser；非法用户：invalidateUser
    @AnAlias("start_date")
    private String startDate;// 订购开始时间。格式:yyyy-MM-dd HH:mm:ss
    @AnAlias("end_date")
    private String endDate;// 订购结束时间。格式:yyyy-MM-dd HH:mm:ss
    @AnAlias("version_no")
    private String versionNo;// 0-无版本信息；1-初级版；2-中级版；3-高级版

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
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
    
    public String getVersionNo()
    {
        return versionNo;
    }

    public void setVersionNo(String versionNo)
    {
        this.versionNo = versionNo;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public String toString()
    {
        return Jsons.toString(this);
    }
}
