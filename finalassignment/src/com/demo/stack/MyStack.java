package com.demo.stack;

public class MyStack {
	private int arr[];
	int top;
	
	public MyStack() {
		arr = new int[10];
		top = -1;
	}
	public MyStack(int size) {
		arr = new int[10];
		top = -1;
	}
	
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top] = num;
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
			return num;
		}else {
			System.out.println("The stack is empty");
		}
		return -1;
	}
	private boolean isEmpty() {
		return top == -1;
	}
	private boolean isFull() {
		return top == arr.length-1;
	}
	
	public void display() {
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i]+"---->");
		}
		System.out.println();
	}
}
