package adapter;

/**
 * 装饰器
 */
public class Adapter extends Source implements ITarget {
    public void doSomething() {
        super.thing();
    }
}
