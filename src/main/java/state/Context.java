package state;

/**
 *
 */
public class Context {

    public final static AbstractState state1 = new State1();
    public final static AbstractState state2 = new State2();
    private AbstractState currentState;

    public AbstractState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AbstractState state) {
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }


}
