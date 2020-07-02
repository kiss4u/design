package single.staticclass;


import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * 静态内部类 - 推荐使用
 * 说明：类的静态属性只会在第一次加载的时候初始化，调用getSingleton装载Singletoninstance，初始化Singleton;类初始化时其他线程无法进入
 * 优点：线程安全，效率高
 * 缺点：有潜在反射反序列化风险
 */
public class Singleton implements Serializable {

    private Singleton() {
    }

    private static class Singletoninstance {
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getSingleton() {
        return Singletoninstance.INSTANCE;
    }

    /**
     * 反射、反序列化攻击
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getSingleton();

        //
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton newSingleton = constructor.newInstance();
        System.out.println(singleton == newSingleton);

        //
        byte[] serialize = SerializationUtils.serialize(singleton);
        Singleton newInstance = SerializationUtils.deserialize(serialize);
        System.out.println(singleton == newInstance);
    }
}
