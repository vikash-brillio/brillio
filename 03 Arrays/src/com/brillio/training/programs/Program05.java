package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program05 {

	// persons is not a reference to a Person object
	//but it is a reference to an array of Person object
	public static void main(String[] args) {
		
		Person[] persons;
		
		persons = new Person[3];
		persons[0] = new Person(1, "Vikash", "Patna") ;
		persons[1] = new Person(1, "Scott", "Dallas") ;
		persons[2] = new Person(1, "James", "Chicago") ;
		
		for (Person p1 : persons) {
			System.out.println(p1);
		}
	}
	
}
