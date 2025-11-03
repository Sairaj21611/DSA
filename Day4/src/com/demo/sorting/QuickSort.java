package com.demo.sorting;

public class QuickSort {

	private static int partion(int[] arr, int start, int end) {

		int i = start;
		int pivot = start;
		int j = end;

		if (i < j) {
			while (i < end && arr[i] <= arr[pivot]) {
				i++;
			}
			while (j > start && arr[j] > arr[pivot]) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		if (pivot != j) {
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
		}

		return j;
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int p = partion(arr, start, end);

			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);
		}
	}
}
