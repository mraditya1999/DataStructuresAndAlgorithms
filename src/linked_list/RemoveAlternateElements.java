package linked_list;

import java.util.Scanner;

public class RemoveAlternateElements {

    public static void removeAlternateElements(SinglyLinkedList list) {
        Node temp = list.head;
        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        int choice;
        do {
            System.out.println("1. Insert Element\n2. Remove Alternate Elements\n3. Reverse List\n4. Display List\n5. Exit");
            System.out.print("Enter Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;

                case 2:
                    removeAlternateElements(list);
                    System.out.println("Alternate elements removed.");
                    break;

                case 3:
                    list.head = ReverseLinkedList.reverseLinkedList(list.head);
                    System.out.println("List has been reversed.");
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!!");
            }

        } while (choice != 5);

        sc.close();
    }
}
