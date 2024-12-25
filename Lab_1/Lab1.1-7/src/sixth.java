import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Коэффициенты:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        double x, y;

        double det = a * e - b * d;
        double det_x = c * e - f * b;
        double det_y = a * f - d * c;

        if (det != 0) {
            x = det_x / det;
            y = det_y / det;
            System.out.println("Имеет один корень:" + x + "," + y);
        } else if (det_x == 0 && det_y == 0) {
            System.out.println("Не имеет решений.");
        } else {
            System.out.println("Бесконечное количество решений.");
        }
    }
}
