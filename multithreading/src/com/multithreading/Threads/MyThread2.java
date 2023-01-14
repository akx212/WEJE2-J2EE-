package com.multithreading.Threads;

public class MyThread2 implements Runnable
{
   @Override
public void run()
{
	   System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=5;i++)
	{
		System.out.println("Mythread2 is now running..!!");
	}
	
}
}
