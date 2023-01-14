package com.multithreading.Threads;

public class MyThread1 extends Thread
{
   public void run()
   {
	   System.out.println(this.getName());
	   for(int i=1;i<=5;i++)
	   {
		   System.out.println("MyThread1 is now runnning..");
	   }
   }
}
