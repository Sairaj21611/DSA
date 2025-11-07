package com.demo.test;
import com.demo.stackandqueue.*;

public class TestMyQueueLinkedList {
	public static void main(String[] args) {
		MyQueueLinkedList qlist = new MyQueueLinkedList();
		
		qlist.enQueue(12);
		qlist.enQueue(24);
		qlist.enQueue(36);
		qlist.enQueue(48);
		qlist.enQueue(56);
		
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		
		
	}
}
