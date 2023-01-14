package com.jspiders.hibernate4.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate4.dto.CollegeDTO;
import com.jspiders.hibernate4.dto.UniversityDTO;

public class CollegeUniversityDAO {

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
			
			CollegeDTO college1 = new CollegeDTO();
			college1.setId(101);
			college1.setName("PARNER");
			college1.setCity("AHMEDNAGAR");
			college1.setContact(2488221522L);
			
			CollegeDTO college2 = new CollegeDTO();
			college2.setId(102);
			college2.setName("WAKAD");
			college2.setCity("PUNE");
			college2.setContact(2488221523L);
			
			CollegeDTO college3 = new CollegeDTO();
			college3.setId(103);
			college3.setName("THANE");
			college3.setCity("MUMBAI");
			college3.setContact(2488221524L);
			
			UniversityDTO university1 = new UniversityDTO();
			university1.setId(111);
			university1.setName("SPPU");
			university1.setCity("PUNE");
			university1.setEmail("sppu@pune.com");
			
			UniversityDTO university2 = new UniversityDTO();
			university2.setId(112);
			university2.setName("BALBHARTI");
			university2.setCity("MUMBAI");
			university2.setEmail("bal@mum.com");
			
			UniversityDTO university3 = new UniversityDTO();
			university3.setId(113);
			university3.setName("IIT");
			university3.setCity("KANPUR");
			university3.setEmail("iit@gold.com");
			
			List <UniversityDTO> university = Arrays.asList(university1,university2,university3);
			
			college1.setUniversity(university);
			college2.setUniversity(university);
			college3.setUniversity(university);
			
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
