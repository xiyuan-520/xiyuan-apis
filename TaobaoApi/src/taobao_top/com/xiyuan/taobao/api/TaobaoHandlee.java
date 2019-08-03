package com.xiyuan.taobao.api;

public class TaobaoHandlee<T1, T2> implements Runnable
{
    private T1 o1;
    private T2 o2;
    private TaobaoHandler<T1, T2> handler;
    
    @SuppressWarnings("unchecked")
    public TaobaoHandlee(T1 o1, T2 o2, TaobaoHandler<?, ?> handler)
    {
        this.o1 = o1;
        this.o2 = o2;
        this.handler = (TaobaoHandler<T1, T2>)handler;
    }
    
    public void run()
    {
        handler.handle(o1, o2);
    }
    
    public boolean equals(Object obj) 
    {
        if (obj == null)
            return false;
        
        if (!(obj instanceof TaobaoHandlee))
            return false;
        
        TaobaoHandlee<?, ?> other = (TaobaoHandlee<?, ?>)obj;
        if (other.o1 == null ||other.getO2() == null)
            return false;
        else
            return this.o1.equals(other.o1) ? this.o2.equals(other.o2) : false;
    }

    public T1 getO1()
    {
        return o1;
    }

    public T2 getO2()
    {
        return o2;
    }

    public TaobaoHandler<T1, T2> getHandler()
    {
        return handler;
    }
    
}
