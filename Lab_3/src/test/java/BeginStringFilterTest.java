import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest{

    String str = "Мама мыла раму";
    BeginStringFilter filter = new BeginStringFilter("мама");

    @Test
    void getPattern() {
        assertEquals(filter.getPattern(), "мама");
    }

    @Test
    void apply() {
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);

        assertTrue(res1);
        assertFalse(res2);
    }
}
