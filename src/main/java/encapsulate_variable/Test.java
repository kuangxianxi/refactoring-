package encapsulate_variable;

/**
 * 调用方
 *
 * @author KuangXianXi
 */
public class Test {
    public static void main(String[] args) {
        //重构前
        EncupsulateVariable encupsulateVariable = new EncupsulateVariable();
        System.out.println(encupsulateVariable.defaultOwner);
        encupsulateVariable.defaultOwner = "Rebecca";
        //重构后
        EncupsulateVariableAfterRefactored encupsulateVariableAfterRefactored = new EncupsulateVariableAfterRefactored();
        System.out.println(encupsulateVariableAfterRefactored.getDefaultOwner());
        encupsulateVariableAfterRefactored.setDefaultOwner("Rebecca");
    }
}
