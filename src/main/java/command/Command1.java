package command;

/**
 *
 */
public class Command1 extends Command {

    public Command1() {
        super(new Receiver1());
    }

    public Command1(Receiver receiver) {
        super(receiver);
    }

    @Override
    protected void execute() {
        receiver.doSomething();
    }
}
