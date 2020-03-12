package combine_functions_into_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KuangXianXi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reading {
    private String customer;
    private int quantity;
    private int month;
    private int year;
}
