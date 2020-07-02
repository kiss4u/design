package builder;

/**
 *
 */
public class BuilderType1 extends AbstractBuilder {

    AbstractProduct Product = new ProductType1();

    @Override
    protected void buildStep() {
        Product.method();
    }

    @Override
    protected AbstractProduct buildProduct() {
        return Product;
    }
}
