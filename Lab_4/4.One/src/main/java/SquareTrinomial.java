public class SquareTrinomial {

    private double a;
    private double b;
    private double c;

    public SquareTrinomial(double a, double b, double c){
        double epsilon = 10e-8;
        if(Math.abs(a) < epsilon){
            throw new IllegalArgumentException("A равно 0, это не квадратный трехчлен");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double[] getRoots() throws IllegalArgumentException{

        double discriminant = (b*b)-(4*a*c);

        if(discriminant < 0){
            throw new IllegalArgumentException("Дискриминант меньше нуля");
        }
        else if(discriminant == 0){
            return new double[]{-b / 2 * a, -b / 2 * a};
        }
        return new double[]{(-b + Math.sqrt(discriminant))/(2*a), (-b - discriminant)/(2*a) };

    }
}

