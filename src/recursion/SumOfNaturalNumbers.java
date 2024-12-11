package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int ans1 = sumOfNNaturalNumbers(N);
        int ans2 = sumOfNNaturalNumbersWithAlternateSigns(N);

        System.out.println("Sum of " + N + " Natural Numbers is " + ans1);
        System.out.println("Sum of " + N + " Natural Numbers is " + ans2);
    }

    public static int sumOfNNaturalNumbers(int N) {
        if (N == 0) return 0;
        return N + sumOfNNaturalNumbers(N - 1);
    }

    public static int sumOfNNaturalNumbersWithAlternateSigns(int N) {
        if (N == 0) return 0;
        if (N % 2 == 0) return sumOfNNaturalNumbersWithAlternateSigns(N - 1) - N;
        else return sumOfNNaturalNumbersWithAlternateSigns(N - 1) + N;
    }

}
