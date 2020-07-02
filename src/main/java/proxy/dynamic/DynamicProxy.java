package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {

        // 切入点执行前置内容
        System.out.println("前置内容被执行了");

        return (T)Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
