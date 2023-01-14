package com.jspiders.hibernate2.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspiders.hibernate2.dto.FootballDTO;
import com.jspiders.hibernate2.dto.PlayerDTO;

public class FootballPlayerDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToMany");
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
			
			FootballDTO football = new FootballDTO();
		//	football.setId(1);
			football.setName("Football");
			football.setOrganization("Sport");
			
			PlayerDTO player1 = new PlayerDTO();
		//	player1.setId(1);
			player1.setName("Messi");
			player1.setOrganization("Argentina");
			manager.persist(player1);
			
			PlayerDTO player2 = new PlayerDTO();
		//	player2.setId(2);
			player2.setName("Ronaldo");
			player2.setOrganization("Portugal");
			manager.persist(player2);
			
			PlayerDTO player3 = new PlayerDTO();
		//	player3.setId(3);
			player3.setName("Neymar");
			player3.setOrganization("Brazil");
			manager.persist(player3);
			
			List <PlayerDTO> player = Arrays.asList(player1,player2,player3);
			
			football.setPlayer(player);
			manager.persist(football);
			manager.persist(player1);
			manager.persist(player2);
			manager.persist(player3);
			transaction.commit();
			
			} finally {
			   closeConnection();
		}
	}
}
