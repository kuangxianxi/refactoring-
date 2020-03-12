package combine_functions_into_class;

/**
 * @author KuangXianXi
 */
public class Client02 {
    private Reading reading = new Reading("ivan", 10, 5, 2017);
    private double base = baseRate(reading.getMonth(), reading.getYear()) * reading.getQuantity();
    private double taxableCharge = Math.max(0, base - taxThreshold(reading.getYear()));

    //门槛
    private double taxThreshold(int year) {
        return 0;
    }

    //基础费用
    private double baseRate(int month, int year) {
        return 0;
    }
}
