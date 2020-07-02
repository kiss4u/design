package factory.normal;

/**
 * 工厂实现类
 */
public class Factory extends AbstractFactory {

    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> clazz) {
        AbstractProduct product = null;
        try {
            product = (AbstractProduct) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {

        }
        return (T) product;
    }
}
