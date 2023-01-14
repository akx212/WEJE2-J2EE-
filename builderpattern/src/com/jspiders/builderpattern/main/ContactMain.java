package com.jspiders.builderpattern.main;

import com.jspiders.builderpattern.builder.ContactBuilder;
import com.jspiders.builderpattern.object.Contact;

public class ContactMain {

	public static void main(String[] args) {
		Contact contact = new ContactBuilder().fname("Mrunal").mNo(9876543211l).getContact();
        System.out.println(contact);
        System.out.println();
        
        Contact contact2 = new ContactBuilder().mNo(9988776655l).lName("kohli").fname("virat").getContact();
        System.out.println(contact2);
	}

}
