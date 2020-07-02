package command;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new Command1());
        invoker.action();
    }
}
