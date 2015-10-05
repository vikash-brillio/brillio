//A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1
//and itself. Write a function that accepts two integers as parametrers and return the sum of all the prime
//numbers between the input numbers. If the first parameter is greater than the second one, then swap the
//inputs and perform the operations

package com.brillio.training.exercises;

public class SumOfPrimes {

	public static void main(String[] args) {
		int n1 = 50, n2 =-100;
		if (n1 < n2)
			sumofPrimes(n1, n2);
		else
			sumofPrimes(n2, n1);

	}

	public static void sumofPrimes(int n1, int n2) {
		int count=0,sum=0;
		for(int i=n1;i<n2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{	
				sum=sum+i;
			}
			count=0;
		}
		System.out.println("The Sum of Primes= "+sum);

	}

}
