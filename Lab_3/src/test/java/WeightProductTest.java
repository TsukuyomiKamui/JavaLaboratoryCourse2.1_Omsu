import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightProductTest {


    WeightProduct weightProduct1 = new WeightProduct("Мармеладки", "Фруктовые");
    WeightProduct weightProduct2 = new WeightProduct("Печенье","Курабье");
    WeightProduct weightProduct3 = new WeightProduct("Пряники","Лимонные");
    WeightProduct weightProduct4 = new WeightProduct("Мармеладки", "Фруктовые");


    @Test
    void testEquals() {
       boolean result1 = weightProduct1.equals(weightProduct2);
       boolean result2 = weightProduct2.equals(weightProduct3);
       boolean result3 = weightProduct1.equals(weightProduct4);

       assertFalse(result1);
       assertFalse(result2);
       assertTrue(result3);
    }

    @Test
    void testToString() {
        String expected1 = "Весовой товар: { Название товара: Мармеладки, Описание: Фруктовые}";
        String expected2 = "Весовой товар: { Название товара: Печенье, Описание: Курабье}";
        String expected3 = "Весовой товар: { Название товара: Пряники, Описание: Лимонные}";
        String result1 = weightProduct1.toString();
        String result2 = weightProduct2.toString();
        String result3 = weightProduct3.toString();

        assertEquals(expected1,result1);
        assertEquals(expected2,result2);
        assertEquals(expected3,result3);
    }
}