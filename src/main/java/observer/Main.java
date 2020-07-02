package observer;

import java.util.Observer;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Observer observer =  new Subject1();
        Target1 target = new Target1();
        target.addObserver(observer);
        target.doSomething("1111");
    }
}
