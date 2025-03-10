package linked_list.singly_linked_list;

public class SinglyLinkedList {
    Node head;
    Node current;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            current = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            current = newNode;
            return;
        }
        current.next = newNode;
        current = current.next;
    }

    public void insertBeforeElement(int element, int data) {
        Node newNode = new Node(data);
        Node currentTemp = head;
        Node prevTemp = null;

        if (head == null) {
            return;
        }

        if (head.data == element) {
            newNode.next = head;
            head = newNode;
            return;
        }

        while (currentTemp != null && currentTemp.data != element) {
            prevTemp = currentTemp;
            currentTemp = currentTemp.next;
        }

        if (currentTemp != null) {
            newNode.next = currentTemp;
            prevTemp.next = newNode;
        }
    }

    public void insertAfterElement(int element, int data) {
        Node newNode = new Node(data);
        Node currentTemp = head;

        while (currentTemp != null && currentTemp.data != element) {
            currentTemp = currentTemp.next;
        }
        if (currentTemp != null) {
            newNode.next = currentTemp.next;
            currentTemp.next = newNode;
        }
    }

    public void removeFromBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void removeFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node currentTemp = head;
        Node prevTemp = head;

        while (currentTemp.next != null) {
            prevTemp = currentTemp;
            currentTemp = currentTemp.next;
        }
        prevTemp.next = null;
    }

    public void removeBeforeElement(int element) {
        Node currentTemp = head;
        Node prevTemp = null;
        Node prevPrevTemp = null;

        if (head == null || head.next == null || head.data == element) {
            return;
        }

        while (currentTemp != null && currentTemp.data != element) {
            prevPrevTemp = prevTemp;
            prevTemp = currentTemp;
            currentTemp = currentTemp.next;
        }

        if (currentTemp != null && prevTemp != null && prevPrevTemp != null) {
            prevPrevTemp.next = currentTemp;
        } else if (currentTemp != null && prevTemp != null && prevTemp == head) {
            head = currentTemp;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertBeforeElement(15, 12);
        list.insertAfterElement(15, 17);
        list.display();
    }
}
