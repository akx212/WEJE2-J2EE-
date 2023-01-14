package com.jspiders.hibernate_JPQL.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;
import com.jspiders.hibernate_JPQL.dto.AccountDTO;

public class AccountDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static String query;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("jpql");
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
			
			AccountDTO account1 =new AccountDTO();
			account1.setAccountNo(12345678L);
			account1.setAccountHolder("Vijay Malya");
			account1.setBank("Punjab National");
			account1.setBranch("Dharavi");
			account1.setCity("Mumbai");
			account1.setIfsc("PNB001129");
			
			AccountDTO account2 =new AccountDTO();
			account2.setAccountNo(21345678L);
			account2.setAccountHolder("Harshad Mehta");
			account2.setBank("State Bank Of India");
			account2.setBranch("Surat");
			account2.setCity("Gujrat");
			account2.setIfsc("SBIN0001124");
			
			AccountDTO account3 =new AccountDTO();
			account3.setAccountNo(23456789L);
			account3.setAccountHolder("Nirav Modi");
			account3.setBank("Bank of Maharshtra");
			account3.setBranch("Wakad");
			account3.setCity("Pune");
			account3.setIfsc("MAHA001122");
			
			manager.persist(account1);
			manager.persist(account2);
			manager.persist(account3);
			
			//select query
			query ="from AccountDTO where accountHolder like '%y%' ";
			Query createQuery=manager.createQuery(query);
     		List accounts = createQuery.getResultList();
			
			for (int i = 0; i < accounts.size(); i++) {
				System.out.println(accounts.get(i));
			}
			
			//update Query
			query ="Update AccountDTO set bank='PNB' where id=1 ";
			createQuery = manager.createQuery(query);
			int resultInt = createQuery.executeUpdate();
			System.out.println(resultInt + "row(s)Affected");
			
			//Delete Query
			query = "delete from AccountDTO where id=1";
			createQuery = manager.createQuery(query);
		    resultInt = createQuery.executeUpdate();
			System.out.println(resultInt + "row(s)Affected");
						
			transaction.commit();
			
		} finally {
			closeConnection();  
		}
	}
}
