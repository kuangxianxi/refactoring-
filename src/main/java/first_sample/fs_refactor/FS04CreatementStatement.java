package first_sample.fs_refactor;

import first_sample.common.Invoice;
import first_sample.common.Performance;
import first_sample.common.Play;
import first_sample.common.StatementData;
import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 第四次重构
 *
 * @author KuangXianXi
 */
@AllArgsConstructor
public class FS04CreatementStatement {
    private Map<String, Play> plays;

    public StatementData createStatementData(Invoice invoice) {
        StatementData result = new StatementData();
        result.setCustomer(invoice.getCustomer());
        result.setPerformances(enrichPerformance(invoice.getPerformances()));
        result.setTotalAmount(totalAmount(result));
        result.setTotalVolumeCredits(totalVolumeCredits(result));
        return result;
    }

    private Performance[] enrichPerformance(Performance[] performances) {
        for (Performance performance : performances) {
            performance.setPlay(playFor(performance));
            performance.setAmount(amountFor(performance));
            performance.setVolumeCredits(volumeCreditsFor(performance));
        }
        return performances;
    }

    private int totalAmount(StatementData data) {
        int result = 0;
        for (Performance performance : data.getPerformances()) {
            result += performance.getAmount();
        }
        return result;
    }

    //提炼函数
    private double totalVolumeCredits(StatementData data) {
        //移动语句
        double result = 0;
        //拆分循环
        for (Performance performance : data.getPerformances()) {
            result += performance.getVolumeCredits();
        }
        return result;
    }

    private double volumeCreditsFor(Performance performance) {
        double result = 0;
        //增加积分
        result += Math.max(performance.getAudienceNum() - 30, 0);
        //每10个额外的戏剧节目观众增加积分
        if ("comedy".equals(performance.getPlay().getType())) {
            result += Math.floor(performance.getAudienceNum() / 5);
        }
        return result;
    }

    private Play playFor(Performance performance) {
        return plays.get(performance.getPlayId());
    }

    private int amountFor(Performance aPerformance) {
        int result;
        switch (aPerformance.getPlay().getType()) {
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
                throw new RuntimeException("unknown type : " + aPerformance.getPlay().getType());
        }
        return result;
    }
}
