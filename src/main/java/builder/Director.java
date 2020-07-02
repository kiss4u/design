package builder;

/**
 *
 */
public class Director {
    private AbstractBuilder builderType1 = new BuilderType1();

    public AbstractProduct getProductType1() {
        // 差异化步骤
        builderType1.buildStep();
        return builderType1.buildProduct();
    }
}
