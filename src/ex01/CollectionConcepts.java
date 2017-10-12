package ex01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by R.Karimov on 10/12/17.
 */
public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPaner = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPaner);
        products.add(window);
        System.out.println(products);

        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }
        System.out.println("---------------");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("---------------");
        System.out.println("Size: " + products.size());
        System.out.println("Is Empty: " + products.isEmpty());
        System.out.println("Contains Window: " + products.contains(window));
    }
}
