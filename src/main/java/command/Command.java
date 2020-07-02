package command;

/**
 * 抽象命令类
 */
public abstract class Command {

    protected final Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    protected abstract void execute();
}
