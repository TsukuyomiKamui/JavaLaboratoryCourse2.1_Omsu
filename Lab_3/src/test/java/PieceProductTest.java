import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceProductTest {

    PieceProduct pieceProduct1 = new PieceProduct("Морковка", "Кормовая", 0.2);
    PieceProduct pieceProduct2 = new PieceProduct("Йогурт", "Черничный",0.35);
    PieceProduct pieceProduct3 = new PieceProduct("Молоко", "Фундучное",0.9);


    @Test
    void testEquals() {
        boolean result1 = pieceProduct1.equals(pieceProduct2);
        boolean result2 = pieceProduct2.equals(pieceProduct3);
        boolean result3 = pieceProduct3.equals(pieceProduct1);

        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
    }

    @Test
    void testToString() {
        String expected1 = " Штучный товар: { Имя товара: Морковка, Описание: Кормовая, Вес товара: 0.2}";
        String expected2 = " Штучный товар: { Имя товара: Йогурт, Описание: Черничный, Вес товара: 0.35}";
        String expected3 = " Штучный товар: { Имя товара: Молоко, Описание: Фундучное, Вес товара: 0.9}";

        String result1 = pieceProduct1.toString();
        String result2 = pieceProduct2.toString();
        String result3 = pieceProduct3.toString();

        assertEquals(expected1,result1);
        assertEquals(expected2,result2);
        assertEquals(expected3,result3);
    }
}