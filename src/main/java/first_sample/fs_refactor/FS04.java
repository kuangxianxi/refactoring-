package first_sample.fs_refactor;

import first_sample.common.Invoice;
import first_sample.common.Performance;
import first_sample.common.StatementData;
import lombok.AllArgsConstructor;

/**
 * 第四次重构
 *
 * @author KuangXianXi
 */
@AllArgsConstructor
public class FS04 {
    private FS04CreatementStatement fs04CreatementStatement;

    public String statement(Invoice invoice) {
        return renderPlainText(fs04CreatementStatement.createStatementData(invoice));
    }

    public String htmlStatement(Invoice invoice) {
        return renderPlainHtml(fs04CreatementStatement.createStatementData(invoice));
    }

    private String renderPlainHtml(StatementData data) {
        StringBuilder result = new StringBuilder("<h1>Statement for " + data.getCustomer() + "</h1>\n");
        result.append("<table>\n");
        result.append("<tr><th>play</th><th>seats</th><th>cost</th></tr>");
        for (Performance performance : data.getPerformances()) {
            result.append("<tr><td>");
            result.append(performance.getPlay().getName());
            result.append("</td><td>");
            result.append(performance.getAudienceNum());
            result.append("</td><td>$");
            result.append(usd(performance.getAmount()));
            result.append("</td></tr>\n");
        }
        result.append("</table>\n");
        result.append("<p>Amount owed is <em>$");
        result.append(usd(data.getTotalAmount()));
        result.append("</em></p>\n");
        result.append("<p>You earned <em>$");
        result.append(data.getTotalVolumeCredits());
        result.append("</em> credits</p>\n");
        return result.toString();
    }

    private String renderPlainText(StatementData data) {
        StringBuilder result = new StringBuilder("Statement for " + data.getCustomer() + "\n");
        for (Performance performance : data.getPerformances()) {
            result.append(" ");
            result.append(performance.getPlay().getName());
            result.append(": $");
            result.append(usd(performance.getAmount()));
            result.append("(");
            result.append(performance.getAudienceNum());
            result.append(" seats)\n");
        }
        result.append("Amount owed is $");
        result.append(usd(data.getTotalAmount()));
        result.append("\n");
        result.append("You earned ");
        result.append(data.getTotalVolumeCredits());
        result.append(" credits\n");
        return result.toString();
    }

    public int usd(int aNumber) {
        return aNumber / 100;
    }
}
