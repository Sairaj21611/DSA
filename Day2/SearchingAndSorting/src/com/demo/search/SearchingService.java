package com.demo.search;

public class SearchingService {

	public static int sequentialSearch(int[] arr, int pos) {
		for (int i = 0; i < arr.length; i++) {
			if (i == pos) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int search) {

		int high = arr.length - 1;
		int low = 0;
		int mid = 0;

		while (low <= high) {
			
			mid = (high+low)/2;
			if (arr[mid] == search) {
				System.out.println("In the codition");
				return mid;
			}
			if (search < arr[mid]) {
				high = mid - 1;

			} else
				low = mid + 1;
		}
		return -1;
	}
//	public static int binarySearch(int[] arr, int search) {
//	    int low = 0;
//	    int high = arr.length - 1;
//
//	    while (low <= high) {
//	        int mid = low + (high - low) / 2;
//	        
//	        if (arr[mid] == search) {
//	            System.out.println("In the condition");
//	            return mid;
//	        }
//	        if (search < arr[mid]) {
//	            high = mid - 1;
//	        } else {
//	            low = mid + 1;
//	        }
//	    }
//	    return -1;
//	}

	public static int binaryRecursiveSearch(int[] arr1, int search, int low,int high) {
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr1[mid]==search) {
				return mid;
			}
			if(search <arr1[mid]) {
				
				return binaryRecursiveSearch(arr1,search,low,mid-1);
				
			}else {
				return binaryRecursiveSearch(arr1,search,mid+1,high);
			}
		}
		
		return -1;
	}


}
