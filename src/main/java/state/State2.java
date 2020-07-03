package state;

/**
 *
 */
public class State2 extends AbstractState {
    @Override
    protected void handle1() {
        System.out.println("State2 handle1");
        super.context.setCurrentState(Context.state1);
        super.getContext().handle1();
    }

    @Override
    protected void handle2() {
        System.out.println("State2 handle2");
    }
}
