package recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms in the Fibonacci series: ");
        int terms = sc.nextInt();
        int a = 0;
        int b = 1;
        if(terms == 1){
            System.out.print(a + " ");
            return;
        }else{
            System.out.print(a + " " + b + " ");
        }
        fibonacci(a, b,terms - 2);
    }

    static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b , c , n-1 );
    }
}
