package com.task1.thread;

import com.task1.resource.Godown;

public class Supplier extends Thread {
   Godown godown;
   int Product;
public Supplier(Godown godown, int product) {
	super();
	this.godown = godown;
	this.Product = product;
}
   public void run() {
	   godown.purchaseProduct(Product);
   }
}
