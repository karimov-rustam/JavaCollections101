package ex05;

/**
 * Created by R.Karimov on 10/26/17.
 */
public class Product extends ex03.Product {
    private final int id;
    public Product(final int id, final String name, final int weight) {
        super(name, weight);
        this.id = id;
    }

    int getId() {
        return id;
    }
}
