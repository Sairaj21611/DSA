package com.demo.test;
import java.util.stream.IntStream;
import com.demo.sorting.BubbleSort;

public class BubbleSortTest {
	public static void main(String[] args) {

		int[] arr = { 4, 25, 32, 98, 12, 87, 12, 9, 45, 1 };

		BubbleSort.bubbleSort(arr);
		IntStream.of(arr).forEach(e -> System.out.print(e + "  "));

		
		BubbleSort.modifiedBubbleSort(arr);
		IntStream.of(arr).forEach(e -> System.out.print(e + "  "));
	}
}
