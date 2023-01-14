package com.jspiders.hibernate3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate3.dto.PlayerDTO1;
import com.jspiders.hibernate3.dto.SportDTO;

public class SportPlayerDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToOne");
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
			
			SportDTO sport =new SportDTO();
	//		sport.setId(1);
			sport.setName("BCCI");
			sport.setOrganization("IPL");
			manager.persist(sport);
			
			PlayerDTO1 player1 = new PlayerDTO1();
	 //    	player1.setId(1);
			player1.setName("Mayank");
			player1.setTeam("Punjab");
			player1.setSalary(160000.00);
			player1.setSport(sport);
			manager.persist(player1);
			
			PlayerDTO1 player2 = new PlayerDTO1();
		//	player2.setId(2);
			player2.setName("Warner");
			player2.setTeam("Delhi");
			player2.setSalary(120000.00);
			player2.setSport(sport);
			manager.persist(player2);
			
			transaction.commit();	
		} finally {
			closeConnection();
		}
	}
}
