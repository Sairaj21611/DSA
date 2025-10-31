package com.demo.search;

public class StringSearch {

	public static int sequentialSearch(String[] str, String search) {

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(search)) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearchSorted(String[] str, String string) {
		int high = str.length-1;
		int low = 0;
		int mid = 0;
		while (low <= high) {
			mid=(high+low)/2;
			
			int result = string.compareTo(str[mid]);
			
			if(result == 0) {
				System.out.println("Condition Satisfied");
				return mid;
			}
		      if(result<0){
				high = mid-1;
			}
			else {
				low = mid +1;
			}
		}
			return -1;
	}

}
