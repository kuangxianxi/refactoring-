package combine_functions_into_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KuangXianXi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadingAfterRefactored {
    private String customer;
    private int quantity;
    private int month;
    private int year;

    public double baseCharge() {
        return baseRate(this.month, this.year) * this.quantity;
    }

    private double baseRate(int month, int year) {
        return 0;
    }

    public double taxableCharge() {
        return Math.max(0, baseCharge() - taxThreshold(this.year));
    }

    private double taxThreshold(int year) {
        return 0;
    }
}
