
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest  {

        Product product1 = new Product("Яблоки", "Зелёные");
        Product product2 = new Product("Мармелад", "Яблочный");

    @Test
    void testEquals() {
        boolean result1 = product1.equals(product2);
        boolean result2 = product2.equals(product2);

        assertFalse(result1);
        assertTrue(result2);
    }

    @Test
    void testToString() {
        String expected1 = "Товар{ Название товара: Яблоки, Описание товара: Зелёные}";
        String result1 = product1.toString();

        String expected2 = "Товар{ Название товара: Мармелад, Описание товара: Яблочный}";
        String result2 = product2.toString();

        assertEquals(expected1,result1);
        assertEquals(expected2, result2);


    }
}

