package factory.normal;

/**
 * 抽象产品类
 */
public abstract class AbstractProduct {

    // 公共方法
    public void methodCommon() {
        System.out.println("通用部分内容");
    }

    // 抽象方法
    public abstract void methodPersonal();

}
