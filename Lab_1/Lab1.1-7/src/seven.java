import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите точность: ");
        double epsilon = scanner.nextDouble();

        double result = CalExp(x, epsilon);
        System.out.println("exp(" + x + ") =" + result);
        System.out.printf("exp(" + x + ") =" + Math.E);
    }

    public static double CalExp(double x, double epsilon) {
        double term = 1.0;
        double sum = term;
        int n = 1;

        while (Math.abs(term) > epsilon) {
            term *= x / n;
            sum += term;
            n++;
        }

        return sum;
    }
}
