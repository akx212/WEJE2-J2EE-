package com.jspiders.springrest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;
import org.springframework.stereotype.Repository;

import com.jspiders.springrest.pojo.StudentPOJO;

@Repository
public class StudentRepository {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static String jpql;
	private static Query query;


	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
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
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction already committed");
			}
		}
	}

	public StudentPOJO add(StudentPOJO student) {
		openConnection();
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		closeConnection();
		return student;
	}

	public StudentPOJO search(int id) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = manager.find(StudentPOJO.class, id);
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public StudentPOJO remove(int id) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = manager.find(StudentPOJO.class, id);
		if (pojo != null) {
			manager.remove(pojo);
		}
		transaction.commit();
		closeConnection();
		return pojo;
	}

//	**************************************************************************

	public StudentPOJO delete(int id) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = manager.find(StudentPOJO.class, id);
		if (pojo != null) {
			manager.remove(pojo);
		}
		transaction.commit();
		closeConnection();
		return pojo;
		
	}

	public StudentPOJO update(StudentPOJO student) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = manager.find(StudentPOJO.class, student.getId());
		if(pojo!=null) {
			pojo.setName(student.getName());
			pojo.setEmail(student.getEmail());
			pojo.setContact(student.getContact());
			pojo.setAddress(student.getAddress());
			pojo.setUsername(student.getUsername());
			pojo.setPassword(student.getPassword());
			manager.persist(pojo);
		}
		transaction.commit();
		closeConnection();
		return pojo;
		
	}
	
	public List<StudentPOJO> getAll() {
		openConnection();
		transaction.begin();
		jpql = "from StudentPojo";
		query = manager.createQuery(jpql);
		List<StudentPOJO> pojos = (List<StudentPOJO>)query.getResultList();
		transaction.commit();
		closeConnection();
		return pojos;
		
	}



}
