package inline_variable;

import extract_variable.Order;

/**
 * 内联变量
 *
 * @author KuangXianXi
 */
public class InlineVariable {
    public double price(Order order) {
        double itemPrice = order.getItemPrice();
        return itemPrice;
    }
}
