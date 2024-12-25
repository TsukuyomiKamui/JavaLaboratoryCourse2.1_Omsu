public class SumFunctional<T extends ISingleArgumentFunction> implements IFunctional<T>  {
    private final double start, end;

    public SumFunctional(double start, double end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public double calculate(T func) {
        if (start < func.getStart() || end > func.getEnd()) throw new IllegalArgumentException();
        return func.getValue(func.getStart()) +
                func.getValue(func.getEnd()) +
                func.getValue((func.getStart() + func.getEnd()) / 2);
    }
}
