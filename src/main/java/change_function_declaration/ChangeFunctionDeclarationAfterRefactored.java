package change_function_declaration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 改变函数声明
 *
 * @author KuangXianXi
 */
public class ChangeFunctionDeclarationAfterRefactored {
    //1 函数改名(简单做法)
    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * 2 函数改名(迁移式做法)
     * 先提炼函数
     * 测试
     * 再在调用旧函数的地方使用内联函数，调用新函数
     * 修改完之后，就可以删除旧函数
     */
    public double circum(double radius) {
        return circumference2(radius);
    }

    private double circumference2(double radius) {
        return 2 * Math.PI * radius;
    }

    List<String> reservations = new ArrayList<>();

    //3. 添加参数(迁移式做法)
    public void addReservation(String customer) {
        zz_addReservation(customer, false);
    }

    private void zz_addReservation(String customer, boolean isPriority) {
        assert (isPriority || !isPriority);
        reservations.add(customer);
    }


    /**
     * 4 把参数改为属性(迁移式做法)
     * 使方法不依赖于Custormer对象
     */
    public boolean inNewEngland(Custormer custormer) {
        return zz_inNewEngland(custormer.getAddress().getState());
    }

    private boolean zz_inNewEngland(String stateCode) {
        List<String> states = Arrays.asList("MA", "CT", "ME", "VT", "NH", "RI");
        return states.contains(stateCode);
    }
}
