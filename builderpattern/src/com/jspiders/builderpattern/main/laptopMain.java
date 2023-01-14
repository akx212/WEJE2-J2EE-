package com.jspiders.builderpattern.main;

import com.jspiders.builderpattern.builder.LaptopBuilder;
import com.jspiders.builderpattern.object.Laptop;

public class laptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Laptop laptop  =new LaptopBuilder().brand("ACER").color("Golden").price(45000.00)
        		.getLaptop();
        System.out.println(laptop);
	}

}
