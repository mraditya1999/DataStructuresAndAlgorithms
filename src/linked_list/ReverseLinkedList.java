package linked_list;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        int choice;
        do {
            System.out.println("1. Insert Element\n2. Reverse List\n3. Display List\n4. Exit");
            System.out.print("Enter Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 2:
                    list.head = reverseLinkedList(list.head);
                    System.out.println("List has been reversed.");
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }

        } while (choice != 4);

        sc.close();
    }

    public static Node reverseLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is Empty!!");
            return null;
        }

        Node curr = head;
        Node prev = null;
        Node temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
