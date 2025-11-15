package demo.com.singlylinkedlist;

public class SinglyLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public SinglyLinkedList() {
		head = null;
	}

	public void addAtEnd(int val) {
		Node newNode = new Node(val);
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

	public void addByPos(int pos, int val) {
		Node newNode = new Node(val);
		if (head == null) {
			System.out.println("The list is null");
		} else {
			Node temp = head;
			if (pos == 1) {
				newNode.next = head;
				head = newNode;
			} else {
				for(int i=0; temp!=null && i<pos-2; i++) {
					temp = temp.next;
				}
				if(temp != null) {
					newNode.next = temp.next;
					temp.next  = newNode;
				}
				
			}
		}
	}
	public void addByVal(int val, int num) {
		Node newNode = new Node(num);
		
		if(head == null) {
			System.out.println("The list is null");
		}else {
			if(head.data == val) {
				newNode.next = head.next;
				head.next=newNode;
			}else {
				Node temp = head;
				while(temp.next != null && temp.data != val) {
					temp = temp.next;
				}
				if(temp.next != null) {
					newNode.next = temp.next;
				}
				temp.next = newNode;
			}
		}
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("list is empty");
		} else {
			while (temp != null) {
				System.out.print(temp.data + "\t");
				temp = temp.next;
			}
		}
	}
}
