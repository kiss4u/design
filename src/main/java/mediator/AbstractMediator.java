package mediator;

/**
 * 抽象中介者
 */
public abstract class AbstractMediator {
    protected Target1 target1;
    protected Target2 target2;

    public Target1 getTarget1() {
        return target1;
    }

    public void setTarget1(Target1 target1) {
        this.target1 = target1;
    }

    public Target2 getTarget2() {
        return target2;
    }

    public void setTarget2(Target2 target2) {
        this.target2 = target2;
    }

    public abstract void doSomething1();
    public abstract void doSomething2();
}
