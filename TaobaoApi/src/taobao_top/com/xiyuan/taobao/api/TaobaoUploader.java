package com.xiyuan.taobao.api;

public interface TaobaoUploader
{
    public abstract byte[] getContent();
    
    public abstract String getSuffix();
    
    public abstract String getFieldName();
    
    public abstract String getFileName();
}
