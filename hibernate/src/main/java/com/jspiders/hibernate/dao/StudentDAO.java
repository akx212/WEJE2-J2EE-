package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.hibernate.TransactionException;
import com.jspiders.hibernate.dto.StudentDTO;

public class StudentDAO {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		StudentDTO student = new StudentDTO();
		student.setId(1);
		student.setName("Ajit");
		student.setEmail("ajit@gmail.com");
		student.setContact(9876543210L);
		student.setCity("Pune");
		
		entityManager.persist(student);
		
		entityTransaction.commit();
		
		entityManagerFactory.close();
		
		entityManager.close();
		
		try {
			entityTransaction.rollback();
		} catch (TransactionException e) {
			
		     System.out.println("Transaction is committed");
		}	
	}
}
