package com.demo.doublylinklist;

public class DoublyLinkedList {
	Node head;

	public class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

	public DoublyLinkedList() {
		head = null;
	}

	public void addElement(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}
	}

	public void addByPos(int pos, int value) {
		Node newNode = new Node(value);

		if (pos == 1) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		} else {
			Node temp = head;
			for (int i = 1; temp != null && i <= pos - 2; i++) {
				temp = temp.next;
			}
			if (temp != null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				if (newNode.next != null)
					newNode.next.prev = newNode;
			}
		}
	}

	public void addByValue(int num, int value) {
		Node newNode = new Node(num);

		Node temp = head;
		while (temp != null && temp.data != value) {
			temp = temp.next;
		}
		if (temp != null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			if (newNode.next != null)
				newNode.next.prev = newNode;

		}
	}

	public void deleteByValue(int value) {
		Node temp = head;
		if (head.data == value) {
			head.next.prev = null;
			head = head.next;
			temp.next = null;
		} else {
			while (temp != null && temp.data != value) {
				temp = temp.next;
			}
			if (temp != null) {
				temp.prev.next = temp.next;
				if (temp.next != null) {
					temp.next.prev = temp.prev;
					temp.next = null;
				}
				temp.prev = null;

			}else {
				System.out.println(value+" not found");
			}
		}

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "------------>");
			temp = temp.next;
		}
	}
}
