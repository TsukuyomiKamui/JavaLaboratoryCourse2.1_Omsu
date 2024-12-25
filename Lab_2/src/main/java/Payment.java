import java.util.Objects;

public class Payment {

    private String name;
    private int day;
    private int mounth;
    private int year;
    private int sumPayment;

    public Payment(String name, int day, int mounth, int year, int sumPayment) {
        this.name = name;
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        this.sumPayment = sumPayment;
    }

    public Payment() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSumPayment() {
        return sumPayment;
    }

    public void setSumPayment(int sumPayment) {
        this.sumPayment = sumPayment;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment = (Payment) o;
        return day == payment.day && mounth == payment.mounth && year == payment.year && sumPayment == payment.sumPayment && Objects.equals(name, payment.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + day;
        result = 31 * result + mounth;
        result = 31 * result + year;
        result = 31 * result + sumPayment;
        return result;
    }

    @Override
    public String toString() {
        return "Платёж{" +
                "ФИО плательщика='" + name + '\'' +
                ", День=" + day +
                ", Месяц=" + mounth +
                ", Год=" + year +
                ", Сумма платежа=" + sumPayment +
                '}';
    }
}
