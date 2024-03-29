/*
 * The MIT License
 * 
 * Copyright (c) 2011 Takahiro Hashimoto
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.xiyuan.taobao.api.internal.toplink.embedded.websocket.handler;

import com.xiyuan.taobao.api.internal.toplink.embedded.websocket.WebSocket;
import com.xiyuan.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.xiyuan.taobao.api.internal.toplink.embedded.websocket.frame.Frame;

/**
 * The Class WebSocketHandlerAdapter.
 * 
 * @author Takahiro Hashimoto
 */
abstract public class WebSocketHandlerAdapter implements WebSocketHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * jp.a840.websocket.handler.WebSocketHandler#onClose(jp.a840.websocket.
	 * WebSocket)
	 */
	public void onClose(WebSocket socket) {
		;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * jp.a840.websocket.handler.WebSocketHandler#onError(jp.a840.websocket.
	 * WebSocket, jp.a840.websocket.exception.WebSocketException)
	 */
	public void onError(WebSocket socket, WebSocketException e) {
		e.printStackTrace();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * jp.a840.websocket.handler.WebSocketHandler#onMessage(jp.a840.websocket
	 * .WebSocket, jp.a840.websocket.frame.Frame)
	 */
	public void onMessage(WebSocket socket, Frame frame) {
		;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * jp.a840.websocket.handler.WebSocketHandler#onOpen(jp.a840.websocket.WebSocket
	 * )
	 */
	public void onOpen(WebSocket socket) {
		;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * jp.a840.websocket.handler.WebSocketHandler#onCloseFrame(jp.a840.websocket
	 * .WebSocket, int statusCode, String reasonText)
	 */
	public void onCloseFrame(WebSocket socket, int statusCode, String reasonText) {
		;
	}

}
