import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTrinomialKeeperTest {
    @Test
    public void testGetGreaterRootWithCorrectParameter() {
        SquareTrinomialKeeper test = new SquareTrinomialKeeper(1,2,1);
        SquareTrinomialKeeper test1 = new SquareTrinomialKeeper(1,-3,2);

        assertEquals(-1,test.getGreaterRoot(), 0.001);
        assertEquals(2, test1.getGreaterRoot(),0.001);
    }

    @Test
    public void Test1 () {
        SquareTrinomialKeeper temp = new SquareTrinomialKeeper(4, -7, -2);
        double ans = temp.getGreaterRoot();
        assertEquals(ans, 2, 0.001);
    }

    @Test
    public void testGetGreaterRootWithIncorrectParameter() {
        SquareTrinomialKeeper test = new SquareTrinomialKeeper(1,2,5);
        assertThrows(IllegalArgumentException.class, test::getGreaterRoot);
    }
}
