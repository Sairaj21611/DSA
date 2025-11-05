package com.demo.test;
import com.demo.doublylinklist.*;

public class TestDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
	
		list.addElement(5);
		list.addElement(34);
		list.addElement(56);
		list.addElement(14);
		
		list.addByPos(2, 13);
		list.addByPos(4, 1);
		
		list.addByValue(2,34);
		list.addByValue(6, 14);
		
		list.deleteByValue(2);
		list.deleteByValue(5);
		
		list.display();
	}
}
