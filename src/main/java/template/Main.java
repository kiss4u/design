package template;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        AbstractTmeplate type1 = new Type1();
        AbstractTmeplate type2 = new Type2();
        type1.doSomething();
        type2.setHook2(false);
        type2.doSomething();
    }
}
