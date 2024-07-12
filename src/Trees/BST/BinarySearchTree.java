package Trees.BST;

public class BinarySearchTree {
    public class Node {
        private int data;
        private Node left;
        private Node right;
        private int height;

        public Node(int data) {
            this.data = data;
            this.height = 0; 
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

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
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
}
