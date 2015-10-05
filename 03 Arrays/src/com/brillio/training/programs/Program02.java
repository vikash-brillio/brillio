package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {

		int[][] nums = { 
				{ 20, 30 }, 
				{ 33, 4, 33 }, 
				{ 374, 55, 978, 3564, 23 }, 
				{ 22, 76 } };

		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}

}
