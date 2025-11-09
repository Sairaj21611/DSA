package com.demo.binary;

public class BinaryTree {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public BinaryTree() {
        root = null;
    }

    public void insertNode(int key) {
        root = insertData(root, key);
    }
    private Node insertData(Node root, int key) {
        if (root == null) {
            return new Node(key); 
        }
        if (key < root.data) {
            root.left = insertData(root.left, key);
        } else {
            root.right = insertData(root.right, key);
        }
        return root;
    }
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + "; ");
            inorderTraversal(root.right);
        }
    }
}
