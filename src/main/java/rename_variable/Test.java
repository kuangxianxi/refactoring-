package rename_variable;

/**
 * 调用方
 *
 * @author KuangXianXi
 */
public class Test {
    public static void main(String[] args) {
        //重构前
        RenameVariable renameVariable = new RenameVariable();
        System.out.println(renameVariable.tpHd);
        renameVariable.tpHd = "articleTitle";

        //重构后
        RenameVariableAfterRefactored renameVariableAfterRefactored = new RenameVariableAfterRefactored();
        System.out.println(renameVariableAfterRefactored.getTitle());
        renameVariableAfterRefactored.setTitle("articleTitle");
    }
}
