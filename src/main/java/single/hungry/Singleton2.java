package single.hungry;

/**
 * 饿汉式
 * 说明：在类装载时即完成初始化
 * 优点：避免多线程问题
 * 缺点：如一直未用到会造成资源浪费
 */
public class Singleton2 {

    private static Singleton2 singleton = null;


    static {
        singleton = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getSingleton() {
        return singleton;
    }
}
