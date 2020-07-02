package mediator;

/**
 *
 */
public class Target1 extends AbstractTarget {

    public Target1(AbstractMediator mediator) {
        super(mediator);
        super.mediator.setTarget1(this);
    }

    public void methodSelf() {
        System.out.println("Target1 methodSelf");
    }

    public void methodUp() {
        super.mediator.doSomething1();
    }

}
