package com.demo.singlycircularLinkedList;

public class SinglyCircularLinkedList {
	Node head;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public SinglyCircularLinkedList() {
		head = null;
	}

	public void addValue(int val) {

		Node newNode = new Node(val);

		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node temp = head;

			while (temp.next != head) {
				temp = temp.next;
			}
			newNode.next = head;
			temp.next = newNode;
		}
	}

	public void addByPos(int pos, int value) {

		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			if (pos == 1) {
				while (temp.next != head) {
					temp = temp.next;
				}
				newNode.next = head;
				head = newNode;
				temp.next = head;
			} else {
				int i = 1;
				for (; temp.next != head && i <= 2; i++) {
					temp = temp.next;
				}
				if (i >= pos) {
					newNode.next = temp.next;
					temp.next = newNode;
				} else {
					System.out.println(pos + " is invalid");
				}
			}
		}
	}

	public void addByValue(int num, int value) {
		Node newNode = new Node(value);
		if (head == null) {
			System.out.println("String is empty");
		} else {
			if (head.data == num) {
				newNode.next = head.next;
				head.next = newNode;
			} else {
				Node temp = head;
				do {
					temp = temp.next;
				} while (temp != head && temp.data == num);

				if (temp != head) {
					newNode.next = temp.next;
					temp.next = newNode;
				} else {
					System.out.println(num + " Not Found");
				}
			}

		}
	}

	public void display() {
		if (head == null) {
			System.out.println("String is empty");
		} else {
			Node temp = head;
			do {
				System.out.println(temp.data + "---------->");
				temp = temp.next;
			} while (temp != head);
		}
	}
}
