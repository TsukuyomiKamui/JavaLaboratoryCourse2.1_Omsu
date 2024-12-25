import java.util.Arrays;

public class FinanceReportProcessor {

    public FinanceReport getPaymentsBySurnameInitial(FinanceReport report, char ch) {
        Payment[] filteredPayments = Arrays.stream(report.getPayments())
                .filter(payment -> payment.getName().charAt(0) == ch)
                .toArray(Payment[]::new);

        return new FinanceReport(filteredPayments, report.getNameCreator(), report.getDayReport(), report.getMounthReport(), report.getYearReport());
    }

    public FinanceReport getPaymentsBelowAmount(FinanceReport report, int maxAmount) {
        Payment[] filteredPayments = Arrays.stream(report.getPayments())
                .filter(payment -> payment.getSumPayment() < maxAmount)
                .toArray(Payment[]::new);

        return new FinanceReport(filteredPayments, report.getNameCreator(), report.getDayReport(), report.getMounthReport(), report.getYearReport());
    }

}
