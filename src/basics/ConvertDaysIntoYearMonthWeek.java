package basics;

import java.util.Scanner;

public class ConvertDaysIntoYearMonthWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days: ");
        int days = sc.nextInt();

        int year = days / 365;
        days = days % 365;

        int month = days / 30;
        days = days % 30;

        int week = days / 7;
        days = days % 7;

        System.out.println(year + " year, " + month + " month, " + week + " week, " + days + " days.");
        sc.close();
    }
}
