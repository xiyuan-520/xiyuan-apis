package com.xiyuan.qimencloud.api;

import com.xiyuan.taobao.api.ApiException;
import com.xiyuan.taobao.api.TaobaoClient;

/**
 * 简易奇门Client
 */
public interface QimenCloudClient extends TaobaoClient {

	/**
	 * 执行API请求。
	 *
	 * @param request 具体的API请求类
	 * @return 具体的API响应
	 */
	QimenCloudResponse execute(QimenCloudRequest request) throws ApiException;

    /**
     * 执行隐私API请求。
     * @param request 具体的API请求类
     * @param session 用户授权码
     * @return 具体的API响应
     * @throws ApiException
     */
    QimenCloudResponse execute(QimenCloudRequest request, String session) throws ApiException;
}
