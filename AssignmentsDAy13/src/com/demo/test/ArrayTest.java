package com.demo.test;

import com.demo.array.*;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = { 7, 13, 2, 9, 3, 5 };

		Array ar = new Array();

		ar.addDigit(arr);
		ar.findFactOfPrimes(arr);
		int ans = ar.findMaxPrime(arr);
		System.out.println("Smallest Prime Number = " + ans);

		ar.copyArray(arr);
		ar.getArray();
	}
}
