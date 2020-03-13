package split_phase;

/**
 * 拆分阶段
 *
 * @author KuangXianXi
 */
public class SplitPhase {
    public double priceOrder(Product product, Shipping shipping, int quality) {
        double basePrice = quality * product.getBasePrice();
        double discount = Math.max(0, quality - product.getDiscountThreshold())
                * product.getBasePrice()
                * product.getDiscountRate();
        double shippingPerCase = (basePrice > shipping.getDiscountThreshold()) ? shipping.getDiscountFee() : shipping.getFeePerCase();
        double shippingCost = quality * shippingPerCase;
        double price = basePrice - discount + shippingCost;
        return price;
    }
}
