package decorator;

/**
 * 装饰器1
 */
public class Decorator1 extends AbstractDecorator {

    public Decorator1(AbstractComponent component) {
        super(component);
    }

    @Override
    protected void doSomething() {
        method();
        super.doSomething();
    }

    private void method() {
        System.out.println("Decorator1装饰");
    }
}
