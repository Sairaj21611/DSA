package com.demo.array;

import java.util.Arrays;

import com.demo.test.*;

public class Array2D {

	public void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void reverseRow(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr.length - 1;

			while (start < end) {
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;

				start++;
				end--;
			}
		}
		System.out.println("\n reverse array : ");
	}

	private int findOddMax(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
		}
		return max;
	}

	public void printMaxOdd(int[][] arr) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int ans = findOddMax(arr[i]);
			temp[i] = ans;
			System.out.println(temp[i]);
		}
	}

	public void sumOfRowsColumns(int arr[][]) {
		int[] row = new int[arr.length];
		int[] column = new int[arr[0].length];
		int number[] = new int [arr[0].length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				row[i] += arr[i][j];
				column[j] += arr[i][j];
				number[j] += 1;
			}
			row[i] = row[i]/arr[i].length;
		}
		System.out.println(Arrays.toString(row));
		System.out.println(Arrays.toString(column));
		
		for(int i=0; i<column.length; i++) {
			column[i] = column[i]/number[i];
		}
		System.out.println(Arrays.toString(row));
		System.out.println(Arrays.toString(column));
		
	}

	private int averageRow(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			
		}
		int avg = sum/arr.length;
		return avg;
	}
}
