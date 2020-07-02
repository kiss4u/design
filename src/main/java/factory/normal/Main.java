package factory.normal;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        AbstractProduct product = factory.createProduct(ProductType1.class);
        product.methodCommon();
        product.methodPersonal();
    }
}
