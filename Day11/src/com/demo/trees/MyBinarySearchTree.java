package com.demo.trees;

public class MyBinarySearchTree {
	Node root;

	public class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public MyBinarySearchTree() {
		root = null;
	}

	public void insertNode(int key) {
		root = insertData(root, key);
	}

	private Node insertData(Node root, int key) {
		
		if (root == null) {
			Node newNode = new Node(key);
			root = newNode;
		} else {
			if (key < root.data) {
				root.left = insertData(root.left, key);
			} else {
				root.right = insertData(root.right, key);
			}
		}
		return root;
	}
}
