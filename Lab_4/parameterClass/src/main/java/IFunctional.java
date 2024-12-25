public interface IFunctional <T extends ISingleArgumentFunction>{

    double calculate(T func);
}
