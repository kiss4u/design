package state;

/**
 *
 */
public abstract class AbstractState {
    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    protected void handle1() {}

    protected void handle2() {}
}
