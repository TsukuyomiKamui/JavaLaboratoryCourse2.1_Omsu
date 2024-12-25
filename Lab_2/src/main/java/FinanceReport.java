import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {

    private Payment[] payments;
    private String nameCreator;
    private int dayReport;
    private int mounthReport;
    private int yearReport;

    public FinanceReport(Payment[] payments, String nameCreator, int dayReport, int mounthReport,int yearReport) {
        this.payments = payments;
        this.nameCreator = nameCreator;
        this.dayReport = dayReport;
        this.mounthReport = mounthReport;
        this.yearReport = yearReport;
    }
    public FinanceReport(){}

    public FinanceReport(FinanceReport fr){
        this(fr.payments, fr.nameCreator, fr.dayReport, fr.mounthReport, fr.yearReport);
    }


    public Payment[] getPayments() {
        return payments;
    }

    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    public String getNameCreator() {
        return nameCreator;
    }

    public void setNameCreator(String nameCreation) {
        this.nameCreator = nameCreation;
    }

    public int getDayReport() {
        return dayReport;
    }

    public void setDayReport(int dayReport) {
        this.dayReport = dayReport;
    }

    public int getMounthReport() {
        return mounthReport;
    }

    public void setMounthReport(int mounthReport) {
        this.mounthReport = mounthReport;
    }

    public int getYearReport() {
        return yearReport;
    }

    public void setYearReport(int yearReport) {
        this.yearReport = yearReport;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinanceReport)) return false;

        FinanceReport that = (FinanceReport) o;
        return dayReport == that.dayReport && mounthReport == that.mounthReport && yearReport == that.yearReport && Arrays.equals(payments, that.payments) && Objects.equals(nameCreator, that.nameCreator);
    }

    public int countPayment(FinanceReport report){
        return report.payments.length;
    }

    public  Payment getPayment(int index){
        return payments[index];
    }

    public void setPayment( int index, Payment payment ){
        payments[index] = payment;
    }
    public void getSum(){
        
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("[Автор: %s, дата: %s.%s.%s, Платежи: [\n", nameCreator,dayReport,mounthReport,yearReport ));
        for (Payment payment : payments) {
            sb.append(String.format("Плательщик: %s, дата: %s.%s.%s, Сумма: %s руб. коп. %s, \n", payment.getName(),payment.getDay(),payment.getMounth(), payment.getYear(),payment.getSumPayment()/100, payment.getSumPayment()%100));
        }
        sb.append("]]");
        return sb.toString();
    }
}
