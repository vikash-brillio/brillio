package com.brillio.training.programs;

import com.brillio.training.entity.Telivision;

public class Program03 {

	public static void main(String[] args) {
		Telivision tv1= new Telivision();
		tv1.setProductId(12);
		tv1.setProductName("Sony Bravia");
		tv1.setUnitPrice(99990.0);
//		tv1.setScreenType("LED");
//		tv1.setSize(25);
//		
		//System.out.println(tv1);
		tv1.print();
	}
}
