package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = sc.nextInt();

        char source = 'A';
        char helper = 'B';
        char destination = 'C';


        towerOfHanoi(n,source,helper,destination);
    }

    static void towerOfHanoi(int n,char source,char helper, char destination){
        if(n > 0){
        towerOfHanoi(n - 1,source,destination,helper);
            System.out.println("Move from " + source + " to " + destination);
        towerOfHanoi(n - 1,helper,source,destination);
        }
    }
}
