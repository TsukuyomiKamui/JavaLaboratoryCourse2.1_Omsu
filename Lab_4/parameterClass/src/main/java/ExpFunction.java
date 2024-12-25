//f(x) = Aexp(x) + B.
public class ExpFunction implements ISingleArgumentFunction{
    public double A, B;
    public double start, end;

    public ExpFunction( double a,double b,double start,double end){
        this.start = start;
        this.end = end;
        A = a;
        B = b;
    }
    @Override
    public double getStart() {
        return start;
    }

    @Override
    public double getEnd() {
        return end;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > end || x < start) throw new IllegalArgumentException();
        return A*Math.exp(x) + B;
    }
}
