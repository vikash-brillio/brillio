package com.brillio.training.exercises;

public class NearestSquareRoot {

	public static void main(String[] args) {
		 int num=40;
		int rNum=nearestSquareRoot(num);
		System.out.println(rNum);
	}

	public static int nearestSquareRoot(int num) {
		
		if(num<0) return -1;
			
		int expnum = (int) Math.round(Math.sqrt(num));
//		System.out.println(expnum);
		return expnum;
	}

}
