package combine_functions_into_class;

/**
 * @author KuangXianXi
 */
public class Client02AfterRefactored {
    private ReadingAfterRefactored reading = new ReadingAfterRefactored("ivan", 10, 5, 2017);
    private double taxableCharge = reading.taxableCharge();
}
