package linked_list;

public class DoublyCircularLinkedList {
    Node head;

    public void insertFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            newNode.prev = head;
            newNode.next = head;
            return;
        }

        Node curr = head.prev;
        newNode.next = head;
        head = newNode;
        head.prev = curr;
        curr.next = head;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            newNode.prev = head;
            newNode.next = head;
            return;
        }

        Node curr = head.prev;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = head;
        head.prev = newNode;
    }

    public void removeFirst() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node last = head.prev;
        head = head.next;
        last.next = head.next;
        head.prev = last;
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head.prev.prev;
        secondLast.next = head;
        head.prev = secondLast;
    }

    public void display() {
        Node curr = head;
        while (curr.next != head) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println(curr.value);
    }


    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();

        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        list.display();

        list.removeFirst();
        list.removeLast();

        list.display();
    }
}
