package adapter;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        ITarget target1 = new Target1();
        ITarget target2 = new Adapter();
        target1.doSomething();
        target2.doSomething();
    }
}
