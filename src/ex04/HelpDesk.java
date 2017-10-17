package ex04;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by R.Karimov on 10/17/17.
 */
public class HelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    private void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    private void processAllEnquiries() {
        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processAllEnquiries();
    }
}
