package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public static Node insert(Node temp, int data) {
        Node newNode = new Node(data);
        if (temp == null) {
            temp = newNode;
            return temp;
        }

        if (data < temp.data) {
            if (temp.left == null) {
                temp.left = newNode;
            } else {
                insert(temp.left, data);
            }
        } else {
            if (temp.right == null) {
                temp.right = newNode;
            } else {
                insert(temp.right, data);
            }
        }
        return temp;
    }

    public static void inorder(Node temp) {
        if (temp == null) return;

        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }

    public static void preorder(Node temp) {
        if (temp == null) return;

        System.out.print(temp.data + " ");
        preorder(temp.left);
        preorder(temp.right);
    }

    public static void postorder(Node temp) {
        if (temp == null) return;

        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data + " ");
    }

    public static void levelOrder(Node temp) {
        if (temp == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currNode = queue.remove();

            if (currNode == null) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) queue.add(currNode.left);
                if (currNode.right != null) queue.add(currNode.right);
            }
        }
    }

//    public static Node remove(Node temp, int key) {
//        if (temp == null) return null;
//
//        if (key < temp.data) {
//            if (temp.left.data == key)
//                temp.left = null;
//            else remove(temp.left, key);
//        } else {
//            if (temp.right.data == key)
//                temp.right = null;
//            else remove(temp.right, key);
//        }
//        return temp;
//    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 4);
        root = insert(root, 5);
        root = insert(root, 2);
        root = insert(root, 8);
        root = insert(root, 1);
        root = insert(root, 6);

        System.out.print("Inorder: ");
        inorder(root);

        System.out.println();

        System.out.print("PreOrder: ");
        preorder(root);

        System.out.println();

        System.out.print("PostOrder: ");
        postorder(root);

        System.out.println();

        System.out.println("LevelOrder: ");
        levelOrder(root);

//        System.out.println("After remove: ");
//        root = remove(root, 8);
//        inorder(root);
    }
}
