package com.brillio.training.programs;

import com.brillio.training.entity.Product;

public class ProductTest01 {

	public static void main(String[] args) {

		Product p1;
		p1 = new Product();
		p1.setId(123);
		p1.setName("Bisileri");
		p1.setDescription("MIneral water");
		p1.setPrice(25.0);
		p1.setUnitsInStock(128);
		//overloaded or parameterized constructor
		//helps creating objects with initial custom values
		Product p2 = new Product(78, "Chai", "A.K.A", 78.9, 120);
		System.out.println(p1);
		System.out.println(p2);
	}

}
