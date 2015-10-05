package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObjects {

	public static void main(String[] args) {

		Person p1; // a reference variable

		p1 = new Person();

		System.out.println("Name = " + p1.name);
		System.out.println("Age = " + p1.age);

	}

}
