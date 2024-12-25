import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {
    private final StringProcessor processor = new StringProcessor();

    @Test
    void testRepeatString() {
        assertEquals("abcabc", processor.repeatString("abc", 2));
        assertEquals("", processor.repeatString("abc", 0));
        assertThrows(IllegalArgumentException.class, () -> {
            processor.repeatString("abc", -1);
        });
    }

    @Test
    void testCountOccurrences(){
        assertEquals(1,processor.countOccurrences("Love","I Love Kiwi"));
        assertEquals(3, processor.countOccurrences("Kiwi","Kiwi Kiwi Banana Kiwi"));
        assertThrows(IllegalArgumentException.class, () -> {
            processor.countOccurrences("Kiwi", "");
        });
    }

    @Test
    void testReplacesymbol() {
        assertEquals("одиндва", processor.replaceSymbol("12"));
        assertEquals("триодин", processor.replaceSymbol("31"));
        assertEquals("abc", processor.replaceSymbol("abc"));
    }

    @Test
    void testRemoveEverySecondCharacter() {
        StringBuilder sb = new StringBuilder("abcdef");
        processor.removeEverySecondChar(sb);
        assertEquals("ace", sb.toString());

        StringBuilder sb2 = new StringBuilder("123456");
        processor.removeEverySecondChar(sb2);
        assertEquals("135", sb2.toString());
    }
}
