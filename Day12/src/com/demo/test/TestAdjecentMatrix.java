package com.demo.test;

import java.util.Scanner;

public class TestAdjecentMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of vertices : ");
		int v = sc.nextInt();

		int[][] mygraph = new int[v][v];
		
		storeGraph(mygraph);
		displyMatrix(mygraph);
		
	}

	
	public static void storeGraph(int[][] mygraph) {
		Scanner sc = new Scanner (System.in);
		for(int i=0; i<mygraph.length; i++) {
			for(int j=0; j<mygraph[0].length; j++) {
				System.out.println(" is there any edge between "+i+" ------- "+j);
				mygraph[i][j] = sc.nextInt();
			}
		}
	}
	public static void displyMatrix(int[][] mygraph) {
		for(int i=0; i<mygraph.length; i++) {
			for(int j=0; j<mygraph[0].length; j++) {
				System.out.print(mygraph[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
}
