package ex03;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static ex03.Product.BY_NAME;

public class ProductCatalogue implements Iterable<Product> {
    private final Set<Product> products = new TreeSet<>(BY_NAME);

    void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products());
    }

    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
