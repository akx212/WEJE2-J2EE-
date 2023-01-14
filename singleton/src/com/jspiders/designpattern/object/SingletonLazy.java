package com.jspiders.designpattern.object;

public class SingletonLazy {
    static SingletonLazy singletonLazy;
    int objectCount;
    private SingletonLazy() {
    	objectCount++;
    	System.out.println("object created " + objectCount + " times");
    }
    public static SingletonLazy getObject() {
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
			return singletonLazy;
		}
		return singletonLazy;
    }
}
