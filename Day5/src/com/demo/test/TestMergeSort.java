package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.MergeSort;

public class TestMergeSort {
	public static void main(String[] args) {
		int arr[] = {22,34,81,29,12,9,3,1,8,54,45};
		
		MergeSort.mergeSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
}
