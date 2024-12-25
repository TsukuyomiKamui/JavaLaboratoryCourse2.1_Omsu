import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionsTest {

    @Test
    void linearFunctionTest(){
        LinearFunction LFunc = new LinearFunction(1,3,2,5);

        assertEquals(6,LFunc.getValue(3));
        assertEquals(7,LFunc.getValue(4));
        assertThrows(IllegalArgumentException.class, () -> LFunc.getValue(9));
    }

    @Test
    void sinusFunctionTest(){
        SinusFunction SFunc = new SinusFunction(4,3,2,5);

        assertEquals(-1.1176619927957034, SFunc.getValue(2));
        assertEquals(-2.1462916720017398, SFunc.getValue(4));
        assertThrows(IllegalArgumentException.class, () -> SFunc.getValue(8));
    }

    @Test
    void retionalFunctionTest(){
        RationalFunction RFunc = new RationalFunction(2,5,3,7,2,8);

        assertEquals(1.1428571428571428, RFunc.getValue(3));
        assertEquals(1.1875, RFunc.getValue(4));
        assertThrows(IllegalArgumentException.class, () -> RFunc.getValue(6));
    }

    @Test
    void expFunctionTest(){
        ExpFunction EFunc = new ExpFunction(2,5,1,4);

        assertEquals(24.085536923187668,EFunc.getValue(3));
        assertEquals(58.598150033144236,EFunc.getValue(4));
        assertThrows(IllegalArgumentException.class, () -> EFunc.getValue(0));
    }

}
