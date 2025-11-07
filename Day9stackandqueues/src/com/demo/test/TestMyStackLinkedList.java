package com.demo.test;
import com.demo.stackandqueue.*;

public class TestMyStackLinkedList {
	public static void main(String[] args) {
		MyStackLinkedList list = new MyStackLinkedList();
		
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		
	}
}
