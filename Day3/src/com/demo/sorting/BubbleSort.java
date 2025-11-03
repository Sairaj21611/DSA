package com.demo.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		int temp;
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=1; j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
			System.out.println("Iteration : "+(i+1));
			System.out.println("Swaping count : " + count);
			System.out.println(Arrays.toString(arr));
			if(count == 0) {
				break;
			}
		}
		
	}

	public static void modifiedBubbleSort(int[] arr) {
		
		int temp;
		for(int i=0; i<arr.length; i++) {
			boolean flag = false;
			for(int j=1; j<arr.length; j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag)
				break;
		}
		
	}
}
