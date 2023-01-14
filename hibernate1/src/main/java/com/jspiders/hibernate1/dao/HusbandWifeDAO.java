package com.jspiders.hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate1.dto.HusbandDTO;
import com.jspiders.hibernate1.dto.WifeDTO;

public class HusbandWifeDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToOne");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		try {
			transaction.rollback();
		} catch (TransactionException e) {
			 System.out.println("Transaction is committed");
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			WifeDTO wife = new WifeDTO();
			wife.setId(1);
			wife.setName("Anjali");
			wife.setEmail("anju@bb.com");
			wife.setAge(26);
			wife.setContact(9876543210L);
			
			manager.persist(wife);
			
			HusbandDTO husband = new HusbandDTO();
			husband.setId(1);
			husband.setName("Rahul");
			husband.setEmail("rahul@bb.com");
			husband.setAge(27);
			husband.setContact(8976543210L);
			
			manager.persist(husband);
			
			transaction.commit();
			
		} finally {
			closeConnection();
		}
	}
}

