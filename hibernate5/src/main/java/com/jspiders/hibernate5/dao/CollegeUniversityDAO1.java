package com.jspiders.hibernate5.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate5.dto.CollegeDTO1;
import com.jspiders.hibernate5.dto.UniversityDTO1;

public class CollegeUniversityDAO1 {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnections() {
		factory = Persistence.
				createEntityManagerFactory("ManyToMany");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnections() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println
				("Transaction is committed.");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			
			openConnections();
			transaction.begin();
			
			CollegeDTO1 college1 = new CollegeDTO1();
			college1.setId(101);
			college1.setName("PARNER");
			college1.setCity("AHMEDNAGAR");
			college1.setContact(2488221522L);
			
			CollegeDTO1 college2 = new CollegeDTO1();
			college2.setId(102);
			college2.setName("WAKAD");
			college2.setCity("PUNE");
			college2.setContact(2488221523L);
			
			CollegeDTO1 college3 = new CollegeDTO1();
			college3.setId(103);
			college3.setName("THANE");
			college3.setCity("MUMBAI");
			college3.setContact(2488221524L);
			
			UniversityDTO1 university1 = new UniversityDTO1();
			university1.setId(111);
			university1.setName("SPPU");
			university1.setCity("PUNE");
			university1.setEmail("sppu@pune.com");
			
			UniversityDTO1 university2 = new UniversityDTO1();
			university2.setId(112);
			university2.setName("BALBHARTI");
			university2.setCity("MUMBAI");
			university2.setEmail("bal@mum.com");
			
			UniversityDTO1 university3 = new UniversityDTO1();
			university3.setId(113);
			university3.setName("IIT");
			university3.setCity("KANPUR");
			university3.setEmail("iit@gold.com");
			
			List <UniversityDTO1> university = Arrays.asList(university1,university2,university3);
			
			college1.setUniversity(university);
			college2.setUniversity(university);
			college3.setUniversity(university);
			
			List <CollegeDTO1> college = Arrays.asList(college1,college2,college3);
			
			university1.setCollege(college);
			university2.setCollege(college);
			university2.setCollege(college);
			
			manager.persist(university1);
			manager.persist(university2);
			manager.persist(university3);
			manager.persist(college1);
			manager.persist(college2);
			manager.persist(college3);
			transaction.commit();
			
		} finally {
			closeConnections();
		}
	}
}
