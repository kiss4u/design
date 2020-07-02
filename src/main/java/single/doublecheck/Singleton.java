package single.doublecheck;

/**
 * 双重校验锁
 * 说明：两次校验非空，防止多线程重复实例化
 * 优点：线程安全，延迟加载
 * 缺点：
 */
public class Singleton {
    /**
     * 为什么要用volatile关键字？
     * singleton = new Singleton(); 该句非原子操作：1 给singleton分配内存 2 初始化Singleton对象 3 Singleton对象指向内存空间
     * JVM执行会进行指令重排，步骤顺序发生变化，可能出现132，导致初始化不完全
     * volatile关键字保存线程看到的值是一致的，同时禁止指令重排
     */
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
