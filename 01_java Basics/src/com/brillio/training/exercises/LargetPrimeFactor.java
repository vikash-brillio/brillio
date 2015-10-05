package com.brillio.training.exercises;

public class LargetPrimeFactor {
	public static void main(String args[]) {

		System.out.print(largestPrimeFactor(13));

	}

	public static int largestPrimeFactor(long num) {
		int i;
		long Temp = num;
		if (num <= 1) return -1;
		if (isPrime(num)) return -2;
			for (i = 2; i <= Temp; i++) {
				if (Temp % i == 0) {
					Temp = Temp / i;
					i--;
				}
			}
		return i;
	}

	public static boolean isPrime(long n1) {
		int count = 0;
		for (long j = 1; j <= n1; j++) {
			if (n1 % j == 0) {
				count++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;

	}

}
