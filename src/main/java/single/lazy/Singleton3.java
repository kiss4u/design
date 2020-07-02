package single.lazy;

/**
 * 懒汉式
 * 说明：增加同步代码块锁
 * 优点：
 * 缺点：非线程安全，多线程可能产生多个实例
 */
public class Singleton3 {

    private static Singleton3 singleton = null;

    private Singleton3() {
    }

    public static synchronized Singleton3 getSingleton() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                singleton = new Singleton3();
            }
        }
        return singleton;
    }
}
