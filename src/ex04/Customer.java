package ex04;

/**
 * Created by R.Karimov on 10/17/17.
 */
public class Customer {
    static final Customer JACK = new Customer("Jack");
    static final Customer JILL = new Customer("Jill");
    public static final Customer MARY = new Customer("Mary");

    private final String name;

    private Customer(String name) {
        this.name = name;
    }

    void reply(final String message) {
        System.out.printf("%s: %s\n", name, message);
    }
}
