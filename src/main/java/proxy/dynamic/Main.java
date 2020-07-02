package proxy.dynamic;

import proxy.normal.RealSubject;
import proxy.normal.ISubject;

import java.lang.reflect.InvocationHandler;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        ISubject ISubject1 = new RealSubject();
        InvocationHandler handler = new MyHandler(ISubject1);
        ClassLoader classLoader = ISubject1.getClass().getClassLoader();
        ISubject proxy = (ISubject) DynamicProxy.newProxyInstance(classLoader, new Class[]{ISubject.class}, handler);
        proxy.doSomething();
    }
}
