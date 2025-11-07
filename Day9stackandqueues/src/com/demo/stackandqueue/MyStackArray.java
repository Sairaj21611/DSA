package com.demo.stackandqueue;

public class MyStackArray {
	private int[] arr;
	int top;

	public MyStackArray() {
		arr = new int[10];
		top = -1;
	}

	public MyStackArray(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int num) {
		if (!isFull()) {
			top++;
			arr[top] = num;
			System.out.println("Pushed operation "+num);
		}else {
			System.out.println("The stack is full");
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
			return num;
		}else {
			System.out.println("Stack is empty");
		}
		return -1;
		
		
	}

	private boolean isEmpty() {
		return top==-1;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == arr.length-1;
	}
}
