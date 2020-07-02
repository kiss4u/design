package mediator;

/**
 *
 */
public class Mediator1 extends AbstractMediator {

    @Override
    public void doSomething1() {
        super.target2.methodSelf();
    }

    @Override
    public void doSomething2() {
        super.target1.methodSelf();
    }


}
