package com.jspiders.multithreadingwaitandnotify.resource;

public class Pizza {
  int noOfPizza;
  public Pizza(int noOfPizza) {
	  System.out.println(noOfPizza + " pizza available ");
	  this.noOfPizza=noOfPizza;
  }
  public int CheckPizza() {
	  return this.noOfPizza;
  }
  public synchronized void OrderPizza(int noOfPizza) {
	  System.out.println(" ordering " + noOfPizza + " pizza ");
	  if (noOfPizza > CheckPizza()) {
		try {
			System.out.println(noOfPizza + " not available " + " please wait ");
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	  this.noOfPizza-=noOfPizza;
	  System.out.println(" succesful deliver " +  noOfPizza  + " pizzas ");
	  System.out.println(CheckPizza() + " pizzas available ");
  }
  public synchronized void bakePizza(int noOfPizza) {
	  this.noOfPizza +=noOfPizza; 
	  System.out.println(" baking " + noOfPizza + " pizzas ");
	  System.out.println(CheckPizza() + " pizzas available");
	  this.notify();
  }

}

