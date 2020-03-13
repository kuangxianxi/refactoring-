package encapsulate_record;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装记录
 *
 * @author KuangXianXi
 */
public class EncapsulateRecord {
    final Map<String, String> organization = new HashMap<>();

    public void test() {
        //使用内部的数据
        System.out.println(organization.get("name"));

        //更改内部的数据
        organization.put("name", "newName");
    }
}
