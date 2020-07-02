package template;

/**
 * 抽象模板类
 */
public abstract class AbstractTmeplate {

    private boolean hook2 = true;

    protected void method1() {

    }

    protected void method2() {
        System.out.println("method2");
    }

    protected void method3() {

    }

    public void doSomething() {
        method1();
        if (hook2) {
            method2();
        }
        method3();
    }

    public void setHook2(boolean hook2) {
        this.hook2 = hook2;
    }
}
