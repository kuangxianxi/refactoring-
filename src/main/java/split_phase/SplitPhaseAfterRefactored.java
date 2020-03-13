package split_phase;

/**
 * 拆分阶段
 * <p>
 * 1 拆分两个阶段
 * 2 使第一阶段返回一个中转数据
 * 3 第二阶段使用这个中转数据
 *
 * @author KuangXianXi
 */
public class SplitPhaseAfterRefactored {
    public double priceOrder(Product product, Shipping shipping, int quality) {
        PriceData priceData = calculatePriceData(product, quality);
        return applyShipping(priceData, shipping);
    }

    private PriceData calculatePriceData(Product product, int quality) {
        double basePrice = quality * product.getBasePrice();
        double discount = Math.max(0, quality - product.getDiscountThreshold())
                * product.getBasePrice()
                * product.getDiscountRate();
        return new PriceData(basePrice, quality, discount);
    }

    private double applyShipping(PriceData priceData, Shipping shipping) {
        double shippingPerCase = (priceData.getBasePrice() > shipping.getDiscountThreshold()) ? shipping.getDiscountFee() : shipping.getFeePerCase();
        double shippingCost = priceData.getQuality() * shippingPerCase;
        return priceData.getBasePrice() - priceData.getDiscount() + shippingCost;
    }
}
