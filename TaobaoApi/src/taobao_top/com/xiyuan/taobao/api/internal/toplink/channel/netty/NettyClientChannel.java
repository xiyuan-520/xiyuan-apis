package com.xiyuan.taobao.api.internal.toplink.channel.netty;

import org.jboss.netty.channel.Channel;

import com.xiyuan.taobao.api.internal.toplink.channel.ClientChannel;

public interface NettyClientChannel extends ClientChannel {
	public void setChannel(Channel channel);
}
