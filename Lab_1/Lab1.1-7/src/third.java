import java.util.Scanner;
import java.lang.Math;
public class third {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int p = a*b*c;
        System.out.println(p);

        double average =  (a + b + c) /3.0;
        System.out.println(average);

        if (a < b) {
            if (b < c) System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        } else if (b < c) {
            if (c < a) System.out.println(b + " " + c + " " + a);
            else System.out.println(b + " " + a + " " + c);
        } else if (c < a) {
            if (a < b) System.out.println(c + " " + a + " " + b);
            else System.out.println(c + " " + b + " " + a);
        }


    }
}
