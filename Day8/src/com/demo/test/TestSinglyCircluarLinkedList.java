package com.demo.test;

import com.demo.singlycircularLinkedList.*;

public class TestSinglyCircluarLinkedList {
	public static void main(String[] args) {
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();

		list.addValue(20);
		list.addValue(34);
		list.addValue(88);

//		list.addByPos(1, 55);
//		list.addByPos(2, 45);
//		list.addByPos(3, 67);

		list.addByValue(34, 67);

		list.display();
	}
}
