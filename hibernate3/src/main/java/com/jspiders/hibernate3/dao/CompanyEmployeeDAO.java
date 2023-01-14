package com.jspiders.hibernate3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;
import com.jspiders.hibernate3.dto.CompanyDTO;
import com.jspiders.hibernate3.dto.EmployeeDTO;

public class CompanyEmployeeDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnections() {
		factory = Persistence.createEntityManagerFactory("ManyToOne");
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
			
			CompanyDTO company = new CompanyDTO();
			
			company.setId(1);
			company.setName("Accenture");
			company.setCity("Pune");
			manager.persist(company);
			
			EmployeeDTO employee1 = new EmployeeDTO();
			
			employee1.setId(1);
			employee1.setName("Pravin");
			employee1.setEmail("pravya@ac.com");
			employee1.setSalary(400);
			employee1.setCompany(company);
			
			manager.persist(employee1);
			
			EmployeeDTO employee2 = new EmployeeDTO();
			
			employee2.setId(2);
			employee2.setName("Shubham");
			employee2.setEmail("shubh@ac.com");
			employee2.setSalary(500);
			employee2.setCompany(company);
			
			manager.persist(employee2);	
			transaction.commit();
			
		} finally {
			closeConnections();
		}
	}
}
