package extract_variable;

/**
 * <p>提炼变量</p>
 *
 * @author KuangXianXi
 */
public class ExtractVariable {
    public double price(Order order) {
        return order.getQuantity() * order.getItemPrice()
                - Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05
                + Math.min(order.getQuantity() * order.getItemPrice() * 0.1, 100);
    }
}
