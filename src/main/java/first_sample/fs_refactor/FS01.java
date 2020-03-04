package first_sample.fs_refactor;

import first_sample.common.Invoice;
import first_sample.common.Performance;
import first_sample.common.Play;
import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 第一次重构
 *
 * @author KuangXianXi
 */
@AllArgsConstructor
public class FS01 {
    private Invoice invoice;
    private Map<String, Play> plays;

    public String statement() {
        int totalAmount = 0;
        double volumeCredits = 0;

        StringBuilder result = new StringBuilder("Statement for " + invoice.getCustomer() + "\n");

        for (Performance performance : invoice.getPerformances()) {
            Play play = plays.get(performance.getPlayId());
            int thisAmount = amountFor(performance, play);
            //增加积分
            volumeCredits += Math.max(performance.getAudienceNum() - 30, 0);
            //每10个额外的戏剧节目观众增加积分
            if ("comedy".equals(play.getType())) {
                volumeCredits += Math.floor(performance.getAudienceNum() / 5);
            }

            //打印结果
            result.append(" ");
            result.append(play.getName());
            result.append(": $");
            result.append(thisAmount / 100);
            result.append("(");
            result.append(performance.getAudienceNum());
            result.append(" seats)\n");
            totalAmount += thisAmount;
        }
        result.append("Amount owed is $");
        result.append(totalAmount / 100);
        result.append("\n");
        result.append("You earned ");
        result.append(volumeCredits);
        result.append(" credits\n");
        return result.toString();
    }

    private int amountFor(Performance aPerformance, Play play) {
        int result;
        switch (play.getType()) {
            case "tragedy":
                result = 40000;
                if (aPerformance.getAudienceNum() > 30) {
                    result += 1000 * (aPerformance.getAudienceNum() - 30);
                }
                break;
            case "comedy":
                result = 30000;
                if (aPerformance.getAudienceNum() > 20) {
                    result += 10000 + 500 * (aPerformance.getAudienceNum() - 20);
                }
                result += 300 * aPerformance.getAudienceNum();
                break;
            default:
                throw new RuntimeException("unknown type : " + play.getType());
        }
        return result;
    }
}
