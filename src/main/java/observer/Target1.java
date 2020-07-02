package observer;

import java.util.Observable;

/**
 * 被观察者
 */
public class Target1 extends Observable {

    public void doSomething(String str) {
        super.setChanged();
        super.notifyObservers(str);
    }
}
