package Trees;

import java.util.Arrays;

public class BinarySearchTree {
    public class Node {
        private int data;
        private Node left;
        private Node right;
        private int height;

        public Node(int data) {
            this.data = data;
            this.height = 0; // Initialize height to 0
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.getData()) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void display() {
        display(root, "");
    }

    // Pretty printing of a binary tree on the console.
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        // Display in a nice manner like a tree
        System.out.println(indent + node.getData());
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        int balance = height(node.left) - height(node.right);
        if (balance > 1 || balance < -1) {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] a = {10, 20, 30, 40, 50, 25, 35, 9, 8, 7, 8, 5, 4, 3, 2, 1};
        Arrays.sort(a);
        // for (int i : a) {
        //     tree.insert(i);
        // }
          forsrotedarray(a, 0, a.length - 1, tree);
        tree.display();
    }
    public static void forsrotedarray(int[] a, int start, int end, BinarySearchTree tree) {
        if (start > end) {
            return;
        }
        int mid = (start + end) / 2;
        tree.insert(a[mid]);
        forsrotedarray(a, start, mid - 1, tree);
        forsrotedarray(a, mid + 1, end, tree);
    }
}
