package strategy;

import strategy.best.DoSomething;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        IStrategy strategy = new Strategy1();
        Context context = new Context(strategy);
        context.excute();

        IStrategy strategy2 = new Strategy2();
        context = new Context(strategy2);
        context.excute();

        DoSomething.TARGET_1.excute();
    }
}
