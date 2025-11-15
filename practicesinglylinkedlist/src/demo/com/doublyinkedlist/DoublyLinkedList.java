package demo.com.doublyinkedlist;

public class DoublyLinkedList {
	Node head;
	public class Node{
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
	
	public void addByVal(int val, int num) {
		Node newNode = new Node(num);
		
		if(head == null) {
			
		}
	}
	
	
	
}
