package basics;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter low and high value: ");
        int low = sc.nextInt();
        int high = sc.nextInt();

        printAllPrimeNumbersInRange(low,high);
    }

    static void printAllPrimeNumbersInRange(int low, int high){
        for (int i = low; i <= high;i++){
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i + " ");
        }
    }
}
