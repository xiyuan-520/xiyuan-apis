package com.xiyuan.taobao.api.internal.toplink.remoting;

import org.jboss.netty.channel.ChannelPipeline;

import com.xiyuan.taobao.api.internal.toplink.LoggerFactory;
import com.xiyuan.taobao.api.internal.toplink.channel.tcp.TcpServerChannel;

public class NettyRemotingTcpServerChannel extends TcpServerChannel {

	public NettyRemotingTcpServerChannel(int port) {
		super(port);
	}
	
	public NettyRemotingTcpServerChannel(LoggerFactory factory, int port) {
		super(factory, port);
	}

	@Override
	protected void prepareCodec(ChannelPipeline pipeline) {
		pipeline.addLast("decoder", new NettyRemotingDecoder());
	}
}
