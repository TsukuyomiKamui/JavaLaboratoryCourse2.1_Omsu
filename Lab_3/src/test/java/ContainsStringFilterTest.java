import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsStringFilterTest extends Product {
    String str = "Мама мыла раму";
    ContainsStringFilter filter = new ContainsStringFilter("мыла");

    @Test
    void getPattern() {
        assertEquals(filter.getPattern(), "мыла");
    }

    @Test
    void apply() {
        ContainsStringFilter filter1 = new ContainsStringFilter("Мама");
        ContainsStringFilter filter2 = new ContainsStringFilter("посуду");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);

        assertTrue(res1);
        assertFalse(res2);
    }
}