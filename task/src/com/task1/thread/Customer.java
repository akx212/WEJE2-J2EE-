package com.task1.thread;

import com.task1.resource.Godown;

public class Customer extends Thread{
    Godown godown;
    int Product;
	public Customer(Godown godown, int product) {
		super();
		this.godown = godown;
		this.Product = product;
	}
    public void run() {
    	godown.orderProduct(Product);
    }
}
