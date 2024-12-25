//f(x) = (Ax + B) / (Cx + D)
public class RationalFunction implements ISingleArgumentFunction{
    private double A, B, C, D;
    private double start, end;

    public RationalFunction(double a, double b, double c, double d,double start, double end){
        this.start = start;
        this.end = end;
        A = a;
        B = b;
        C = c;
        D = d;
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
    public double getValue(double x) throws IllegalArgumentException{
        if (x > end || x < start) throw new IllegalArgumentException();
        if((C*x+D)==0) throw new IllegalArgumentException("Знаменатель равен нулю");
        return (A * x + B) / (C * x + D);

    }
}
