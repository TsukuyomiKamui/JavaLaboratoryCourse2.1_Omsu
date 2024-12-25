import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты уравнения.");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double D = b*b-4*a*c;

        if(D>0){
            double x1 = ((Math.pow(D, 2)) - b)/(2*a);
            double x2 = (- (Math.pow(D, 2)) - b)/(2*a);
            System.out.println("Уравнение имеет 2 корня: " + x1 + x2);

        } else if(D==0){
            double x = -b/(2*a);
            System.out.println("Уравнение имет 1 корень: " + x);

        } else System.out.println("Уравнение не имеет корней.");
    }
}
