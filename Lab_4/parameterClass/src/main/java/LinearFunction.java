//f(x) = Ax + B
public class LinearFunction implements ISingleArgumentFunction{
    double A, B;
    double start, end;

    public LinearFunction(double a, double b, double start, double end){
        A = a;
        B = b;
        this.start = start;
        this.end = end;
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
    public double getValue(double x) {
        if (x > end || x < start) throw new IllegalArgumentException();
        return A * x + B;
    }
}
