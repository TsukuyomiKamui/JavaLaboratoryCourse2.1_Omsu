import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndStringFilterTest {
    String str = "Мама мыла раму";
    EndStringFilter filter = new EndStringFilter("раму");

    @Test
    void getPattern() {
        assertEquals(filter.getPattern(), "раму");
    }

    @Test
    void apply() {
        EndStringFilter filter1 = new EndStringFilter("Мама");
        EndStringFilter filter2 = new EndStringFilter("раму");

        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);

        assertFalse(res1);
        assertTrue(res2);
    }
}