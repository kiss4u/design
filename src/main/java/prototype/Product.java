package prototype;

import java.util.ArrayList;

/**
 *
 */
public class Product implements Cloneable {

    private ArrayList<String> list = new ArrayList<String>();

    @Override
    protected Product clone() {
        Product product = null;
        try {
            product = (Product) super.clone();
            product.list = (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e) {

        }
        return product;
    }
}
