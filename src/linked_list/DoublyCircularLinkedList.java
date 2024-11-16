package linked_list;

import java.util.Scanner;

public class DoublyCircularLinkedList {
    Node head;

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            newNode.prev = head;
            newNode.next = head;
            return;
        }

        Node curr = head.prev;
        newNode.next = head;
        head = newNode;
        head.prev = curr;
        curr.next = head;
    }

    public void insertBeforeElement(int data, int key) {
        Node newNode = new Node(data);
        if (head == null) return;

        if (head.value == key) {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            newNode.next = head;
            newNode.prev = curr;
            head.prev = newNode;
            curr.next = newNode;
            head = newNode;
            return;
        }

        Node curr = head;
        Node prev = head;
        while (curr.next != head && curr.value != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.value == key) {
            newNode.next = curr;
            curr.prev = newNode;
            prev.next = newNode;
            newNode.prev = prev;
        }
    }

    public void insertAfterElement(int data, int key) {
        Node newNode = new Node(data);
        if (head == null) return;

        if (head.value == key) {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
            newNode.next = head;
            head.prev = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != head && curr.value != key) {
            curr = curr.next;
        }

        if (curr.value == key && curr.next == head) {
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next = newNode;
            head.prev = newNode;
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next.prev = newNode;


    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            newNode.prev = head;
            newNode.next = head;
            return;
        }

        Node curr = head.prev;
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = head;
        head.prev = newNode;
    }

    public void removeFromBeginning() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node last = head.prev;
        head = head.next;
        last.next = head.next;
        head.prev = last;
    }

    public void removeBeforeElement(int key) {
        if (head == null || head.next == head || head.value == key) return;

        Node curr = head;
        Node prev = null;
        Node prevPrev = null;

        while (curr.next != head && curr.value != key) {
            prevPrev = prev;
            prev = curr;
            curr = curr.next;
        }

        if (curr == head || prev == head || prevPrev == head) return;

        if (curr.value == key) {
            prevPrev.next = curr;
            curr.prev = prevPrev;
        }
    }

    public void removeAfterElement(int key) {
        if (head == null || head.next == head) return;

        Node curr = head;
        while (true) {
            if (curr.value == key) {
                if (curr.next == head) {
                    head = head.next;
                }
                Node nodeToRemove = curr.next;
                curr.next = nodeToRemove.next;
                nodeToRemove.next.prev = curr;

                nodeToRemove.next = null;
                nodeToRemove.prev = null;
                return;
            }
            curr = curr.next;
            if (curr == head) break;
        }
    }

    public void removeByValue(int key) {
        if (head == null) return;

        if (head.value == key && head.next == head) {
            head = null;
            return;
        }

        if (head.value == key) {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            head = head.next;
            head.prev = curr;
            curr.next = head;
            return;
        }

        Node curr = head.next;
        Node prev = head;
        while (curr != head && curr.value != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.value == key) {
            prev.next = curr.next;
            curr.next.prev = prev;
            curr.next = null;
            curr.prev = null;
        }
    }

    public void removeFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head.prev.prev;
        secondLast.next = head;
        head.prev = secondLast;
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
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        Scanner sc = new Scanner(System.in);
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
