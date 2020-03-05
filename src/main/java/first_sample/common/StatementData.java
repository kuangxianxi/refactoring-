package first_sample.common;

import lombok.Data;

/**
 * 中转数据
 *
 * @author KuangXianXi
 */
@Data
public class StatementData {
    private String customer;
    private Performance[] performances;
    private int totalAmount;
    private double totalVolumeCredits;
}
