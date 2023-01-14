package com.jspiders.adapterpattern.main;

import com.jspiders.adapterpattern.interfaces.CompanyEvents;
import com.jspiders.adapterpattern.object.Employee;

public class CompEmpAdapter extends Employee implements CompanyEvents {

	public static void main(String[] args) {
		
		CompEmpAdapter adapter = new CompEmpAdapter();
		adapter.womenDay();
	}
	
	public void womenDay() {
		CompEmpAdapter adapter = new CompEmpAdapter();
		adapter.setId(1);
		adapter.setName("Narayan");
		adapter.setEmail("naru143@gmail.com");
		System.out.println("The manager of event is: "+adapter.getName());
		
		CompEmpAdapter adapter1 = new CompEmpAdapter();
		adapter1.setId(2);
		adapter1.setName("Rashmika");
		adapter1.setEmail("rush420@gmail.com");
		System.out.println("The chief guest of event is: "+adapter1.getName());
		
//		System.out.println(adapter1.getEmail());
	}
	

}
