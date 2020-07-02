package handler;

/**
 *
 */
public abstract class AbstractHandler {

    protected String handlerName;
    private AbstractHandler nextHandler;

    public final String handleMessage(String target) {
        if(handlerName.equals(target)) {
            return doSomething();
        } else {
            if(null != nextHandler) {
                return nextHandler.handleMessage(target);
            } else {
                return "无可用处理者";
            }
        }
    }

    public void setNextAbstractHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract String doSomething();
}
