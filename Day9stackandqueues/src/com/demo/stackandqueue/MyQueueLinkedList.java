package com.demo.stackandqueue;

public class MyQueueLinkedList {
	Node front;
	Node rare;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public MyQueueLinkedList() {
		this.front = null;
		this.rare = null;
	}

	public boolean isEmpty() {
		return front == null && rare == null;
	}

	public void enQueue(int num) {

		Node newNode = new Node(num);
		if (isEmpty()) {
			front = newNode;
		} else {
			rare.next = newNode;
		}
		rare = newNode;
		System.out.println("Enqueued " + num);
	}

	public int deQueue() {
		if (!isEmpty()) {
			Node temp = front;

			front = front.next;
			if (front == null) {
				rare = null;
			}
			temp.next = null;
			return temp.data;
		}
		System.out.println("Queue is empty");
		return -1;

	}

}
