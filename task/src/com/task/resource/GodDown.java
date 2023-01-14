package com.task.resource;

public class GodDown {
  int storeProduct;
  public GodDown (int storeProduct) {
	  System.out.println( storeProduct + " Product Available ");
	  this.storeProduct=storeProduct;
  }
	public int checkProduct() {
		return this.storeProduct;
	}
	public synchronized void orderProduct(int storeProduct) {
		System.out.println(" Customer " + " ordering " + storeProduct + " product ");
		if (storeProduct > checkProduct()) {
			try {
				System.out.println(storeProduct + " Product Not Avasilable " + "Please Wait");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.storeProduct -= storeProduct;
		System.out.println(" Succesful Deliver " + storeProduct + " product ");
		System.out.println(checkProduct() + " product Available ");
	}
	    public synchronized void orderSupply(int storeProduct) {
	    	this.storeProduct += storeProduct;
	    	System.out.println(" supplying " + storeProduct + " order");
	    	System.out.println(checkProduct() + " Product Available ");
	    	this.notify();
	    }
		
	}


