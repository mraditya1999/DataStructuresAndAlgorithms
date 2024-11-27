package linked_list;

public class PolynomialNode {
    int number;
    int coefficient;
    PolynomialNode next;

    PolynomialNode(int number, int coefficient) {
        this.number = number;
        this.coefficient = coefficient;
        this.next = null;
    }
}