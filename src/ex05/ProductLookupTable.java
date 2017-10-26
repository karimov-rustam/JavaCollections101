package ex05;

/**
 * Created by R.Karimov on 10/26/17.
 */
public interface ProductLookupTable {
    Product lookupById(int id);

    void addProduct(Product productToAdd);

    void clear();
}
