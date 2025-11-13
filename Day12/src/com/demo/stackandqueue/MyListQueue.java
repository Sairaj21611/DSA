package com.demo.stackandqueue;

public class MyListQueue {
	Node front;
	Node rare;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public MyListQueue() {
		front = null;
		rare = null;
	}
	public boolean isEmpty() {
		return front == null && rare == null;
	}
	public void enQueue(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			front = newNode;
		}else {
			rare.next = 
		}
	}
}
