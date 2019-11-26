package com.xiyuan.taobao.api.internal.toplink.channel.embedded;

import java.net.URI;

import com.xiyuan.taobao.api.internal.toplink.LoggerFactory;
import com.xiyuan.taobao.api.internal.toplink.channel.ChannelException;
import com.xiyuan.taobao.api.internal.toplink.channel.ClientChannel;
import com.xiyuan.taobao.api.internal.toplink.channel.ClientChannelSharedSelector;

public class EmbeddedClientChannelSharedSelector extends ClientChannelSharedSelector {
	public EmbeddedClientChannelSharedSelector() {
		super();
	}

	public EmbeddedClientChannelSharedSelector(LoggerFactory loggerFactory) {
		super(loggerFactory);
	}

	protected ClientChannel connect(LoggerFactory loggerFactory, URI uri, int timeout) throws ChannelException {
		return uri.getScheme().equalsIgnoreCase("ws") ||
				uri.getScheme().equalsIgnoreCase("wss") ?
				EmbeddedWebSocketClient.connect(loggerFactory, uri, timeout) :
				super.connect(loggerFactory, uri, timeout);
	}
}
