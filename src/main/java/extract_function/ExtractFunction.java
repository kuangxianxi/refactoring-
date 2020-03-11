package extract_function;

import java.time.LocalDateTime;

/**
 * 提炼函数
 *
 * @author KuangXianXi
 */
public class ExtractFunction {
    public void printOwing(Invoice invoice) {
        int outstanding = 0;

        System.out.println("***********************");
        System.out.println("**** Customer Owes ****");
        System.out.println("***********************");

        //calculate outstanding
        for (Order order : invoice.getOrder()) {
            outstanding += order.getAmount();
        }

        //record due date
        invoice.setDueDate(LocalDateTime.now().plusDays(30));

        //print details
        System.out.println("name : " + invoice.getCustomer());
        System.out.println("amount : " + outstanding);
        System.out.println("due : " + invoice.getDueDate().toString());
    }
}
