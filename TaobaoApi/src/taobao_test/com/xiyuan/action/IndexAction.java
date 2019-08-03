package com.xiyuan.action;

import org.zhiqim.httpd.HttpRequest;
import org.zhiqim.httpd.context.core.Action;

public class IndexAction implements Action
{

    @Override
    public void execute(HttpRequest arg0) throws Exception
    {
        System.out.println("访问index.htm");
        
    }

}
