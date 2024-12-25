
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductPackagingTest extends ProductPackaging {


    ProductPackaging box = new ProductPackaging("Коробка", 0.2);
    ProductPackaging bag = new ProductPackaging("Мешок", 0.1);
    ProductPackaging cage = new ProductPackaging("Клетка", 15.0);


    @Test
    void testEquals() {
        boolean result = box.equals(bag);
        boolean result1 = box.equals(cage);
        boolean result2 = cage.equals(cage);

        assertFalse(result);
        assertFalse(result1);
        assertTrue(result2);
    }

    @Test
    void testToString() {
        String expected1 = "Упаковка{ Название: Коробка, Вес: 0.1}";
        String result1 = box.toString();

        String expected2 = "Упаковка{ Название: Мешок, Вес: 0.01}";
        String result2 = bag.toString();

        assertEquals(expected1,result1);
        assertEquals(expected2,result2);

    }
}