package encapsulate_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装集合
 *
 * @author KuangXianXi
 */
public class EncapsulatCollection {
    public static void main(String[] args) {
        Person person = new Person();
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("c1", true));
        courses.add(new Course("c2", false));
        person.setName("1");
        person.setCourses(courses);
        person.getCourses().add(new Course("c3", true));

        System.out.println(person.getCourses().size());

    }
}
