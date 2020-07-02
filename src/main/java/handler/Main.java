package handler;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();

        handler1.setNextAbstractHandler(handler2);
        System.out.println(handler1.handleMessage("handler2"));
    }
}
