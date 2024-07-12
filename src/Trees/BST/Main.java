package Trees.BST;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] a = {10, 20, 30, 40, 50, 25, 35, 9, 8, 7, 8, 5, 4, 3, 2, 1};
        Arrays.sort(a); // Sort the array to create a balanced BST
         insertSortedArray(a, 0, a.length - 1, tree);
        // tree.display();
        tree.inorder();
        tree.preorder();
        tree.postorder();
    }

    public static void insertSortedArray(int[] a, int start, int end, BinarySearchTree tree) {
        if (start > end) {
            return;
        }
        int mid = (start + end) / 2;
        tree.insert(a[mid]);
        insertSortedArray(a, start, mid - 1, tree);
        insertSortedArray(a, mid + 1, end, tree);
    }
}
