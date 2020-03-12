package rename_variable;

/**
 * 变量改名
 *
 * @author KuangXianXi
 */
public class RenameVariableAfterRefactored {
    /**
     * 给变量改名
     * 1 先封装变量
     * 2 然后对变量改名
     * 3 还可以再内联函数
     */
    private String title = "untitled";

    public String getTitle() {
        return title;
    }

    public void setTitle(String tpHd) {
        this.title = tpHd;
    }

    /*
     * 给常量改名
     * 1 先复制常量
     * 2 再把旧常量引用新常量
     * 3 逐步修改旧常量的引用
     * 4 最后删除旧常量
     */
    public static final String companyName = "Acme Gooseberries";
    public static final String cpyName = companyName;
}
