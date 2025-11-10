package com.demo.hashtable;

public class MyHashTable {
	Node[] head;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public MyHashTable() {
		head = new Node[10];
		for (int i = 0; i < head.length; i++) {
			head[i] = null;
		}
	}

	public MyHashTable(int size) {
		head = new Node[size];
		for (int i = 0; i < head.length; i++) {
			head[i] = null;
		}
	}

	public void insertData(int val) {
		Node newNode = new Node(val);

		int pos = val % head.length;

		if (head != null) {
			newNode.next = head[pos];
		}
		head[pos] = newNode;
	}

	public void displayData() {
		for (int i = 0; i < head.length; i++) {
			Node temp = head[i];
			System.out.println(i + "--------->");
			while (temp != null) {
				System.out.print(temp.data + "--------->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}

	public boolean searchData(int num) {
		int pos = num % head.length;
		Node temp = head[pos];

		while (temp != null) {
			if (temp.data == num) {
				System.out.println(num + " found in buket " + pos);
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

}
