package ex04;

import java.util.ArrayDeque;
import java.util.Queue;

import static ex04.Category.PRINTER;

/**
 * Created by R.Karimov on 10/17/17.
 */
public class CategorisedHelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    private void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    private void processPrinterEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() == PRINTER) {
            enquiries.remove();
            enquiry.getCustomer().reply("Is it out of paper?");
        } else {
            System.out.println("No wort to do, let's have some coffee!");
        }
    }

    private void processGeneralEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() != PRINTER) {
            enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        } else {
            System.out.println("No wort to do, let's have some coffee!");
        }
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
