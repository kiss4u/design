package builder;

/**
 * 抽象的生产者
 */
public abstract class AbstractBuilder {

    protected abstract void buildStep();

    protected abstract AbstractProduct buildProduct();
}
