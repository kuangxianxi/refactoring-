package introduce_parameter_object;

/**
 * 引入参数对象
 *
 * @author KuangXianXi
 */
public class IntroduceParameterObject {
    public void readingsOutsideRange(Station station, int max, int min) {
        station.getReadings()
                .stream()
                .filter(reading -> reading.getTemp() > max || reading.getTemp() < min)
                .map(Reading::toString)
                .close();
    }
}
