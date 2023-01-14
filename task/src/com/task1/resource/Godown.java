package com.task1.resource;

public class Godown {
    int Product;
    public Godown (int Product) {
    	System.out.println(Product + "Product Available");
    	this.Product = Product;
    }
    public int checkProduct() {
    	return this.Product;
    }
    public synchronized void orderProduct (int Product) {
    	System.out.println("Ordering" + Product + "Products");
    	if (Product > checkProduct()) {
			try {
				System.out.println(Product + " Product not Available .. Please Wait.");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    	this.Product -= Product;
    	System.out.println("Succesfully " + Product + "product purchased");
    	System.out.println(checkProduct() + "Products Available");
    }
    public synchronized void purchaseProduct (int Product) {
    	this.Product += Product;
    	System.out.println("Restoked" + Product + "prouct supply");
    	System.out.println(checkProduct() + "product Available");
    	this.notify();
    }
    
}
