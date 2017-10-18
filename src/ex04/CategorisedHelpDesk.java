package ex04;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static ex04.Category.PRINTER;

/**
 * Created by R.Karimov on 10/17/17.
 */
public class CategorisedHelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    private void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    private void processPrinterEnquiry() {
        processEnquiry(
                enq -> enq.getCategory() == PRINTER,
                "Is it out of paper?");
    }

    private void processGeneralEnquiry() {
        processEnquiry(
                enq -> enq.getCategory() != PRINTER,
                "Have you tried turning it off and on again?");
    }

    public static void main(String[] args) {
        CategorisedHelpDesk helpDesk = new CategorisedHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
