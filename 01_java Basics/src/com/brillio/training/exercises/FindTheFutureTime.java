//Write a Java function to print the future time. The function takes 4 arguments. The first 3 arguments (h, m,
//s) represent a given time. The 4th argument is the number of seconds to add to the given time to find the
//future time.
//If the values for h, m, and s are not valid, an error message should be printed as "Invalid time input".
//If the 4th argument is negative, it should be converted into it's absolute value
package com.brillio.training.exercises;

public class FindTheFutureTime {
	
	public static void main(String[] args) {
		int h=11,m=9,s=23,nos=-200;
		boolean b=validation(h,m,s);
		if(b)
		{
			showFutureTime(h,m,s,nos);
		}
		else
		{
			System.out.println("Error:-check ur inputs!!!");
		}
	}

	public static void showFutureTime(int h, int m, int s, int nos) {
		int totalseconds= h*60*60 + m * 60 + s + Math.abs (nos); 
		h=totalseconds / 3600;
		m= (totalseconds % 3600)/60;
		s= ((totalseconds % 3600)%60);
		System.out.println( h+":"+m+":"+s);
		
	}

	public static boolean validation(int h, int m, int s) {
		if((h>24&&h<0) || (m >60&&m<0) || (s>60 && s<0))
		{
			return false;
		}
		else
		return true;
	}

}
