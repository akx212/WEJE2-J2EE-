package com.multithreading.main;

import com.multithreading.Threads.MyThread1;
import com.multithreading.Threads.MyThread2;

public class MyThreadMain 
{
   public static void main(String[] args) 
{
	MyThread1 myThread1 = new MyThread1();
	myThread1.start();
	
	MyThread2 myThread2 = new MyThread2();
	Thread thread = new Thread(myThread2);
	thread.start();
}
}
