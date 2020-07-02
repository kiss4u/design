package mediator;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator1();
        Target1 target1 = new Target1(mediator);
        Target2 target2 = new Target2(mediator);
        target1.methodUp();
        target2.methodUp();
    }
}
