package ex05;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by R.Karimov on 10/26/17.
 */
public class Java8Enhancements {
    public static void main(String[] args) {
        final Product defaultProduct = new Product(-1, "Whatever the custome wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        Product result1 = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result1);
        System.out.println(idToProduct.get(10));
        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        Product result2 = idToProduct.replace(1, new Product(1, "Big Door", 50));
        System.out.println(result2);
        System.out.println(idToProduct.get(4));
        System.out.println("--------------------");
        System.out.println();

        System.out.println(idToProduct);
        idToProduct.replaceAll((id, oldProduct) ->
                new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);
        System.out.println("--------------------");
        System.out.println();

        final Product result3 = idToProduct
                .computeIfAbsent(10, (id) -> new Product(id, "Custom Product", 10));
        System.out.println(result3);
        System.out.println(idToProduct.get(2));
        System.out.println("--------------------");
        System.out.println();

        idToProduct.forEach((key, value) ->
                System.out.println(key + " -> " + value));
    }
}
