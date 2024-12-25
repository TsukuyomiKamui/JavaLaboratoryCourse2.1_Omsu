import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTrinomialTest {
    @Test
    public void testGetRootsWithCorrectParameter(){
        SquareTrinomial test = new SquareTrinomial(1,2,1);
        SquareTrinomial test1 = new SquareTrinomial(1,-3.,2);
        assertArrayEquals(new double[]{-1., -1.}, test.getRoots(), 0.0001);
        assertArrayEquals(new double[]{2., 1.}, test1.getRoots(),0.0001);
    }

    @Test
    public void testGetRootsWithIncorrectParameter(){
        SquareTrinomial test = new SquareTrinomial(1,2,5);
        assertThrows(IllegalArgumentException.class, () -> new SquareTrinomial(0,-3.,2));
        assertThrows(IllegalArgumentException.class, test::getRoots);
    }
}