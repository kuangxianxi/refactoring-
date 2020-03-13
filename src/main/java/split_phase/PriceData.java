package split_phase;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 中转数据
 *
 * @author KuangXianXi
 */
@Data
@AllArgsConstructor
public class PriceData {
    private double basePrice;
    private int quality;
    private double discount;
}
