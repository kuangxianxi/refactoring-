package introduce_parameter_object;

import lombok.Data;

import java.util.List;

/**
 * @author KuangXianXi
 */
@Data
public class Station {
    private String name;
    private List<Reading> readings;
}
