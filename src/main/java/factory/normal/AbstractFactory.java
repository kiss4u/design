package factory.normal;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {

    public abstract <T extends AbstractProduct> T createProduct(Class<T> clazz);
}
