package com.demo.test;
import com.demo.binary.*;

public class MainBinaryTest {
	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		
		bst.insertNode(67);
		bst.insertNode(45);
		bst.insertNode(87);
		bst.insertNode(90);
		bst.insertNode(24);
		
		bst.inorderTraversal();
	}

}
