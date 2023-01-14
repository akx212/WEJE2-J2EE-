package com.jspiders.sleepmethodDemo;

import javax.print.DocFlavor.CHAR_ARRAY;

public class SleepDemo {

	public static void main(String[] args) {
		String demo="This is magic of sleep() method ..";
		char[]charArray=demo.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
