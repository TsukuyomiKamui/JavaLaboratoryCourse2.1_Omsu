import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionalTest {

    @Test
    void integralLinearFunctionTest(){

        LinearFunction l1 = new LinearFunction(1,2,-5,5);
        IntegralFunctional<LinearFunction> il1 = new IntegralFunctional<LinearFunction>(-1,1);
        assertEquals(il1.calculate(l1),3.8);

        LinearFunction l2 = new LinearFunction(4,3,-5,5);
        IFunctional<LinearFunction> il2 = new IntegralFunctional<LinearFunction>(4,0);
        assertEquals(il2.calculate(l2),-47.2);

    }


    @Test
    void integralSinusFunctionTest(){

        SinusFunction s1 = new SinusFunction(2,3,-5,5);
        IntegralFunctional<SinusFunction> is1 = new IntegralFunctional<SinusFunction>(-1,1);
        assertEquals(is1.calculate(s1),-0.05644800322394694);

        SinusFunction s2 = new SinusFunction(3,5,-5,5);
        IntegralFunctional<SinusFunction> is2 = new IntegralFunctional<SinusFunction>(-3,4);
        assertEquals(is2.calculate(s2),-1.4192798746016768);
    }

    @Test
    void integralRationalFunctionTest(){

        RationalFunction r1 = new RationalFunction(1,2,3,4,-5,5);
        IntegralFunctional<RationalFunction> ir1 = new IntegralFunctional<RationalFunction>(-1,1);
        assertEquals(ir1.calculate(r1),1.162555833134147);

        RationalFunction r2 = new RationalFunction(9,5,7,45,-5,5);
        IntegralFunctional<RationalFunction> ir2 = new IntegralFunctional<RationalFunction>(-2,2);
        assertEquals(ir2.calculate(r2),0.11784661075131365);

    }
    @Test
    void integralExpFunctionTest(){

        ExpFunction e1 = new ExpFunction(1,2,-5,5);
        IntegralFunctional<ExpFunction> ie1 = new IntegralFunctional<ExpFunction>(-1,1);
        assertEquals(ie1.calculate(e1),6.123191605036146);

        ExpFunction e2 = new ExpFunction(9,8,-5,5);
        IntegralFunctional<ExpFunction> ie2 = new IntegralFunctional<ExpFunction>(-2,3);
        assertEquals(ie2.calculate(e2),178.38902998030215);

    }

    @Test
    void sumFunctionalTest(){
        LinearFunction l1 = new LinearFunction(1,2,-5,5);
        SumFunctional<LinearFunction> sl1 = new SumFunctional<LinearFunction>(-5,5);
        assertEquals(sl1.calculate(l1),6.0);

        SinusFunction s1 = new SinusFunction(2,3,-5,5);
        SumFunctional<SinusFunction> ss1= new SumFunctional<SinusFunction>(-5,5);
        assertEquals(ss1.calculate(s1),0.0);

        RationalFunction r1 = new RationalFunction(1,2,3,4,-5,5);
        SumFunctional<RationalFunction> sr1 = new SumFunctional<RationalFunction>(-5,5);
        assertEquals(sr1.calculate(r1),1.1411483253588517);

        ExpFunction e1 = new ExpFunction(1,2,-5,5);
        SumFunctional<ExpFunction> se1 = new SumFunctional<>(-5,5);
        assertEquals(se1.calculate(e1),155.4198970495757);
    }


}
