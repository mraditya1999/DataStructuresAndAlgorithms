package linked_list;

import java.util.Scanner;

public class SinglyLinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertBeforeElement(int data, int key) {
        if (head == null) {

            return;
        }

        Node newNode = new Node(data);
        Node curr = head;
        Node prev = null;

        if (head.value == key) {
            newNode.next = head;
            head = newNode;
            return;
        }

        while (curr != null && curr.value != key) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = newNode;
        newNode.next = curr;
    }

    public void insertAfterElement(int data, int key) {
        if (head == null) return;

        Node newNode = new Node(data);
        Node curr = head;

        while (curr != null && curr.value != key) {
            curr = curr.next;
        }

        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeFromBeginning() {
        if (head == null) return;
        head = head.next;
    }

    public void removeFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        Node prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public void removeBeforeElement(int key) {
        if (head == null || head.next == null || head.value == key) return;

        Node prevPrev = null;
        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.value != key) {
            prevPrev = prev;
            prev = curr;
            curr = curr.next;
        }

        if (curr != null && prevPrev != null) {
            prevPrev.next = curr;
        } else if (curr != null) {
            head = curr;
        }
    }

    public void removeAfterElement(int key) {
        if (head == null) return;

        Node curr = head;
        while (curr != null && curr.value != key) {
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    public void removeByValue(int key) {
        if (head == null) return;
        if (head.value == key) {
            head = head.next;
            return;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null && curr.value != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) return; // value not found
        prev.next = curr.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty!!");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
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
