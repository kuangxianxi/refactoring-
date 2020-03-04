package first_sample.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KuangXianXi
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Performance {
    private String playId;
    private int audienceNum;
}
