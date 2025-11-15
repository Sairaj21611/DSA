package com.demo.test;
import java.util.Arrays;

import com.demo.array.*;
public class Array2Dtest {
	public static void main(String[] args) {
		int[][] arr = { {12,14,17,8},{22,16,19,22},{31,23,11,15},{16,27,13,18} };
		Array2D ar = new Array2D();
		
//		ar.display(arr);
//		ar.reverseRow(arr);
//		ar.display(arr);
	//	ar.printMaxOdd(arr);
		
		ar.sumOfAvgRowsColumns(arr);
	}

}
