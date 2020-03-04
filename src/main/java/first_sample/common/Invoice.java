package first_sample.common;

import lombok.Builder;
import lombok.Data;

/**
 * 账单
 *
 * @author KuangXianXi
 */
@Data
@Builder
public class Invoice {
    private String customer;
    private Performance[] performances;
}
