package com.xiyuan.taobao.api;

import com.xiyuan.taobao.api.internal.cluster.ClusterManager;
import com.xiyuan.taobao.api.internal.cluster.DnsConfig;
import com.xiyuan.taobao.api.internal.feature.ClusterFeature;
import com.xiyuan.taobao.api.internal.util.TaobaoHashMap;

public class AutoRetryClusterTaobaoClient extends AutoRetryTaobaoClient
{
    
    private ClusterFeature feature;
    
    private void initFeature()
    {
        feature = new ClusterFeature()
        {
        };
        feature.init(this);
    }
    
    public AutoRetryClusterTaobaoClient(String serverUrl, String appKey, String appSecret) throws ApiException
    {
        super(serverUrl, appKey, appSecret);
        initFeature();
    }
    
    public AutoRetryClusterTaobaoClient(String serverUrl, String appKey, String appSecret, String format) throws ApiException
    {
        super(serverUrl, appKey, appSecret, format);
        initFeature();
    }
    
    public AutoRetryClusterTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) throws ApiException
    {
        super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout);
        initFeature();
    }
    
    public AutoRetryClusterTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) throws ApiException
    {
        super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout, signMethod);
        ClusterManager.initRefreshThread(this);
    }
    
    public String getServerUrl(String serverUrl, String apiName, String session, TaobaoHashMap appParams)
    {
        DnsConfig dnsConfig = ClusterManager.GetDnsConfigFromCache();
        if (dnsConfig == null)
        {
            return serverUrl;
        }
        else
        {
            return dnsConfig.getBestVipUrl(serverUrl, apiName, session, appParams);
        }
    }
    
    public String getSdkVersion()
    {
        return Constants.SDK_VERSION_CLUSTER;
    }
    
}
