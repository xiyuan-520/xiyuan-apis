package com.xiyuan.taobao.api.internal.toplink.endpoint;

import com.xiyuan.taobao.api.internal.toplink.LinkException;

public interface StateHandler {
	public void onConnect(EndpointProxy endpoint, ChannelSenderWrapper sender, Identity connectingIdentity) throws LinkException;
}