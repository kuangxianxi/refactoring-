package encapsulate_variable;

/**
 * 封装变量
 * 将“重新组织数据”转化为“重新组织函数”
 * <p>
 * 1. 提供访问数据的函数
 * 2. 还可以重构访问数据的函数，使其返回一份副本，这样外部的修改不会影响到原始数据(Java中可以在使用的时候new新对象)
 *
 * @author KuangXianXi
 */
public class EncupsulateVariableAfterRefactored {
    private String defaultOwner = "Martin";

    public String getDefaultOwner() {
        return defaultOwner;
    }

    public void setDefaultOwner(String defaultOwner) {
        this.defaultOwner = defaultOwner;
    }
}
