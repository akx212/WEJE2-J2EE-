package com.jspiders.designpattern.object;

public class SingletonEager {
      static int objectCount;
      static SingletonEager singletonEager = new SingletonEager();
      private SingletonEager() {
    	  objectCount++;
      }
      public static SingletonEager getObject() {
    	  System.out.println("object created " + objectCount + " times");
		  return singletonEager;	  
      } 
}
