package decorator;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        AbstractComponent component = new Component1();
        component = new Decorator1(component);
        component = new Decorator2(component);
        component.doSomething();
    }
}
