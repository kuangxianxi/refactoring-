package first_sample;

import first_sample.common.Invoice;
import first_sample.common.Performance;
import first_sample.common.Play;
import first_sample.fs_refactor.FS;
import first_sample.fs_refactor.FS01;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试实例
 *
 * @author KuangXianXi
 */
public class TestSample {
    public static void main(String[] args) {
        Performance[] performances = {new Performance("hamlet", 55),
                new Performance("as-like", 35),
                new Performance("othello", 40)};

        Invoice invoice = Invoice.builder().customer("BigCo").performances(performances).build();
        Map<String, Play> plays = new HashMap<>();
        plays.put("hamlet", new Play("Hamlet", "tragedy"));
        plays.put("as-like", new Play("As You Like It", "comedy"));
        plays.put("othello", new Play("Othello", "tragedy"));

        System.out.println(new FS().statement(invoice, plays));
        System.out.println("------------------------------------------");
        System.out.println(new FS01().statement(invoice, plays));
    }
}
