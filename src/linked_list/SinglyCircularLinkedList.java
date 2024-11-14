package linked_list;

public class SinglyCircularLinkedList {
    Node head;

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
    }

    public void removeFirst() {
        if (head == null) return;

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) return;

        Node curr = head;
        Node prev = head;
        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = head;
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

        SinglyCircularLinkedList list = new SinglyCircularLinkedList();

        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();

        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);

        list.display();

        list.removeFirst();
        list.removeFirst();

        list.display();

        list.removeLast();
        list.removeLast();

        list.display();
    }
}
