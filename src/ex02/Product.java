package ex02;

import java.util.Comparator;

public class Product
{
    static final Comparator<Product> BY_WEIGHT
            = Comparator.comparing(Product::getWeight);

    private final String name;
    private final int weight;

    Product(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    int getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return "Product{" +
            "name='" + name + '\'' +
            ", weight=" + weight +
            '}';
    }
}
