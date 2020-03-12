package combine_functions_into_class;

/**
 * @author KuangXianXi
 */
public class Client01 {
    private Reading reading = new Reading("ivan", 10, 5, 2017);
    private double baseCharge = baseRate(reading.getMonth(), reading.getYear()) * reading.getQuantity();

    private double baseRate(int month, int year) {
        return 0;
    }
}
