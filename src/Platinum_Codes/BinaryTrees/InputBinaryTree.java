package Platinum_Codes.BinaryTrees;

import java.util.Scanner;

public class InputBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node root = null; // initialize root

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = insert(root, x);
        }

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }

    // Insert into BST
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Print inorder traversal
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
