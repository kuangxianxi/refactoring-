package introduce_parameter_object;

import lombok.Data;

/**
 * @author KuangXianXi
 */
@Data
public class NumberRange {
    private int max;
    private int min;

    public boolean filterUnQualified(int temp) {
        return temp > max || temp < min;
    }
}
