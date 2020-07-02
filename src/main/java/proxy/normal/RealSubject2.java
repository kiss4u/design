package proxy.normal;

/**
 * 真实对象
 */
public class RealSubject2 implements ISubject {

    private ProxySubject proxy = null;

    public void doSomething() {
        if(null == proxy) {
            System.out.println("请使用指定代理访问");
        } else {
            System.out.println("真实对象方法");
        }
    }

    public ISubject getProxy() {
        proxy = new ProxySubject(this);
        return proxy;
    }
}
