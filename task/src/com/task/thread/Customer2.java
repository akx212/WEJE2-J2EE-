package com.task.thread;

import com.task.resource.GodDown;

public class Customer2 extends Thread{
     GodDown goddown;

	public Customer2(GodDown goddown) {
		super();
		this.goddown = goddown;
	}
     public void run() {
    	 goddown.orderProduct(70);
     }
}
