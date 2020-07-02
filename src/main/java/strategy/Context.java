package strategy;

/**
 * 封装角色
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void excute() {
        strategy.doSomething();
    }
}
