package basics;
import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year to check Leap year: ");
        int year = sc.nextInt();

        boolean isLeapYear = isLeapYear(year);
        System.out.println("Is " + year + " Leap year: " + isLeapYear);
    }

    static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0;
    }
}
