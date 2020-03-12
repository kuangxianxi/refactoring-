package inline_variable;

import extract_variable.Order;

/**
 * 内联变量
 *
 * @author KuangXianXi
 */
public class InlineVariableAfterRefactored {
    public double price(Order order) {
        return order.getItemPrice();
    }
}
