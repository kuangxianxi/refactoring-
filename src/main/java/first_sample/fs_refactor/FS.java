package first_sample.fs_refactor;

import first_sample.common.Invoice;
import first_sample.common.Performance;
import first_sample.common.Play;

import java.util.Map;

/**
 * 原始实例
 *
 * @author KuangXianXi
 */
public class FS {
    public String statement(Invoice invoice, Map<String, Play> plays) {
        int totalAmount = 0;
        double volumeCredits = 0;

        StringBuilder result = new StringBuilder("Statement for " + invoice.getCustomer() + "\n");

        for (Performance performance : invoice.getPerformances()) {
            Play play = plays.get(performance.getPlayId());
            int thisAmount;
            switch (play.getType()) {
                case "tragedy":
                    thisAmount = 40000;
                    if (performance.getAudienceNum() > 30) {
                        thisAmount += 1000 * (performance.getAudienceNum() - 30);
                    }
                    break;
                case "comedy":
                    thisAmount = 30000;
                    if (performance.getAudienceNum() > 20) {
                        thisAmount += 10000 + 500 * (performance.getAudienceNum() - 20);
                    }
                    thisAmount += 300 * performance.getAudienceNum();
                    break;
                default:
                    throw new RuntimeException("unknown type : " + play.getType());
            }
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
}
