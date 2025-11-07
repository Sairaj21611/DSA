package com.demo.stackandqueue;

public class MyStackLinkedList {
	Node top;

	public class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public MyStackLinkedList() {
		top = null;
	}

	private boolean isEmpty() {
		return top == null;
	}

	public void push(int num) {
		Node newNode = new Node(num);
		if (!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("pushed " + num);
	}
	public int pop() {
		if(!isEmpty()) {
			Node temp = top;
			top = top.next;
			temp.next = null;
			return temp.data;
		}
		System.out.println("Stack is empty ");
		return -1;
	}

}
