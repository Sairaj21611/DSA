package com.demo.test;
import com.demo.insertionsort.*;

public class TestInsertionSort {
	public static void main(String[] args) {
		InsertionSort isort = new InsertionSort();
		
		int arr[] = {3,6,1,2,9,5,3,8,4};
		
		isort.insertionSort(arr);
	}
}
