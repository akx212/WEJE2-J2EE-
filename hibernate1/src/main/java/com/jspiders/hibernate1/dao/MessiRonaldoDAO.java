package com.jspiders.hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate1.dto.MessiDTO;
import com.jspiders.hibernate1.dto.RonaldoDTO;

public class MessiRonaldoDAO {
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
			
			RonaldoDTO ronaldo = new RonaldoDTO();
			ronaldo.setId(1);
			ronaldo.setName("Ronaldo");
			ronaldo.setEmail("siuuu@fifa.com");
			ronaldo.setAge(34);
			ronaldo.setClub("Manchester");
			
			manager.persist(ronaldo);
			
			MessiDTO messi = new MessiDTO();
			messi.setId(1);
			messi.setName("Messi");
			messi.setEmail("Goat@fifa.com");
			messi.setAge(35);
			messi.setClub("Barcelona");
			
			manager.persist(messi);
			transaction.commit();
			
		} finally {
		    closeConnection();
		}
	}

}
