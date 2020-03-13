package encapsulate_collection;

import java.util.Collections;
import java.util.List;

/**
 * @author KuangXianXi
 */
public class PersonAfterRefactored {
    private String name;
    private List<Course> courses;

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
