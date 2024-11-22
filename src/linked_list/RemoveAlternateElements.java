package linked_list;

import java.util.LinkedList;


public class RemoveAlternateElements {
    public static void removeAlternateElements() {
        SinglyLinkedList.display();
        Node temp = SinglyLinkedList.head;
        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }

    public static void reverseList() {
        Node prev = null;
        Node temp = null;
        Node curr = SinglyLinkedList.head;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        SinglyLinkedList.head = prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList.insertAtEnd(1);
        SinglyLinkedList.insertAtEnd(2);
        SinglyLinkedList.insertAtEnd(3);
        SinglyLinkedList.insertAtEnd(4);
        SinglyLinkedList.insertAtEnd(5);
        SinglyLinkedList.insertAtEnd(6);
        SinglyLinkedList.insertAtEnd(7);

        System.out.println("Before removing alternate elements: ");
        SinglyLinkedList.display();

        System.out.println();
        removeAlternateElements();
        System.out.println("After removing alternate elements: ");
        SinglyLinkedList.display();

        reverseList();

        System.out.println("After reversing: ");
        SinglyLinkedList.display();

    }
}
