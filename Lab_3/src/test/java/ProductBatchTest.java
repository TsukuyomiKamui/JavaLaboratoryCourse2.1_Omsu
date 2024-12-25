import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBatchTest {

    ProductPackaging box = new ProductPackaging("Коробка", 0.2);
    ProductPackaging bag = new ProductPackaging("Мешок", 0.1);

    PieceProduct pieceProduct1 = new PieceProduct("Морковка", "Кормовая", 0.2);
    PieceProduct pieceProduct2 = new PieceProduct("Йогурт", "Черничный",0.35);
    PieceProduct pieceProduct3 = new PieceProduct("Молоко", "Фундучное",0.9);
    WeightProduct weightProduct1 = new WeightProduct("Мармеладки", "Фруктовые");
    WeightProduct weightProduct2 = new WeightProduct("Печенье","Курабье");
    WeightProduct weightProduct3 = new WeightProduct("Пряники","Лимонные");

    PackagedPieceProduct packagedPieceProduct1 = new PackagedPieceProduct(pieceProduct1, bag, 100);
    PackagedPieceProduct packagedPieceProduct2 = new PackagedPieceProduct(pieceProduct2,box, 20);
    PackagedPieceProduct packagedPieceProduct3 = new PackagedPieceProduct(pieceProduct3,box, 10);
    PackagedWeightProduct packagedWeightProduct1 = new PackagedWeightProduct(box, weightProduct2, 5.0);
    PackagedWeightProduct packagedWeightProduct2 = new PackagedWeightProduct(box, weightProduct3, 7.0);
    PackagedWeightProduct packagedWeightProduct3 = new PackagedWeightProduct(bag, weightProduct1, 3.0);

    PackagedProduct[] packagedProducts1 = {packagedPieceProduct1, packagedWeightProduct1,packagedWeightProduct3};
    PackagedProduct[] packagedProducts2 = {packagedPieceProduct2, packagedPieceProduct3,packagedWeightProduct2};

    ProductBatch productBatch1 = new ProductBatch("Товары первой категории", packagedProducts1);
    ProductBatch productBatch2 = new ProductBatch("Товары второй категории", packagedProducts2);
    ProductBatch productBatch3 = new ProductBatch("Товары первой категории", packagedProducts1);



    @Test
    void testEquals() {
        boolean res1 = productBatch1.equals(productBatch3);
        boolean res2 = packagedProducts2.equals(packagedProducts1);

        assertTrue(res1);
        assertFalse(res2);
    }

    @Test
    void testToString() {
        String expected1 =" Партия товаров: { Описание: Товары первой категории, Товары:" +
                " [ Упакованный штучный товар: { Имя товара: Морковка, Упаковка: Мешок, Всего товара: 100}," +
                "  Упакованный весовой товар: { Имя товара: Печенье, Упаковка: Коробка, Масса товара: 5.0}," +
                "  Упакованный весовой товар: { Имя товара: Мармеладки, Упаковка: Мешок, Масса товара: 3.0}]}";

        String expected2 = " Партия товаров: { Описание: Товары второй категории, Товары:" +
                " [ Упакованный штучный товар: { Имя товара: Йогурт, Упаковка: Коробка, Всего товара: 20}," +
                "  Упакованный штучный товар: { Имя товара: Молоко, Упаковка: Коробка, Всего товара: 10}," +
                "  Упакованный весовой товар: { Имя товара: Пряники, Упаковка: Коробка, Масса товара: 7.0}]}";

        String res1 = productBatch1.toString();
        String res2 = productBatch2.toString();

        assertEquals(expected1,res1);
        assertEquals(expected2,res2);
    }

    @Test
    void getGrossWeight() {
        double res1 = productBatch1.getGrossWeight();
        double res2 = productBatch2.getGrossWeight();

        assertEquals(28.4,res1);
        assertEquals(23.6, res2);
    }
}