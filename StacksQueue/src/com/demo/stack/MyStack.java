package com.demo.stack;

public class MyStack {
	private int[] arr;
	
	private int top;
	public MyStack() {
		arr=new int[10];
		top=-1;
	}
	public MyStack(int size) {
		arr=new int[size];
		top=-1;
	}
	
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top]=num;
			System.out.println("pushed "+num);
		}else {
			System.out.println("stack is full");
		}
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == arr.length;
	}
	private boolean isEmpty() {
		return top == -1;
	}
	

}
