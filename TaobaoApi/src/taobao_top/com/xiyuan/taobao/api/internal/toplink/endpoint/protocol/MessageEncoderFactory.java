package com.xiyuan.taobao.api.internal.toplink.endpoint.protocol;

import com.xiyuan.taobao.api.internal.toplink.endpoint.Message;
import com.xiyuan.taobao.api.internal.toplink.endpoint.MessageIO.MessageEncoder;

public interface MessageEncoderFactory {
	public MessageEncoder get(Message message);
}