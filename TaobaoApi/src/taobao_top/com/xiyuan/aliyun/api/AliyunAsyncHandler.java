package com.xiyuan.aliyun.api;

import com.xiyuan.taobao.api.ApiException;

public interface AliyunAsyncHandler<T extends AliyunResponse> {

	public void onError(ApiException exception);
	
	public void onSuccess(AliyunRequest<T> request,T response);
	
}
