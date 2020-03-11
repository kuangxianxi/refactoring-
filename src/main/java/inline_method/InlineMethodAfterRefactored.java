package inline_method;


import java.util.HashMap;
import java.util.Map;

/**
 * 内联函数
 *
 * @author KuangXianXi
 */
public class InlineMethodAfterRefactored {
    //1
    public int rating(Driver driver) {
        return (driver.getNumberOfLateDeliveries() > 5) ? 2 : 1;
    }

    //2
    public int rating2(Driver driver) {
        return (driver.getNumberOfLateDeliveries() > 5) ? 2 : 1;
    }

    //3
    public Map<String, String> reportLines(Customer aCustomer) {
        Map<String, String> line = new HashMap<>(2);
        line.put("name", aCustomer.getName());
        line.put("location", aCustomer.getLocation());
        return line;
    }
}
