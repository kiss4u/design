package proxy.normal;

/**
 * 代理实现类
 */
public class ProxySubject implements ISubject {

    private ISubject subject;

    public ProxySubject(ISubject realSubject) {
        subject = realSubject;
    }

    public ISubject getProxy() {
        return this;
    }

    public void doSomething() {
        before();
        subject.doSomething();
        after();
    }

    private void before() {
        System.out.println("执行前");
    }

    private void after() {
        System.out.println("执行后");
    }
}
