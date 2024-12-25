import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagedPieceProductTest {
    ProductPackaging box = new ProductPackaging("Коробка", 0.2);
    ProductPackaging bag = new ProductPackaging("Мешок", 0.1);

    PieceProduct pieceProduct1 = new PieceProduct("Морковка", "Кормовая", 0.2);
    PieceProduct pieceProduct2 = new PieceProduct("Йогурт", "Черничный",0.35);
    PieceProduct pieceProduct3 = new PieceProduct("Молоко", "Фундучное",0.9);

    PackagedPieceProduct packagedPieceProduct1 = new PackagedPieceProduct(pieceProduct1, bag, 100);
    PackagedPieceProduct packagedPieceProduct2 = new PackagedPieceProduct(pieceProduct2,box, 20);
    PackagedPieceProduct packagedPieceProduct3 = new PackagedPieceProduct(pieceProduct3,box, 10);


    @Test
    void getNetWeight() {
        double res1 = packagedPieceProduct1.getNetWeight();
        double res2 = packagedPieceProduct2.getNetWeight();
        double res3 = packagedPieceProduct3.getNetWeight();

        assertEquals(20,res1);
        assertEquals(7,res2);
        assertEquals(9,res3);
    }

    @Test
    void getGrossWeight() {
        double res1 = packagedPieceProduct1.getGrossWeight();
        double res2 = packagedPieceProduct2.getGrossWeight();
        double res3 = packagedPieceProduct3.getGrossWeight();

        assertEquals(20.1, res1);
        assertEquals(7.2, res2);
        assertEquals(9.2, res3);
    }

    @Test
    void testEquals() {
        boolean res1 = packagedPieceProduct1.equals(packagedPieceProduct2);
        boolean res2 = packagedPieceProduct2.equals(packagedPieceProduct3);
        boolean res3 = packagedPieceProduct3.equals(packagedPieceProduct1);

        assertFalse(res1);
        assertFalse(res2);
        assertFalse(res3);
    }

    @Test
    void testToString() {
        String expected1 = " Упакованный штучный товар: { Имя товара: Морковка, Упаковка: Мешок, Всего товара: 100}";
        String expected2 = " Упакованный штучный товар: { Имя товара: Йогурт, Упаковка: Коробка, Всего товара: 20}";
        String expected3 = " Упакованный штучный товар: { Имя товара: Молоко, Упаковка: Коробка, Всего товара: 10}";

        String res1 = packagedPieceProduct1.toString();
        String res2 = packagedPieceProduct2.toString();
        String res3 = packagedPieceProduct3.toString();

        assertEquals(expected1,res1);
        assertEquals(expected2,res2);
        assertEquals(expected3,res3);

    }
}