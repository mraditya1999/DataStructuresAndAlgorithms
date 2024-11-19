package tree;

public class BinarySearchTree {
    static Node root;
    Node temp = null;


    public void insertElement(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        if (temp == null) {
            insertRec(root, newNode);
        } else {
            insertRec(temp, newNode);
        }

//

//
//        if (temp.data < data && temp.right != null) {
//            temp = temp.right;
//            insertElement(data);
//        } else {
//            temp.right = newNode;
//        }
    }


    public void insertRec(Node curr, Node newNode) {
        if (curr.data > newNode.data) {
            if (curr.left == null) {
                curr.left = newNode;
            } else {
                insertRec(curr.left, newNode);
            }
        } else if (curr.data < newNode.data) {
            if (curr.right == null) {
                curr.right = newNode;
            } else {
                insertRec(curr.right, newNode);
            }
        }
    }

    //Inorder
    public void display(Node temp) {
        if (temp == null) {
            return;
        }

        display(temp.left);
        System.out.print(temp.data + " ");
        display(temp.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertElement(5);
        bst.insertElement(1);
        bst.insertElement(13);
        bst.insertElement(18);
        bst.insertElement(3);
        bst.insertElement(8);


        bst.display(root);
    }
}
