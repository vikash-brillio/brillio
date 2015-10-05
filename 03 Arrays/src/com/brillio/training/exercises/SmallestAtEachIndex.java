package com.brillio.training.exercises;

public class SmallestAtEachIndex {

	public static void main(String[] args) {

		int []arr1={10,20,30,546,87,1,39,90,54};
		int []arr2={23,20,55,65,48};
		
		int arr3[]=smallestIndexNumber(arr1,arr2);
		System.out.print("[ ");
		for (int i = 0; i < arr3.length; i++) {
			
			System.out.print(arr3[i]+", ");
		}
		System.out.print("\b\b]");
	}

	public static int[] smallestIndexNumber(int[] arr1, int[] arr2) {

		int size=arr1.length>arr2.length ? arr1.length:arr2.length;
		int smallsize=arr1.length<arr2.length ? arr1.length:arr2.length;
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			if(i<smallsize)
			arr[i]=arr1[i]<arr2[i]?arr1[i]:arr2[i];
			else if(arr1.length>smallsize)
				arr[i]=arr1[i];
			else
				arr[i]=arr2[i];
		}
		return arr;
	}

}
