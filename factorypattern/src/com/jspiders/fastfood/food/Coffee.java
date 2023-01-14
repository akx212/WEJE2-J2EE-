package com.jspiders.fastfood.food;

import com.jspiders.fastfood.inter.FastFood;

public class Coffee implements FastFood{

	@Override
	public void orderFood() {
		
		System.out.println("Customer Order Coffee");
	}

}
