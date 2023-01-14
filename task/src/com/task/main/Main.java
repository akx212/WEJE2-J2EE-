package com.task.main;

import com.task.resource.GodDown;
import com.task.thread.Customer1;
import com.task.thread.Customer2;
import com.task.thread.Supplier;

public class Main {

	public static void main(String[] args) {
	  GodDown goddown =new GodDown(100);
	  Customer1 customer1 = new Customer1(goddown);
	  Customer2 customer2 = new Customer2(goddown);
	  Supplier supplier = new Supplier(goddown);
	  customer1.start();
	  customer2.start();
	  supplier.start();

	}

}
