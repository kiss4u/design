package single.lazy;

/**
 * 懒汉式
 * 说明：获取实例时初始化
 * 优点：达到了延迟加载目的
 * 缺点：非线程安全
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
