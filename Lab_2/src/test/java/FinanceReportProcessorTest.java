import org.junit.jupiter.api.Test;

public class FinanceReportProcessorTest {

    private final FinanceReportProcessor processor = new FinanceReportProcessor();

    Payment pay1 = new Payment("Ivanov Иван Иванович", 21,3,2020, 2000);
    Payment pay2 = new Payment("Petrov Пётр Петрович", 3, 6, 2021,2300);
    Payment pay3 = new Payment("Efimov Акакий Георгиевич", 7,4,2020, 3000);
    Payment pay4 = new Payment("Kozodoev Антон Павлович", 30,11,2020,1500);
    Payment pay5 = new Payment("Kazladoev Валерий Никонорович", 1,12,2021,5000);

    Payment[] payments1 = {pay1, pay2, pay3};
    Payment[] payments2 = {pay2, pay3, pay4, pay5};
    Payment[] payments3 = {pay1,pay2,pay3,pay4,pay5};

    FinanceReport report1 = new FinanceReport(payments1, "Ivanova Антонина Петровна", 30,6,2021);
    FinanceReport report2 = new FinanceReport(payments2, "Rojdestvenskaya Галина Николевна",30,12,2021);
    FinanceReport report3 = new FinanceReport(payments3, "Larionov Данил Васильевич", 1,12,2022);
    FinanceReport report4 = new FinanceReport(payments1, "Ivanova Антонина Петровна", 30,6,2021);

    @Test
    void getPaymentsBySurnameInitialTest(){
        FinanceReport res1 =
    }
}
