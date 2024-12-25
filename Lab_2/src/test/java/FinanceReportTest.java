import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FinanceReportTest {
    private final FinanceReport processor = new FinanceReport();


    Payment pay1 = new Payment("Иванов Иван Иванович", 21,3,2020, 2000);
    Payment pay2 = new Payment("Петров Пётр Петрович", 3, 6, 2021,2300);
    Payment pay3 = new Payment("Ефимов Акакий Георгиевич", 7,4,2020, 3000);
    Payment pay4 = new Payment("Козодоев Антон Павлович", 30,11,2020,1500);
    Payment pay5 = new Payment("Казладоев Валерий Никонорович", 1,12,2021,5000);

    Payment[] payments1 = {pay1, pay2, pay3};
    Payment[] payments2 = {pay2, pay3, pay4, pay5};
    Payment[] payments3 = {pay1,pay2,pay3,pay4,pay5};

    FinanceReport report1 = new FinanceReport(payments1, "Иванова Антонина Петровна", 30,6,2021);
    FinanceReport report2 = new FinanceReport(payments2, "Рождественская Галина Николевна",30,12,2021);
    FinanceReport report3 = new FinanceReport(payments3, "Ларионов Данил Васильевич", 1,12,2022);
    FinanceReport report4 = new FinanceReport(payments1, "Иванова Антонина Петровна", 30,6,2021);

    @Test
    void equalsTest(){
        assertNotEquals(report1, report2);
        assertNotEquals(report1, report3);
        assertEquals(report1, report4);
    }

    @Test
    void countPaymentTest(){
        assertEquals(3,processor.countPayment(report1));
        assertEquals(4,processor.countPayment(report2));
        assertEquals(5,processor.countPayment(report3));
    }

    @Test
    void getPaymentTest(){
        Payment p1 = report1.getPayment(1);
        Payment p2 = report2.getPayment(2);
        Payment p3 = report3.getPayment(3);

        assertEquals(pay2,p1);
        assertEquals(pay4,p2);
        assertEquals(pay4,p3);
    }

    @Test
    void toStringTest(){
        String rep1 = "[Автор: Иванова Антонина Петровна, дата: 30.6.2021, Платежи: [\n" +
                "Плательщик: Иванов Иван Иванович, дата: 21.3.2020, Сумма: 20 руб. коп. 0, \n" +
                "Плательщик: Петров Пётр Петрович, дата: 3.6.2021, Сумма: 23 руб. коп. 0, \n" +
                "Плательщик: Ефимов Акакий Георгиевич, дата: 7.4.2020, Сумма: 30 руб. коп. 0, \n" +
                "]]";
        String rep2 = "[Автор: Рождественская Галина Николевна, дата: 30.12.2021, Платежи: [\n" +
                "Плательщик: Петров Пётр Петрович, дата: 3.6.2021, Сумма: 23 руб. коп. 0, \n" +
                "Плательщик: Ефимов Акакий Георгиевич, дата: 7.4.2020, Сумма: 30 руб. коп. 0, \n" +
                "Плательщик: Козодоев Антон Павлович, дата: 30.11.2020, Сумма: 15 руб. коп. 0, \n" +
                "Плательщик: Казладоев Валерий Никонорович, дата: 1.12.2021, Сумма: 50 руб. коп. 0, \n" +
                "]]";
        String rep3 = "[Автор: Ларионов Данил Васильевич, дата: 1.12.2022, Платежи: [\n" +
                "Плательщик: Иванов Иван Иванович, дата: 21.3.2020, Сумма: 20 руб. коп. 0, \n" +
                "Плательщик: Петров Пётр Петрович, дата: 3.6.2021, Сумма: 23 руб. коп. 0, \n" +
                "Плательщик: Ефимов Акакий Георгиевич, дата: 7.4.2020, Сумма: 30 руб. коп. 0, \n" +
                "Плательщик: Козодоев Антон Павлович, дата: 30.11.2020, Сумма: 15 руб. коп. 0, \n" +
                "Плательщик: Казладоев Валерий Никонорович, дата: 1.12.2021, Сумма: 50 руб. коп. 0, \n" +
                "]]";

        assertEquals(rep1,report1.toString());
        assertEquals(rep2,report2.toString());
        assertEquals(rep3,report3.toString());

    }




}
