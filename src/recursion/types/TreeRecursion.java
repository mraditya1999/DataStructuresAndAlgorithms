package recursion.types;

//  In tree recursion, a function calls itself multiple times, usually with different parameters. Each recursive call branches out into multiple sub-calls, creating a tree-like structure of function calls.
public class TreeRecursion {
    public static void main(String[] args) {
        treeRecursion(5);
    }

    static void treeRecursion(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            treeRecursion(n - 1);
            treeRecursion(n - 1);
        }
    }
}

