package first_sample.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 剧目
 *
 * @author KuangXianXi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Play {
    private String name;
    private String type;
}
