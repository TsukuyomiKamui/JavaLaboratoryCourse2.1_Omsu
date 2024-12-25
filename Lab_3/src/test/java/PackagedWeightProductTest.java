import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagedWeightProductTest {

    ProductPackaging box = new ProductPackaging("Коробка", 0.2);
    ProductPackaging bag = new ProductPackaging("Мешок", 0.1);

    WeightProduct weightProduct1 = new WeightProduct("Мармеладки", "Фруктовые");
    WeightProduct weightProduct2 = new WeightProduct("Печенье","Курабье");
    WeightProduct weightProduct3 = new WeightProduct("Пряники","Лимонные");


    PackagedWeightProduct packagedWeightProduct1 = new PackagedWeightProduct(box, weightProduct2, 5.0);
    PackagedWeightProduct packagedWeightProduct2 = new PackagedWeightProduct(box, weightProduct3, 7.0);
    PackagedWeightProduct packagedWeightProduct3 = new PackagedWeightProduct(bag, weightProduct1, 3.0);
    PackagedWeightProduct packagedWeightProduct4 = new PackagedWeightProduct(box, weightProduct2, 5.0);


    @Test
    void getNetWeight() {
        double result1 = packagedWeightProduct1.getNetWeight();
        double result2 = packagedWeightProduct2.getNetWeight();
        double result3 = packagedWeightProduct3.getNetWeight();

        assertEquals(5,result1);
        assertEquals(7,result2);
        assertEquals(3,result3);
    }

    @Test
    void getGrossWeight() {
        double res1 = packagedWeightProduct1.getGrossWeight();
        double res2 = packagedWeightProduct2.getGrossWeight();
        double res3 = packagedWeightProduct3.getGrossWeight();

        assertEquals(5.2, res1);
        assertEquals(7.2, res2);
        assertEquals(3.1, res3);
    }

    @Test
    void testEquals() {
        boolean res1 = packagedWeightProduct1.equals(packagedWeightProduct2);
        boolean res2 = packagedWeightProduct2.equals(packagedWeightProduct3);
        boolean res3 = packagedWeightProduct1.equals(packagedWeightProduct4);

        assertFalse(res1);
        assertFalse(res2);
        assertTrue(res3);
    }

    @Test
    void testToString() {
        String expected1 = " Упакованный весовой товар: { Имя товара: Пряники, Упаковка: Коробка, Масса товара: 3.0}";
        String expected2 = " Упакованный весовой товар: { Имя товара: Печенье, Упаковка: Коробка, Масса товара: 7.0}";
        String expected3 = " Упакованный весовой товар: { Имя товара: Мармеладки, Упаковка: Мешок, Масса товара: 5.0}";

        String res1 = packagedWeightProduct3.toString();
        String res2 = packagedWeightProduct2.toString();
        String res3 = packagedWeightProduct1.toString();

    }
}