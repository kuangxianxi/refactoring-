package encapsulate_record;

/**
 * 封装记录
 * 1 提炼变量
 * 2 用类替换记录
 *
 * @author KuangXianXi
 */
public class EncapsulateRecordAfterRefactored {
    private Organization organization = new Organization();

    public void test() {
        //使用内部的数据
        System.out.println(organization.getName());

        //更改内部的数据
        organization.setName("newName");
    }
}
