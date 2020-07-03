package state;

/**
 *
 */
public class State1 extends AbstractState {

    @Override
    protected void handle1() {
        System.out.println("State1 handle1");
    }

    @Override
    protected void handle2() {
        System.out.println("State1 handle2");
        super.context.setCurrentState(Context.state2);
        super.getContext().handle2();
    }
}
