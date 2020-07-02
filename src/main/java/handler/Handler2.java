package handler;

/**
 *
 */
public class Handler2 extends AbstractHandler {

    public Handler2() {
        this.handlerName = "Handler2";
    }

    @Override
    protected String doSomething() {
        return handlerName;
    }
}
