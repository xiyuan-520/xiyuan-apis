package com.xiyuan.taobao.api;

public interface TaobaoHandler<T1, T2>
{
    public void handle(T1 o1, T2 o2);
}
