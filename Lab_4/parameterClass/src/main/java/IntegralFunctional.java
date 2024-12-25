public class IntegralFunctional<T extends ISingleArgumentFunction> implements IFunctional<T>{

    private final double start, end;

    public IntegralFunctional(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double calculate(T func) throws IllegalArgumentException {
        if (start < func.getStart() || end > func.getEnd()) throw new IllegalArgumentException();

        double Sum = 0;
        int n = 10;
        double h = (end - start)/n;
        double t = start;
        for(int i = 0; i < n; i++){
            Sum += func.getValue(t)*h;
            t += h;
        }
        return Sum;
    }
}
