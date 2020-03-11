package extract_variable;

/**
 * <p>提炼变量
 * 当变量的适用范围更大时，更好的选择是提炼成一个函数供整个类使用
 * </p>
 *
 * @author KuangXianXi
 */
public class ExtractVariableAfterRefactored02 {
    private Order order;

    public double price() {
        return getBasePrice() - getQuantityDiscount() + getShipping();
    }

    //运费
    private double getShipping() {
        return Math.min(getBasePrice() * 0.1, 100);
    }

    //批发折扣
    private double getQuantityDiscount() {
        return Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05;
    }

    //底价
    private double getBasePrice() {
        return order.getQuantity() * order.getItemPrice();
    }

}
