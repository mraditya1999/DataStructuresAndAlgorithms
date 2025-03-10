package recursion.types;

// In indirect recursion, two or more functions call each other in a cycle, creating a chain of function calls, which can be visualized as a tree-like structure.
public class IndirectRecursion {
    public static void main(String[] args) {
        indirectRecursion1(20);
    }

    static void indirectRecursion1(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            indirectRecursion2(n - 1);
        }
    }

    static void indirectRecursion2(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            indirectRecursion1(n / 2);
        }
    }
}
