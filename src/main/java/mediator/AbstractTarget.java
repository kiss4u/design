package mediator;

/**
 *
 */
public abstract class AbstractTarget {

    protected AbstractMediator mediator;

    public AbstractTarget(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
