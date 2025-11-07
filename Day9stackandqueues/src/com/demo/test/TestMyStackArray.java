package com.demo.test;

import com.demo.stackandqueue.*;

public class TestMyStackArray {
	public static void main(String[] args) {
		MyStackArray ob = new MyStackArray();

		ob.push(10);
		ob.push(40);
		ob.push(78);
		ob.push(56);

		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		
		
	}
}
