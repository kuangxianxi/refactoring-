package encapsulate_collection;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author KuangXianXi
 */
@Data
@AllArgsConstructor
public class Course {
    private String name;
    private boolean isAdvanced;
}
