package encapsulate_collection;

import lombok.Data;

import java.util.List;

/**
 * @author KuangXianXi
 */
@Data
public class Person {
    private String name;
    private List<Course> courses;
}
