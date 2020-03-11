package extract_variable;

/**
 * <p>提炼变量</p>
 *
 * @author KuangXianXi
 */
public class ExtractVariableAfterRefactored {
    public double price(Order order) {
        //底价
        final double basePrice = order.getQuantity() * order.getItemPrice();
        //批发折扣
        final double quantityDiscount = Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05;
        //运费
        final double shipping = Math.min(basePrice * 0.1, 100);
        return basePrice - quantityDiscount + shipping;
    }
}
