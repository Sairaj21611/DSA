package com.demo.array;

import java.util.*;

public class Array {

	private int addition(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

	public void addDigit(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int add = addition(arr[i]);
			System.out.print(add + " ");
		}
		System.out.println();
	}

	private boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private long factorial(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public void findFactOfPrimes(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				long fact = factorial(arr[i]);
				System.out.println("Factorial of " + arr[i] + "  is " + fact + "       ");
			}
		}
		System.out.println("");
	}

	public int findMaxPrime(int[] arr) {
		int max = -1;

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
		}
		return max;
	}

	public int reverseNum(int num) {
		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		return reverse;
	}

	public void copyArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i]) && arr[i] > 5) {
				int rdigit = reverseNum(arr[i]);
				System.out.print(rdigit + " ");
			} else
				System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	public void getArray() {
		String[] arr = new String[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		for (int i = 0; i < 20; i++) {
			arr[i] = sc.next();
			char spos = arr[i].charAt(1);
			if(arr[i].charAt(1) == arr[i+1].charAt(1)) {
				
			}
		}
	
		System.out.print("Array : [ ");
		for (int i = 0; i < 20; i++) {
			if (arr[i].length() > 1) {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println();
	}
}
