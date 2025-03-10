package recursion;

import java.util.Scanner;

public class FindExponents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

//        int ans = findExponentMethod1(base, power);
        int ans = findExponentMethod2(base, power);
        System.out.println("Exponents of base " + base + " and power " + power + " is " + ans);
    }
    static int findExponentMethod1(int base, int power){ // 2 4
        if(power == 0) return 1;
        return base * findExponentMethod1(base, power-1);
    }

    static int findExponentMethod2(int base, int power){ // 2 4
        if(power == 0) return 1;
        if(base  == 0) return 0;

        if(power % 2 == 0)
            return  findExponentMethod2(base, power/2) * findExponentMethod2(base, power/2); // power is even
        return  findExponentMethod2(base, power/ 2) * findExponentMethod2(base, power/2) * base; // power is odd
    }
}
