package com.task.thread;

import com.task.resource.GodDown;

public class Supplier extends Thread {
    GodDown goddown;

	public Supplier(GodDown goddown) {
		super();
		this.goddown = goddown;
	}
    public void run() {
    	goddown.orderSupply(50);
    }
}
