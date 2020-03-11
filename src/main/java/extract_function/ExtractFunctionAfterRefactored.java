package extract_function;

import java.time.LocalDateTime;

/**
 * 提炼函数
 *
 * @author KuangXianXi
 */
public class ExtractFunctionAfterRefactored {
    public void printOwing(Invoice invoice) {
        printBanner();
        int outstanding = calculateOutstanding(invoice);
        recordDueDate(invoice);
        printDetails(invoice, outstanding);

    }

    private int calculateOutstanding(Invoice invoice) {
        int result = 0;
        for (Order order : invoice.getOrder()) {
            result += order.getAmount();
        }
        return result;
    }

    private void recordDueDate(Invoice invoice) {
        invoice.setDueDate(LocalDateTime.now().plusDays(30));
    }

    private void printDetails(Invoice invoice, int outstanding) {
        System.out.println("name : " + invoice.getCustomer());
        System.out.println("amount : " + outstanding);
        System.out.println("due : " + invoice.getDueDate().toString());
    }

    private void printBanner() {
        System.out.println("***********************");
        System.out.println("**** Customer Owes ****");
        System.out.println("***********************");
    }
}
