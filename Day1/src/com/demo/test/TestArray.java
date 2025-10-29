package com.demo.test;
import com.demo.myarray.*;

public class TestArray {
	public static void main(String[] args) {
		MyArray marray = new MyArray();
		
		marray.add(2);
		marray.add(3);
		marray.add(4);
		
		
		marray.add(23,1);
		
		System.out.println(marray.display());
		System.out.print(marray.getSize());
		
		
	}
}
