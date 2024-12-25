
import java.util.Scanner;

public class massive {

    public static void main(String[] args){

        int [] arr = inputMassive();

        readMassive(arr);

        System.out.println("Сумма всех элементов массива: " + sumElementMassive(arr));

        System.out.println("Количество чётных элементов: " + countEvenElement(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интервал");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Количество элементов в интервале:" + countInRange(a,b,arr));

        if(AllPositive(arr)){
            System.out.println("Все элементы массива положительные.");
        } else System.out.println("Есть отрицательные элементы.");

        readMassive(reverseMassive(arr));

    }

    public static int[] inputMassive(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Введите элементы массива:");
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void readMassive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int sumElementMassive(int[] arr){
        int sum = 0;
        for(int i = 0; i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int countEvenElement(int[] arr){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int countInRange(int a, int b, int[] arr){

        int count = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] >= a && arr[i] <= b){
                count++;
            }
        }
        return count;
    }

    public static boolean AllPositive(int[] arr){
        for (int element : arr) {
            if (element <= 0) {
                return false;
            }
        }
        return true;

    }

    public static int[] reverseMassive(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        return arr;
    }

}
