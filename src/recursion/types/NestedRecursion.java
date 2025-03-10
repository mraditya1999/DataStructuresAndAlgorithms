package recursion.types;

    // In nested recursion, a function calls itself as a parameter to another invocation of itself.
public class NestedRecursion {
    public static void main(String[] args) {
        int result = nestedRecursion(95);
        System.out.println("Result: " + result);
    }

    static int nestedRecursion(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return nestedRecursion(nestedRecursion(n + 11));
        }
    }
}

