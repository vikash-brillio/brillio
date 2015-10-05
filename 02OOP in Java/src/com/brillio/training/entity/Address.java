package com.brillio.training.entity;

public class Address {

	private String street,area,city,state,country;
	public Address() {
		
		
	}
	public Address(String street, String area, String city, String state, String country) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void print() {

		System.out.println("Address: ");
		System.out.println(street);
		System.out.println(area);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		
	}
	

}








