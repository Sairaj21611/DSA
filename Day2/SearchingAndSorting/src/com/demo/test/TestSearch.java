package com.demo.test;

import com.demo.search.*;

public class TestSearch {
	public static void main(String[] args) {
		int[] arr = { 31, 1, 18, 6, 14, 5, 3, 16, 7 };

		int pos = SearchingService.sequentialSearch(arr, 5);
		if (pos != -1) {
			System.out.println("The Position is : " + pos);
		} else {
			System.out.println("Position not found");
		}

		int arr1[] = { 1, 4, 6, 9, 11, 34, 45, 67, 81 };
		pos = SearchingService.binarySearch(arr1, 11);
		if (pos != -1) {
			System.out.println("The position of an element is : " + pos);
		} else {
			System.out.print("The Position is not found");
		}
		pos = SearchingService.binaryRecursiveSearch( arr1,67,0,8);
		if(pos!=-1) {
			System.out.println("The position is "+pos);
		}else {
			System.out.println("The not found");
		}
		
		
	}
}
