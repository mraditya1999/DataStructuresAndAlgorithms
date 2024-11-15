package linked_list;

import java.util.Scanner;

public class SinglyCircularLinkedList {
    private static Node head;

    public static void insertAtBeginning(int value) {
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

    public static void insertAtEnd(int value) {
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

    public static void insertBeforeElement(int data, int key) {
        if (head == null) {
            return;
        }

        Node newNode = new Node(data);
        Node curr = head;
        Node prev = head;

        if (head.value == key) {
            newNode.next = head;

            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
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

    public static void insertAfterElement(int data, int key) {
        if (head == null) return;

        Node newNode = new Node(data);
        Node curr = head;

        while (curr.next != head && curr.value != key) {
            curr = curr.next;
        }

        if (curr.next != head) {
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public static void removeFromBeginning() {
        if (head == null) return;

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        head = head.next;
    }

    public static void removeFromEnd() {
        if (head == null) return;

        Node curr = head;
        Node prev = head;
        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = head;
    }

    public static void removeBeforeElement(int key) {
        if (head == null || head.next == head || head.value == key) return;

        Node prevPrev = null;
        Node prev = head;
        Node curr = head.next;

        do {
            if (curr.value == key) {
                if (prev == head) {
                    // If the node before the element is head, update tail's next pointer
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    temp.next = head.next;
                    head = head.next;
                } else {
                    prevPrev.next = curr;
                }
                return;
            }
            prevPrev = prev;
            prev = curr;
            curr = curr.next;
        } while (curr != head);

    }

    public static void removeAfterElement(int key) {
        if (head == null) return;

        Node curr = head;
        while (curr != null && curr.value != key) {
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    public static void removeByValue(int key) {
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

    public static void display() {
        Node curr = head;
        while (curr.next != head) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println(curr.value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Insert At Beginning\n2. Insert At End\n3. Insert Before Element\n4. Insert After Element\n5. Remove From Beginning\n6. Remove From End\n7. Remove Before Element\n8. Remove After Element\n9. Remove Element\n10. Display list\n11. Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Insert value at beginning: ");
                    insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Insert value at end: ");
                    insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Insert value and key to insert before element: ");
                    insertBeforeElement(sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    System.out.print("Insert value and key to insert after element: ");
                    insertAfterElement(sc.nextInt(), sc.nextInt());
                    break;

                case 5:
                    removeFromBeginning();
                    break;

                case 6:
                    removeFromEnd();
                    break;

                case 7:
                    System.out.print("Insert key to remove before element: ");
                    removeBeforeElement(sc.nextInt());
                    break;

                case 8:
                    System.out.print("Insert key to remove after element: ");
                    removeAfterElement(sc.nextInt());
                    break;

                case 9:
                    System.out.print("Insert value to remove: ");
                    removeByValue(sc.nextInt());
                    break;

                case 10:
                    display();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 11);
    }
}
