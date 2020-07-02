package command;

/**
 *
 */
public class Command2 extends Command {

    public Command2() {
        super(new Receiver1());
    }

    public Command2(Receiver receiver) {
        super(receiver);
    }

    @Override
    protected void execute() {
        receiver.doSomething();
    }
}
