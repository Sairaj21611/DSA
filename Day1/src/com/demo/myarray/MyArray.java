package com.demo.myarray;

import java.util.Arrays;

public class MyArray {
	private int[] arr;
	private int count;

	public MyArray() {

		arr = new int[10];
		count = 0;
	}

	public MyArray(int[] arr, int count) {
		this.arr = arr;
		this.count = count;
	}

	public MyArray(int size) {
		arr = new int[size];
		count = 0;
	}

	public int getCapacity() {
		return arr.length;
	}

	public int getSize() {
		return count;
	}

	public boolean add(int x) {

		if (count < arr.length) {
			arr[count] = x;
			count++;
			return true;
		}
		return false;

	}

	public boolean add(int value, int pos) {
		if (count < arr.length && pos < count) {
			for (int i = count; i > pos; i--) {
				arr[i] = arr[i - 1];
			}
			arr[pos] = value;
			count++;
			return true;
		}
		return false;
	}

	public int searchVal(int value) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public boolean deleteByPos(int pos) {
		if (count < arr.length) {
			for (int i = count; i > pos; i--) {
				arr[i] = arr[i + 1];
			}
			arr[count - 1] = 0;
			return true;
		}
		return false;

	}

	public boolean deleteFirstOccurence(int value) {
		int index = searchVal(value);
		if (index != -1) {
			return deleteByPos(index);
		}
		return false;
	}

	public void rotateArray(boolean flag, int num) {
		if (flag) {
			for (int i = 0; i < num; i++) {
				int temp = arr[count - 1];
				for (int j = count - 1; j > 0; j--) {
					arr[j] = arr[j - 1];
				}
				arr[0] = temp;
			}

		} else {
			for (int i = count - 1; i > num; i--) {
				int temp = arr[0];
				for (int j = 0; j < count - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[count - 1] = temp;
			}
		}
	}

	public int[] reverseArray(boolean flag) {
		if (flag) {
			for (int i = 0, j = count - 1; i < j; i++, j--) {
				int temp = arr[i];
				arr[i] = arr[count - 1];
				arr[j] = temp;

				return arr;

			}
		} else {
			int arr1[] = new int[count];
			for (int i = 0, j = count - 1; i < j; i++, j--) {
				arr1[j] = arr[i];

			}
			return arr1;
		}
		return arr;
	}

	public int Max() {
		int max = arr[0];
		for (int i = 1; i < count - 1; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	

	public String display() {
		return Arrays.toString(arr);
	}

}
