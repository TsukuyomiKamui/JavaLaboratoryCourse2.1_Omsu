import java.util.Scanner;

public class fifth {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Диапазон:");
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("Шаг:");
        double n = in.nextDouble();

        double sinus;

        for(double i = a; i<=b; i+=n){

            double rad = Math.toRadians(i);
            sinus = Math.sin(rad);
            System.out.println(sinus);
        }

    }
}
