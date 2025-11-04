package com.demo.sorting;

public class MergeSort {

	public static void mergeSort(int[] arr, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			
			merge(arr,start,mid,end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		int leftarray[] = new int[n1];
		int rightarray[] = new int [n2];
		
		for(int i=0; i<n1; i++) {
			leftarray[i] = arr[start+i];
		}
		for(int i=0; i<n2; i++) {
			rightarray[i] = arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1 && j<n2) {
			if(leftarray[i]<rightarray[j]) {
				arr[start+k] = leftarray[i];
				i++;
				k++;
			}else {
				arr[start+k] = rightarray[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[start+k] = leftarray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[start+k] = rightarray[j];
			j++;
			k++;
		}
		
	}


}
