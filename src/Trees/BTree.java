package Trees;

import java.util.Scanner;


public class BTree {
    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    // public BTree() {
    // }

    public void populate(Scanner in) {
        System.out.println("Enter the root node:");
        int data = in.nextInt();
        root = new Node(data);
        populate(in, root);
    }

    private void populate(Scanner in, Node node) {
        System.out.println("Enter the left node of " + node.data + ":");
        boolean left = in.nextBoolean();
        if (left) {
            System.out.println("Enter the data:");
            int data = in.nextInt();
            node.left = new Node(data);
            populate(in, node.left);
        }
        System.out.println("Enter the right node of " + node.data + ":");
        boolean right = in.nextBoolean();
        if (right) {
            System.out.println("Enter the data:");
            int data = in.nextInt();
            node.right = new Node(data);
            populate(in, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BTree bt = new BTree();
        bt.populate(in);
        bt.display();
        in.close();
    }
}

