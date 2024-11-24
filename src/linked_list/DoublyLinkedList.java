package linked_list;


import java.util.Scanner;

public class DoublyLinkedList {
    private Node head;

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value) {
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

    public void insertBeforeElement(int value, int key) {
        Node newNode = new Node(value);
        if (head == null) return;

        Node curr = head;
        Node prev = head;
        while (curr != null && curr.value != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) return;

        newNode.prev = prev;
        prev.next = newNode;
        newNode.next = curr;
        curr.prev = newNode;
    }

    public void insertAfterElement(int value, int key) {
        Node newNode = new Node(value);
        if (head == null) return;

        Node curr = head;
        while (curr != null && curr.value != key) {
            curr = curr.next;
        }

        if (curr == null) return;

        newNode.next = curr.next;
        if (curr.next != null) curr.next.prev = newNode;
        curr.next = newNode;
        newNode.prev = curr;
    }

    public void removeFromBeginning() {
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

    public void removeFromEnd() {
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

    public void removeBeforeElement(int key) {
        if (head == null || head.next == null || head.value == key) return;

        Node curr = head;
        while (curr != null && curr.value != key) {
            curr = curr.next;
        }

        if (curr == null || curr.prev == null || curr.prev.prev == null) return;

        // Remove the node before curr
        Node nodeToRemove = curr.prev;
        Node prevOfNodeToRemove = nodeToRemove.prev;
        prevOfNodeToRemove.next = curr;
        curr.prev = prevOfNodeToRemove;
    }

    public void removeAfterElement(int key) {
        if (head == null || head.next == null) return;

        Node curr = head;
        while (curr != null && curr.value != key) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null) return;

        curr.next = curr.next.next;
        if (curr.next != null) curr.next.prev = curr;
    }

    public void removeByValue(int key) {
        if (head == null) return;

        if (head.value == key) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        Node curr = head;
        Node prev = head;
        while (curr != null && curr.value != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) return;

        prev.next = curr.next;
        curr.next.prev = prev;
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
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int choice;

        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Insert At Beginning\n2. Insert At End\n3. Insert Before Element\n4. Insert After Element\n5. Remove From Beginning\n6. Remove From End\n7. Remove Before Element\n8. Remove After Element\n9. Remove Element\n10. Display list\n11. Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Insert value at beginning: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Insert value at end: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Insert value and key to insert before element: ");
                    list.insertBeforeElement(sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    System.out.print("Insert value and key to insert after element: ");
                    list.insertAfterElement(sc.nextInt(), sc.nextInt());
                    break;

                case 5:
                    list.removeFromBeginning();
                    break;

                case 6:
                    list.removeFromEnd();
                    break;

                case 7:
                    System.out.print("Insert key to remove before element: ");
                    list.removeBeforeElement(sc.nextInt());
                    break;

                case 8:
                    System.out.print("Insert key to remove after element: ");
                    list.removeAfterElement(sc.nextInt());
                    break;

                case 9:
                    System.out.print("Insert value to remove: ");
                    list.removeByValue(sc.nextInt());
                    break;

                case 10:
                    list.display();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 11);
    }
}
