package proxy.normal;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        RealSubject subject1 = new RealSubject();
        ProxySubject proxy1 = new ProxySubject(subject1);
        proxy1.doSomething();

        // 强制代理
        RealSubject2 subject2 = new RealSubject2();
        ProxySubject proxy2 = new ProxySubject(subject2);
        proxy2.doSomething();

        subject2.getProxy().doSomething();
    }
}
