package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {

	public static void increment(int[] ar,int by){
		for (int i = 0; i < ar.length; i++) {
			ar[i]+= by;
		}
	}
	
	
	public static void main(String[] args) {

		int []n;
		//int x;
		//n is a reference to an Array Object
		n= new int[3];
		
		//n = new int[3];
		//n = {12,22,556};
		
		n = new int[] { 48, 586, 383 };
		n[2]=12;
		n[0]=22;
		n[1] = 393;
		System.out.println(Arrays.toString(n));
		
		increment(n, 10);
		System.out.println(Arrays.toString(n));
		//n[3]= 39393; // throws a ArraysOutOfBoundsException()
		
	}

}
