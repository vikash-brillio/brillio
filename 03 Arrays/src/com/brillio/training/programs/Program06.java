package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program06 {

	public static void main(String[] args) {
		 
		Person p1=new Person(22, "Illa", "London");
		
		Person[] persons = {
				new Person(),
				new Person(7788, "John Scott", "Newyork"),
				new Person(7865, "Vikash Kumar", "Patna"),
				p1
		};
		
		p1.setName("John Doe");
		
	}
}
