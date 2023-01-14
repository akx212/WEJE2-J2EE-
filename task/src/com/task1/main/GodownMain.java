package com.task1.main;

import com.task1.resource.Godown;
import com.task1.thread.Customer;
import com.task1.thread.Supplier;

public class GodownMain {

	public static void main(String[] args) {
	   Godown godDown =new Godown(100);
	   Customer customer = new Customer(godDown, 50);
	   Customer customer2 =new Customer(godDown,75);
	   Supplier supplier = new Supplier(godDown,50);
	   
	   customer.start();
	   customer2.start();
	   supplier.start();

	}

}
