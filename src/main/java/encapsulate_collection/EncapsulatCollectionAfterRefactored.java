package encapsulate_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装集合
 * 1 添加集合的add和remove方法
 * 2 使获取集合的方法返回集合的副本或者一个不可变集合，防止外部直接修改集合
 *
 * @author KuangXianXi
 */
public class EncapsulatCollectionAfterRefactored {
    public static void main(String[] args) {
        PersonAfterRefactored person = new PersonAfterRefactored();
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("c1", true));
        courses.add(new Course("c2", false));
        person.setName("1");
        person.setCourses(courses);
        //返回的是不可变集合
//        person.getCourses().add(new Course("c3", true));
        person.addCourse(new Course("c3", true));

        System.out.println(person.getCourses().size());

    }
}
