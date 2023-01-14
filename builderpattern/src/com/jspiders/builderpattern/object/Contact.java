package com.jspiders.builderpattern.object;

public class Contact {
   String firstname;
   String middleName;
   String lastName;
   long mobileNo;
   long landlineNo;
   String email;
   String address;
   String company;
   String dob;
public Contact(String firstname, String middleName, String lastName,
		long mobileNo, long landlineNo, String email,
		String address, String company, String dob) {
	super();
	this.firstname = firstname;
	this.middleName = middleName;
	this.lastName = lastName;
	this.mobileNo = mobileNo;
	this.landlineNo = landlineNo;
	this.email = email;
	this.address = address;
	this.company = company;
	this.dob = dob;
}
@Override
public String toString() {
	return "Contact [firstname=" + firstname + ", middleName=" + middleName + ","
			+ " lastName=" + lastName + ", mobileNo="+ mobileNo + ", "
			+ "landlineNo=" + landlineNo + ", email=" + email + ","
			+ " address=" + address + ", company="+ company + ", dob=" + dob + "]";
}
   
}
