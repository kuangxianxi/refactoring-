package split_phase;

import lombok.Data;

/**
 * 配送
 *
 * @author KuangXianXi
 */
@Data
public class Shipping {
    private int discountThreshold;
    private double discountFee;
    private double feePerCase;
}
