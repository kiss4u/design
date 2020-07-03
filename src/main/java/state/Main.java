package state;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new State1());
        context.handle1();
        context.handle2();
    }
}
