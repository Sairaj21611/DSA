package com.demo.doublycircularlinkedlist;

public class DoublyCircularLinkedlist {
	Node head;
	public class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public DoublyCircularLinkedlist() {
		head = null;
	}
	
	public void addAtEnd(int val) {
		Node newNode = new Node(val);
		
		System.out.println("The code to be write");
		
	}
}
