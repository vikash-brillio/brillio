package com.brillio.training.exercises;

public class FibnocciNumber {

	public static void main(String[] args) {
		int num = 8;
		int element = validateNumber(num);
		System.out.println(element);
	}

	public static int validateNumber(int num) {
		if (num <= 0)
			return -1;
		if (num >= 100)
			return -2;
		int element = fibElements(num);
		return element;
	}

	public static int fibElements(int num) {
		int i = 3;
		int f1 = 0;
		int f2 = 1;
		if (num == 1)
			return 0;
		if (num == 2)
			return 1;
		// System.out.print(0+" "+1+" ");
		while (i <= num) {
			f2 = f1 + f2;
			// System.out.print(f2 + " ");
			f1 = f2 - f1;
			i++;
		}
		return f2;
	}

}
