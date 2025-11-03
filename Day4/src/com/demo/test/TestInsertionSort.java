package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.InsertionSort;

public class TestInsertionSort {
	public static void main(String[] args) {
		int arr[] = {21,45,23,87,40,12,9,1,78};
		
		InsertionSort.insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
