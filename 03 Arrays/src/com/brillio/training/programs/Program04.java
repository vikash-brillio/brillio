package com.brillio.training.programs;

public class Program04 {

	public static void main(String[] args) {
		
		//array of 4 string
		String []names = {"Scott", "Miller", "Allen", "James"};
		
		//enhanced for loop (for-each loop)
		// introduced in Java 1.5
		
		for(String name: names){
			System.out.println(name);
			
		}
	}
}
