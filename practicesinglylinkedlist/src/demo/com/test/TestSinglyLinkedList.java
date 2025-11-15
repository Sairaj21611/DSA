package demo.com.test;

import demo.com.singlylinkedlist.*;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList slist = new SinglyLinkedList();

		slist.addAtEnd(12);
		slist.addAtEnd(52);
		slist.addAtEnd(18);
		slist.addAtEnd(23);
		
	//	slist.addByVal(23, 22);
		
		slist.addByPos(10, 10);
		slist.display();
	}
}
