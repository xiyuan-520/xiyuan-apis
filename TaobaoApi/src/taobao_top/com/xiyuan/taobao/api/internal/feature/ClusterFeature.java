package com.xiyuan.taobao.api.internal.feature;

import com.xiyuan.taobao.api.DefaultTaobaoClient;
import com.xiyuan.taobao.api.internal.cluster.ClusterManager;
import com.xiyuan.taobao.api.internal.util.WebUtils;

/**
 * ��ض���Զ����伯Ⱥ�ͻ�������
 */
public abstract class ClusterFeature {

    static {
        WebUtils.setIgnoreHostCheck(true);
    }

    public void init(final DefaultTaobaoClient client) {
        ClusterManager.initRefreshThread(client);
    }
}