package com.demo.test;
import java.util.Arrays;

import com.demo.sorting.*;
public class TestQuickSort {
	public static void main(String[] args) {
		int arr[] = {10,4,7,5,4,9,2,7};
		
		QuickSort.quickSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
