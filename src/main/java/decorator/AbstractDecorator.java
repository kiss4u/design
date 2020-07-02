package decorator;

/**
 * 抽象装饰器
 */
public abstract class AbstractDecorator extends AbstractComponent {

    private AbstractComponent component;

    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    protected void doSomething() {
        component.doSomething();
    }
}
