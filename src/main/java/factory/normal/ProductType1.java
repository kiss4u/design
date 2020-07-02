package factory.normal;

/**
 * 产品类型1
 */
public class ProductType1 extends AbstractProduct {

    @Override
    public void methodPersonal() {
        System.out.println("ProductType1特有的");
    }
}
