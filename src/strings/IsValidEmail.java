package strings;
import java.util.Scanner;

public class IsValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.next();

        int atTheRate = 0, dot = 0,underscore = 0,space = 0,specialChar = 0;

        for (int i = 0; i < email.length(); i++)
        {
            if (email.charAt(i) == '@')
                atTheRate++;
            else if (email.charAt(i) == '.')
                dot++;
            else if (email.charAt(i) == '_')
                underscore++;
            else if (email.charAt(i) == ' ')
                space++;
            else if (email.charAt(i) >= 33 && email.charAt(i) <= 47 || email.charAt(i) >= 58 && email.charAt(i) <= 64 || email.charAt(i) >= 91 && email.charAt(i) <= 96 || email.charAt(i) >= 123 && email.charAt(i) <= 126)
                specialChar++;
        }

        if (atTheRate == 1 && dot >= 1 && underscore <= 1 && space == 0 && specialChar == 0)
            System.out.println(email + " is valid email.");
        else
            System.out.println(email + " is invalid email.");
    }
}
