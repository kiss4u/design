package handler;

/**
 *
 */
public class Handler1 extends AbstractHandler {

    public Handler1() {
        this.handlerName = "Handler1";
    }

    @Override
    protected String doSomething() {
        return handlerName;
    }
}
