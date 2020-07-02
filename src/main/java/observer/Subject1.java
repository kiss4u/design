package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Subject1 implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("=======" + o.countObservers() + "===" + arg.toString());
    }
}
