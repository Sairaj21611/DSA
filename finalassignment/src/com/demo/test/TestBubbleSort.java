package com.demo.test;
import com.demo.bubblesort.*;

public class TestBubbleSort {
	public static void main(String[] args) {
		BubbleSort bsort = new BubbleSort();
		int arr[] = {3,6,1,2,9,5,3,8,4};
		bsort.bubbleSort(arr); 
	}
}
