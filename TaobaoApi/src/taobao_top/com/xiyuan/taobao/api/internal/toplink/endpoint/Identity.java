package com.xiyuan.taobao.api.internal.toplink.endpoint;

import com.xiyuan.taobao.api.internal.toplink.LinkException;

public interface Identity {
	public Identity parse(Object data) throws LinkException;

	public void render(Object to);

	public boolean equals(Identity id);
}