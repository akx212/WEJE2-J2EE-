package com.task.thread;

import com.task.resource.GodDown;

public class Customer1 extends Thread{
    GodDown goddown;
  public Customer1 (GodDown goddown) {
	  super();
	  this.goddown=goddown;
  }
  public void run() {
	  goddown.orderProduct(50);
  }
}
