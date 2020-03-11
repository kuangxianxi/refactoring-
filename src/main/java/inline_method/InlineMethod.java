package inline_method;


import java.util.HashMap;
import java.util.Map;

/**
 * 内联函数
 *
 * @author KuangXianXi
 */
public class InlineMethod {
    //1
    public int rating(Driver driver) {
        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
    }

    public boolean moreThanFiveLateDeliveries(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5;
    }

    //2
    public int rating2(Driver driver) {
        return moreThanFiveLateDeliveries2(driver) ? 2 : 1;
    }

    public boolean moreThanFiveLateDeliveries2(Driver aDriver) {
        return aDriver.getNumberOfLateDeliveries() > 5;
    }

    //3
    public Map<String, String> reportLines(Customer aCustomer) {
        Map<String, String> line = new HashMap<>(2);
        gatherCustomerData(line, aCustomer);
        return line;
    }

    private void gatherCustomerData(Map<String, String> out, Customer aCustomer) {
        out.put("name", aCustomer.getName());
        out.put("location", aCustomer.getLocation());
    }
}
