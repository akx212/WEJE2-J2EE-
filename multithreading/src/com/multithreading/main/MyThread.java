package com.multithreading.main;

import com.multithreading.Threads.MyThread1;
import com.multithreading.Threads.MyThread2;

public class MyThread {

	public static void main(String[] args)
	{
	   MyThread1 myThread1 = new MyThread1();
	   myThread1.setName("Thread1");
	   System.out.println(myThread1.getName());
	   myThread1.setPriority(6);
	   MyThread2 myThread2 = new MyThread2();
	   Thread thread = new Thread(myThread2);
	   thread.setName("Thread2");
	   System.out.println(thread.getName());
	   thread.setPriority(8);
	   thread.start();
	   MyThread.start();
	   

	}

	private static void start() {
		// TODO Auto-generated method stub
		
	}

	
	
}
