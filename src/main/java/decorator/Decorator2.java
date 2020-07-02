package decorator;

/**
 * 装饰器1
 */
public class Decorator2 extends AbstractDecorator {

    public Decorator2(AbstractComponent component) {
        super(component);
    }

    @Override
    protected void doSomething() {
        method();
        super.doSomething();
    }

    private void method() {
        System.out.println("Decorator2装饰");
    }
}
