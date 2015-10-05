package com.brillio.training.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	
	private int id;
	private String name;
	private String birthDate;
	private String city;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String birthDate, String city) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return stringToDate(birthDate);
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	private static Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			return null;
		}
	}
}
