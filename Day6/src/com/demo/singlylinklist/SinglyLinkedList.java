package com.demo.singlylinklist;

public class SinglyLinkedList {
	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;
	

		public void addByNum(int value,int num) {
			Node newNode=new Node(value);
			Node temp=head;
			while(temp!=null && temp.data!=num) {
				temp=temp.next;
			}
			
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
				
			}else {
				System.out.println(num+"Not Found");
			}
			
		}

	public void addByPosition(int pos, int value) {
		Node newNode = new Node(value);

		if (pos == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp= head;
			for(int i=1; temp != null && i<=pos-2; i++) {
				temp = temp.next;
			}
			if(temp!=null) {
				newNode.next = temp.next;
				temp.next = newNode;
			}else {
				System.out.println("The given position is not valid");
			}
		}
	}

	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("The list is empty");
		} else {
			for (Node temp = head; temp != null; temp = temp.next) {
				System.out.println(temp.data + "-------->");
			}
		}
	}
}
