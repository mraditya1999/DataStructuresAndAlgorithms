package basics;
import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to inverse: ");
        int N = sc.nextInt();

        int inverseNumber = 0;
        int original_position = 1;
        //  1 2 3 4 5    - digit
        // (5 4 3 2 1 )  - position
        // 1 2 3 4 5     - inverse
        while(N != 0){
            int remainder = N % 10;
            int inverted_digit = original_position;
            inverseNumber += inverted_digit * (int)Math.pow(10, remainder - 1);
            N = N / 10;
            original_position++;
        }
        System.out.println("Inverse of a number: " + inverseNumber);
    }
}
