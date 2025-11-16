package com.demo.bubblesort;

import java.util.Arrays;

public class BubbleSort {
	public void bubbleSort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 1; j < arr.length - i; j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
