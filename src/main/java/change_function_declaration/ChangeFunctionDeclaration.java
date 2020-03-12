package change_function_declaration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 改变函数声明
 *
 * @author KuangXianXi
 */
public class ChangeFunctionDeclaration {
    //1,2 函数改名
    public double circum(double radius) {
        return 2 * Math.PI * radius;
    }

    List<String> reservations = new ArrayList<>();

    //3. 添加参数
    public void addReservation(String customer) {
        reservations.add(customer);
    }

    //4 把参数改为属性
    public boolean inNewEngland(Custormer custormer) {
        List<String> states = Arrays.asList("MA", "CT", "ME", "VT", "NH", "RI");
        return states.contains(custormer.getAddress().getState());
    }
}
