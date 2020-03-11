package extract_function;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 发票
 *
 * @author KuangXianXi
 */
@Data
public class Invoice {
    private Order[] order;

    private LocalDateTime dueDate;

    private String customer;
}
