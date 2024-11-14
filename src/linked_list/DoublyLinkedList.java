package linked_list;


public class DoublyLinkedList {
    private Node head;

    public void insertFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        curr = curr.next;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;

    }

    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        Node prev = head;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(4);
        list.display();

        list.removeFirst();
        list.display();

        list.removeLast();
        list.display();
    }
}