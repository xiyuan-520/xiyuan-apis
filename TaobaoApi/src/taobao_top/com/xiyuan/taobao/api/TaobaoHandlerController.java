package com.xiyuan.taobao.api;

import org.zhiqim.kernel.Global;
import org.zhiqim.kernel.config.Group;
import org.zhiqim.kernel.config.Item;
import org.zhiqim.kernel.control.Handler;
import org.zhiqim.kernel.control.HandlerController;
import org.zhiqim.kernel.control.ThreaderController;
import org.zhiqim.kernel.extend.HashMapCV;
import org.zhiqim.kernel.extend.MapCV;
import org.zhiqim.kernel.logging.Log;
import org.zhiqim.kernel.logging.LogFactory;
import org.zhiqim.kernel.util.Randoms;

public class TaobaoHandlerController extends ThreaderController
{
    private static final Log log = LogFactory.getLog(HandlerController.class);
    private static final String DEFAULT = "default";
    
    private TaobaoHandler<?, ?> defaultHandler = null;          //缺省处理器
    private final MapCV<TaobaoHandler<?, ?>> handlerMap = new HashMapCV<>();
    
    public TaobaoHandlerController()
    {
        setThreadName("TaobaoHandlerController-" + Randoms.upperLetters(1)+Randoms.lowerLettersDigits(3));
    }
    
    /*************************************************************************************************/
    //创建&销毁，支持通过配置key=class,value=handler方式
    /*************************************************************************************************/
    
    public boolean openBefore()
    {
        super.openBefore();
        
        if (id == null)
        {//没有配置服务
            return true;
        }
        
        Group group = Global.getGroup(id+".handler");
        if (group == null || group.isEmpty())
        {//没有配置处理器
            return true;
        }

        for (Item item : group.list())
        {
            String className = item.getKey();
            String handlerName = item.getString();

            Object handler = Global.newInstance(handlerName);
            if (handler == null || !(handler instanceof Handler))
            {
                log.error("配置[%s]中，[%s]类不存在或未实现Handler接口", group.getId(), handlerName);
                return false;
            }
            
            if (DEFAULT.equals(className))
            {//默认类名
                setDefaultHandler((TaobaoHandler<?, ?>)handler);
            }
            else
            {//指定类名
                Class<?> cls = Global.forName(className);
                if (cls == null)
                {
                    log.error("配置[%s]中，[%s]类不存在", group.getId(), className);
                    return false;
                }
                handlerMap.put(cls, (TaobaoHandler<?, ?>)handler);
            }
        }
        
        return true;
    }
    
    public void closeAfter()
    {
        super.closeAfter();
        
        defaultHandler = null;
        handlerMap.clear();
    }
    
    /*************************************************************************************************/
    //增加&删除处理器
    /*************************************************************************************************/
    
    /** 设置缺省处理器 */
    public <T1, T2> void setDefaultHandler(TaobaoHandler<T1, T2> handler)
    {
        defaultHandler = handler;
    }

    /** 清除缺省处理器 */
    public void clearDefaultHandler()
    {
        defaultHandler = null;
    }

    /** 增加一个对象处理器 */
    public <T1, T2> void addHandler(Class<T1> requestClass, TaobaoHandler<T1, T2> handler)
    {
        handlerMap.put(requestClass, handler);
    }

    /** 删除一个对象处理器 */
    public <T> void removeHandler(Class<T> requestClass)
    {
        handlerMap.remove(requestClass);
    }
    
    /*************************************************************************************************/
    //公开的对象处理方法
    /*************************************************************************************************/
    
    /** 处理一个事件，转化为Handlee由父类处理 */
    public boolean execute(Object event, Object event2)
    {
        return execute(event, event2, false);
    }
    
    /** 处理一个事件，并提供优先参数，转化为Handlee由父类处理 */
    public boolean execute(Object event, Object event2, boolean priority)
    {
        TaobaoHandler<?, ?> handler = handlerMap.get(event.getClass());
        if (handler == null)
            handler = defaultHandler;
            
        if (handler == null)
        {
            log.fatal("事件处理器[%s]未配置处理器", event.getClass().getName());
            return false;
        }
        
        TaobaoHandlee<?, ?> command = new TaobaoHandlee<>(event, event2, handler);
        return super.execute(command, priority);
    }
}
