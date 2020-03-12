package introduce_parameter_object;

/**
 * 引入参数对象
 * 1 将数据参数封装为对象，并作为函数参数传入
 * 2 修改原函数中对参数的引用
 * 3 将对数据的各种行为提炼、搬运到封装的对象中(把数据和函数绑定起来)，并调用这个函数
 *
 * @author KuangXianXi
 */
public class IntroduceParameterObjectAfterRefactored {

    public void readingsOutsideRange(Station station, NumberRange numberRange) {
        station.getReadings()
                .stream()
                .filter(reading -> numberRange.filterUnQualified(reading.getTemp()))
                .map(Reading::toString)
                .close();
    }
}
