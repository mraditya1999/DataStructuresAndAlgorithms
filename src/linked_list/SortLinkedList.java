package linked_list;

import java.util.Scanner;

public class SortLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        int choice;
        do {
            System.out.println("1. Insert Element\n2. Sort List\n3. Display List\n4. Exit");
            System.out.print("Enter Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 2:
                    sortLinkedList(list.head);
                    System.out.println("List has been sorted.");
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

    public static void sortLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is Empty!!");
            return;
        }
        if (head.next == null) return;

        Node currNode;
        Node nextNode;
        boolean swapped;
        do {
            swapped = false;
            currNode = head;

            while (currNode.next != null) {
                nextNode = currNode.next;
                while (nextNode != null) {
                    if (currNode.value > nextNode.value) {
                        int temp = currNode.value;
                        currNode.value = nextNode.value;
                        nextNode.value = temp;
                        swapped = true;
                    }
                    nextNode = nextNode.next;
                }
                currNode = currNode.next;
            }
        } while (swapped);

    }
}
