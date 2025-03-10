package recursion.types;

//  In head recursion, the recursive call is made before any other processing in the function(at the time of calling).
public class HeadRecursion {
    public static void main(String[] args) {
        headRecursion(5);
    }

    static void headRecursion(int n) {
        if (n > 0) {
            headRecursion(n - 1);
            System.out.print(n + " ");
        }
    }
}
