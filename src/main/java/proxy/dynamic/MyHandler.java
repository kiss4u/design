package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理handler
 */
public class MyHandler implements InvocationHandler {
    // 被代理对象
    private Object object = null;

    //
    public MyHandler(Object object) {
        this.object = object;
    }

    // 代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);
        return result;
    }
}
