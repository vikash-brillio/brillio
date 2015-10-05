package com.brillio.training.exercises;

public class ArrayMerging {

	public static void main(String[] args) {

		int[] ar1 = { 10, 25, 20, 69 };
		int[] ar2 = { 13, 67, 34, 58, 9 };

		int arr3[] = mergeArray(ar1, ar2);
		
		
		System.out.print("[ ");
		for (int i = 0; i < arr3.length; i++) {

			System.out.print(arr3[i] + ", ");
		}
		System.out.print("\b\b]");
	}

	

	public static int[] mergeArray(int[] ar1, int[] ar2) {

		
		int j = 0,count=0;
		for (int i = 0; i < ar1.length; i++) {

			if (ar1[i] % 2 != 0) {

				count++;
			}
		}
		for (int i = 0; i <ar2.length; i++) {

			if (ar2[i] % 2 != 0) {

				count++;
			}
		}
		
		int arr3[] = new int[count];
		
		
		for (int i = 0; i < ar1.length; i++) {

			if (ar1[i] % 2 != 0) {

				arr3[j++] = ar1[i];
			}
		}

		for (int i = 0; i < ar2.length; i++) {

			if (ar2[i] % 2 != 0) {
				arr3[j++] = ar2[i];
			}
			
			
		}
		return arr3;

		
	
	}	
}
