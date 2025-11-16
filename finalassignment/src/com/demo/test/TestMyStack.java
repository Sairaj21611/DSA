package com.demo.test;
import com.demo.stack.*;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack stk = new MyStack(2);
		
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		System.out.println();
		stk.display();
		
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
		
	}
	
}
