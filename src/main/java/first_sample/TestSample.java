package first_sample;

import first_sample.common.Invoice;
import first_sample.common.Performance;
import first_sample.common.Play;
import first_sample.fs_refactor.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试实例
 *
 * @author KuangXianXi
 */
public class TestSample {
    public static void main(String[] args) {
        Performance hamlet = Performance.builder().playId("hamlet").audienceNum(55).build();
        Performance asLike = Performance.builder().playId("as-like").audienceNum(35).build();
        Performance othello = Performance.builder().playId("othello").audienceNum(40).build();
        Performance[] performances = {hamlet, asLike, othello};

        Invoice invoice = Invoice.builder().customer("BigCo").performances(performances).build();
        Map<String, Play> plays = new HashMap<>();
        plays.put("hamlet", new Play("Hamlet", "tragedy"));
        plays.put("as-like", new Play("As You Like It", "comedy"));
        plays.put("othello", new Play("Othello", "tragedy"));

        System.out.println(new FS(invoice, plays).statement());
        System.out.println("------------------------------------------");
        System.out.println(new FS01(invoice, plays).statement());
        System.out.println("------------------------------------------");
        System.out.println(new FS02(invoice, plays).statement());
        System.out.println("------------------------------------------");
        System.out.println(new FS03(invoice, plays).statement());
        System.out.println("------------------------------------------");
        System.out.println(new FS04(new FS04CreatementStatement(plays)).statement(invoice));
        System.out.println("------------------------------------------");
        System.out.println(new FS04(new FS04CreatementStatement(plays)).htmlStatement(invoice));
    }
}
