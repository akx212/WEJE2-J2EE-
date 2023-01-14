package com.jspiders.serializationdesrialization.resource;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1663922112476212078L;
    int id;
    String userName;
    String password;

    public User(int id, String userName, String password) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
}
    public String toString() {
    	return "User[id=" + id +" ,userName=" + userName +" ,password="+ password +"]";
    }
}
