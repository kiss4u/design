package proxy.normal;

/**
 * 真实对象
 */
public class RealSubject implements ISubject {

    public void doSomething() {
        System.out.println("真实对象方法");
    }

    public ISubject getProxy() {
        return null;
    }
}
