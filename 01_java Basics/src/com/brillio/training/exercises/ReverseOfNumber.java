package com.brillio.training.exercises;

public class ReverseOfNumber {

	public static void main(String[] args) {

		int num = -123;
		int rNum = reverseNumber(num);
		System.out.println(rNum);
	}

	public static int reverseNumber(int num) {
		int temp = Math.abs(num);
		int reverseNumber = 0;
		while (temp > 0) {
			int rem = temp % 10;
			temp = temp / 10;
			reverseNumber = reverseNumber * 10 + rem;
		}
		if (num < 0)
			return reverseNumber * (-1);
		else
			return reverseNumber;
	}

}
