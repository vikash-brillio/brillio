package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program07 {

	public static void main(String[] args) {
		
		Person[] persons = new Person[3];
		
		// must create a Person object before using it for
		//invoking methods
		
		//this line is equivalent to null.setId(4)
		// and will throw an exception of type NullPointerException
		persons[0]=new Person();
		persons[0].setId(4);
		persons[0].setCity("Bangalore");
		persons[0].setName("vikash");
		
		System.out.println(persons[1]);
		
	}
}
