package change_function_declaration;

import lombok.Data;

/**
 * @author KuangXianXi
 */
@Data
public class Custormer {
    private Address address;

    @Data
    static class Address {
        private String state;
    }
}

