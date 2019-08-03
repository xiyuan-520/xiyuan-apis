package com.xiyuan.taobao.api;

public class TaobaoUtils
{
    /****
     * 将淘宝用户订购状态 转成自定义状态
     * 
     * 
     * @param status
     * @return 返回 0=未订购， 1=已订购，2=非法用户
     */
    public static int parseUserStatus(String status)
    {
        if ("unsubscribeUser".equals(status))
            return 0;
        else if ("subscribeUser".equals(status))
            return 1;
        else if ("invalidateUser".equals(status))
            return 2;
        else
            return -1;
    }
}
