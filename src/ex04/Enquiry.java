package ex04;

/**
 * Created by R.Karimov on 10/17/17.
 */
public class Enquiry {
    private final Customer customer;
    private final Category category;

    Enquiry(final Customer customer, final Category category) {
        this.customer = customer;
        this.category = category;
    }

    Customer getCustomer() {
        return customer;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "customer=" + customer +
                ", category=" + category +
                '}';
    }
}
