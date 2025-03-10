package recursion.types;

// In tail recursion, the recursive call is the last operation executed within the function(at the time of returning).
// In case of tail recursion loop is efficient.
public class TailRecursion {
    public static void main(String[] args) {
        tailRecursion(5);
    }

    static void tailRecursion(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            tailRecursion(n - 1);
        }
    }
}
