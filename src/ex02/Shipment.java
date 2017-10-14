package ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by R.Karimov on 10/14/17.
 */
public class Shipment implements Iterable<Product> {
    private final static int LIGHT_VAN_MAX_WEIGHT = 20;
    private final static int PRODUCT_NOT_PRESENT = -1;
    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    void add(Product product) {
        products.add(product);
    }

    private int findSplitPoint() {
        for (int i = 0; i < products.size(); i++) {
            final Product product = products.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                return i;
            }
        }
        return 0;
    }

    void prepare() {
        products.sort(Product.BY_WEIGHT);
        int splitPoint = findSplitPoint();
        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());
    }

    List<Product> getHeavyVanProducts() { return heavyVanProducts; }

    List<Product> getLightVanProducts() { return lightVanProducts; }

    public Iterator<Product> iterator() { return products.iterator(); }

    void replace(Product oldProduct, Product newProduct) {
        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT) {
            products.set(index, newProduct);
        }
    }
}
