//Write a function to accept an integer and return a number made up of digits from the input number in
//ascending order.
//If the input is a negative, then the change the order to descending.

package com.brillio.training.exercises;

public class DigitOrdering {

	public static void main(String[] args) {

		int number = 15243, i = 0;
		int temp = number;
		number = Math.abs(number);
		int num[] = new int[10];

		while (number > 0) {
			num[i++] = number % 10;
			number = number / 10;
		}

		for (int j = 0; j < (i - 1); j++) {
			for (int d = 0; d < i - j - 1; d++) {
				if (num[d] > num[d + 1]) /* For decreasing order use < */
				{
					int swap = num[d];
					num[d] = num[d + 1];
					num[d + 1] = swap;
				}
			}
		}
		if (temp > 0) {
			for (int j = 0; j < i; j++) {
				System.out.print(num[j]);
			}
		} else {
			for (int j = i - 1; j >= 0; j--) {
				System.out.print(num[j]);
			}
		}
	}

}
