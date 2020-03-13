package split_phase;

import lombok.Data;

/**
 * 产品
 *
 * @author KuangXianXi
 */
@Data
public class Product {
    private double basePrice;
    private int discountThreshold;
    private double discountRate;
}
