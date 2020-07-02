package single.lazy;

/**
 * 懒汉式
 * 说明：增加同步方法锁
 * 优点：线程安全
 * 缺点：同步方法，效率低
 */
public class Singleton2 {

    private static Singleton2 singleton = null;

    private Singleton2() {
    }

    public static synchronized Singleton2 getSingleton() {
        if (null == singleton) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
