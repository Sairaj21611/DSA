package com.demo.test;
import com.demo.search.*;

public class TestSearch {
	public static void main(String[] args) {
		
	
	    String[] str1 = {"apple","banana","dragonfruit","kiwi","orange"} ;
	    
	    int pos1 = StringSearch.binarySearchSorted(str1,"orange");
	    
	    if(pos1 == -1) {
	    	System.out.println("Position not found");
	    }
	    else {
	    	System.out.println("position :" + pos1);
	    }
	}    

}
