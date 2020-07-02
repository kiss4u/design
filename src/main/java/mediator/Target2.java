package mediator;

/**
 *
 */
public class Target2 extends AbstractTarget {

    public Target2(AbstractMediator mediator) {
        super(mediator);
        super.mediator.setTarget2(this);
    }

    public void methodSelf() {
        System.out.println("Target2 methodSelf");
    }

    public void methodUp() {

        super.mediator.doSomething2();
    }

}
