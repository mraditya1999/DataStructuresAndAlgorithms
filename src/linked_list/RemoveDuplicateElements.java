package linked_list;

import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        int choice;
        do {
            System.out.println("1. Insert Element\n2. Remove Duplicate Elements List\n3. Display List\n4. Exit");
            System.out.print("Enter Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 2:
                    removeDuplicateElements(list.head);
                    System.out.println("Duplicate elements removed.");
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

    public static void removeDuplicateElements(Node head) {
        if (head == null || head.next == null) return;

        // Step 1: Sort the list
        SortLinkedList.sortLinkedList(head);

        // Step 2: Remove duplicates
        Node currNode = head;
        while (currNode.next != null) {
            if (currNode.value == currNode.next.value) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
    }
}
