package com.jspiders.fastfood.main;

import java.util.Scanner;

import com.jspiders.fastfood.food.Burger;
import com.jspiders.fastfood.food.Coffee;
import com.jspiders.fastfood.food.Fries;
import com.jspiders.fastfood.food.Pasta;
import com.jspiders.fastfood.food.Pizza;
import com.jspiders.fastfood.inter.FastFood;

public class CafeMain {
     static boolean loop =true;
     static FastFood fastfood;
     
	public static void main(String[] args) {
	  while (loop) {
		  
		try {
			customerOrder().orderFood();
		} catch (NullPointerException e) {
		    System.out.println("Customer Order Nothing..");
		}
	}
	}

	public static FastFood customerOrder() {
	System.out.println("Select a Food Which on Menu:\n" +"1.Pizza\n" +"2.Burger\n"+"3.Pasta\n"+"4.Fries\n"+"5.Coffee");
		
	Scanner scanner = new Scanner(System.in);
	//scanner.close();
	int choise=scanner.nextInt();
	
	switch (choise) {
	case 1:
		fastfood = new Pizza();
	    loop=false;
	    return fastfood;
	case 2:
		fastfood = new Burger();
	    loop=false;
	    return fastfood;
	case 3:
		fastfood = new Pasta();
	    loop=false;
	    return fastfood;
	case 4:
		fastfood = new Fries();
	    loop=false;
	    return fastfood;
	case 5:
		fastfood = new Coffee();
	    loop=false;
	    return fastfood;
	default:
		System.out.println("Not in a list");
		loop=false;
		return fastfood;
	}
	}

}
