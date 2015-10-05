package com.brillio.training.exercises;

public class Student {

	private int rollNumber;
	private String name;
	private MarksData marksData[] = new MarksData[2];

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String name, MarksData[] marksData) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marksData = marksData;
	}

}
