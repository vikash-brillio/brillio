//Write a Java function with 3 int parameters a, b, and c to sort these inputs in ascending order by
//comparing and exchanging their values. At the end of the program a <= b <= c must hold.



package com.brillio.training.exercises;

public class SumOfThreeNumbers {

	public static void main(String[] args) {
		int a=100,b=40,c=10;
		if (a > b) {
		      int temp = a;
		      a = b;
		      b = temp;
		    }

		    if (b > c) {
		      int temp = b;
		      b = c;
		      c = temp;
		    }

		    if (a > b) {
		      int temp = a;
		      a = b;
		      b = temp;
		    }

		    System.out.println("The sorted numbers are "
		      + a + " " + b + " " + c);
		  }
}

